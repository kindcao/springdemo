package demo.swagger2.controller;

import demo.swagger2.vo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;
import springfox.documentation.annotations.ApiIgnore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/**
 * Created by kind on 2017/8/8.
 */
@Api(value = "Swagger2应用",
        description = "简单的Swagger2应用示例，提供User对象的CRUD操作")
@RestController
@RequestMapping("/user")
public class UserController {

    private final List<User> list = new ArrayList<User>();

    public UserController() {
        list.add(new User(5L, "test5", "pwd5"));
        list.add(new User(10L, "user10", "pwd10"));
        list.add(new User(15L, "name15", "pwd15"));
        list.add(new User(20L, "kind20", "pwd20"));
        list.add(new User(25L, "UserName25", "pwd25"));
    }

    @ApiIgnore
    @ApiOperation(value = "获取指定id用户详细信息", notes = "根据user的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "User ID", dataType = "String", paramType = "path")
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        return new User(id, "abc", "12345");
    }

    @ApiOperation(value = "创建User对象-基本类型", notes = "根据ID&Name生成User创建用户并返回")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "User ID", dataType = "Long", required = true, paramType = "path"),
            @ApiImplicitParam(name = "name", value = "User Name", dataType = "String", required = true, paramType = "path") })
    @RequestMapping(value = "/createUser/{id}/{name}", method = RequestMethod.POST)
    public User createUser(@PathVariable Long id, @PathVariable String name) {
        User u = new User(id, name, "pwd" + id);
        list.add(u);
        return u;
    }

    @ApiOperation(value = "创建User对象-JSON格式,返回JSON", notes = "根据JSON生成User创建用户并返回,返回JSON")
    //@ApiImplicitParam(name = "user", value = "User Info", dataType = "User", paramType = "body")
    @RequestMapping(value = "/createUser2", produces = { "application/json;charset=UTF-8" },
            consumes = { "application/json;charset=UTF-8" }, method = RequestMethod.POST)
    public User createUser2(@RequestBody User user) {
        list.add(user);
        return user;
    }

    @ApiOperation(value = "创建User对象-XML/JSON格式,返回XML/JSON", notes = "根据XML/JSON格式生成User创建用户并返回,返回XML/JSON")
    @RequestMapping(value = "/createUser3", produces = { "application/xml;charset=UTF-8",
            "application/json;charset=UTF-8" }, consumes = { "application/xml;charset=UTF-8",
            "application/json;charset=UTF-8" }, method = RequestMethod.POST)
    public User createUser3(@RequestBody User user) {
        list.add(user);
        return user;
    }

    @ApiOperation(value = "创建User对象-对象类型", notes = "根据User创建用户并返回")
    @RequestMapping(value = "/createUser4", method = RequestMethod.POST)
    public User createUser4(@ModelAttribute User user) {
        list.add(user);
        return user;
    }

    @ApiOperation(value = "根据Name模糊查找用户", notes = "根据Name模糊查找所有满足条件的用户信息")
    @ApiImplicitParam(name = "name", value = "name", dataType = "String", paramType = "path")
    @RequestMapping(value = "/getUserByName/{name}", method = RequestMethod.GET)
    public List<User> getUserByName(@PathVariable String name) {
        if (!StringUtils.isEmpty(name)) {
            List<User> _list = new ArrayList<User>();
            for (User u : list) {
                if (StringUtils.containsIgnoreCase(u.getUsername(), name, Locale.getDefault())) {
                    _list.add(u);
                }
            }
            return _list;
        } else {
            return list;
        }
    }

    @ApiOperation(value = "显示用户列表", notes = "获取所有用户数据列表")
    @RequestMapping(value = "/getUserList", method = RequestMethod.GET)
    public List<User> getUserList() {
        return list;
    }

    @ApiOperation(value = "删除指定id用户", notes = "根据id来删除用户信息")
    @ApiImplicitParam(name = "id", value = "用户id", dataType = "Long", defaultValue = "0", paramType = "path")
    @RequestMapping(value = "/deleteById/{id}", method = RequestMethod.DELETE)
    public List<User> delete(@PathVariable Long id) {
        for (Iterator<User> iter = list.iterator(); iter.hasNext(); ) {
            User _u = iter.next();
            if (id.longValue() == _u.getId().longValue()) {
                iter.remove();
            }
        }
        return list;
    }
}
