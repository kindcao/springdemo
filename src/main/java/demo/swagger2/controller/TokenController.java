package demo.swagger2.controller;

import demo.swagger2.auth.annotation.Authorization;
import demo.swagger2.auth.annotation.CurrentUser;
import demo.swagger2.auth.model.ResultModel;
import demo.swagger2.auth.model.ResultStatus;
import demo.swagger2.auth.model.TokenModel;
import demo.swagger2.auth.repository.User2;
import demo.swagger2.auth.repository.UserRepository;
import demo.swagger2.auth.tokenmanger.TokenManager;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取和删除token的请求地址，在Restful设计中其实就对应着登录和退出登录的资源映射
 * Created by kind on 2017/8/10.
 */
@Api(value = "Swagger2应用", description = "简单的认证示例")
@RestController
@RequestMapping("/token")
public class TokenController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TokenManager tokenManager;

    @ApiOperation(value = "用户登录生成Token", notes = "根据username/password进行登录并返回token值")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "User Name", dataType = "string", required = true, defaultValue = "admin", paramType = "query"),
            @ApiImplicitParam(name = "password", value = "Password", dataType = "string", required = true, defaultValue = "password", paramType = "query") })
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<ResultModel> login(@RequestParam String username, @RequestParam String password) {
        Assert.notNull(username, "username can not be empty");
        Assert.notNull(password, "password can not be empty");
        User2 user2 = userRepository.findByUsername(username);
        if (user2 == null) {
            //提示用户名不存在
            return new ResponseEntity<ResultModel>(ResultModel.error(ResultStatus.USERNAME_NOT_FOUND),
                    HttpStatus.NOT_FOUND);
        } else if (!user2.getPassword().equals(password)) {
            //提示密码错误
            return new ResponseEntity<ResultModel>(ResultModel.error(ResultStatus.PASSWORD_ERROR),
                    HttpStatus.NOT_FOUND);
        }
        //生成一个token，保存用户登录状态
        TokenModel model = tokenManager.createToken(user2.getId());
        return new ResponseEntity<ResultModel>(ResultModel.ok(model), HttpStatus.OK);
    }

    @Authorization
    @ApiOperation(value = "用户退出删除Token", notes = "用户退出删除Token")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "authorization", value = "authorization", dataType = "string", required = true, defaultValue = "1_d41699decfa7401ca58dd85c5452f1ff", paramType = "header") })
    @RequestMapping(value = "/logout", method = RequestMethod.DELETE)
    public ResponseEntity<ResultModel> logout(@CurrentUser User2 user2) {
        tokenManager.deleteToken(user2.getId());
        return new ResponseEntity<ResultModel>(ResultModel.ok(), HttpStatus.OK);
    }

    @Authorization
    @ApiOperation(value = "查询所有用户", notes = "查询所有用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "authorization", value = "authorization", dataType = "string", required = true, defaultValue = "1_d41699decfa7401ca58dd85c5452f1ff", paramType = "header") })
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public ResponseEntity<ResultModel> findAll(@CurrentUser User2 user2) {
        return new ResponseEntity<ResultModel>(ResultModel.ok(userRepository.findAll()), HttpStatus.OK);
    }


}