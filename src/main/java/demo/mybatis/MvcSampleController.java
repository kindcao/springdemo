package demo.mybatis;

import demo.mybatis.domain.City;
import demo.mybatis.domain.Hotel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by kind on 2017/3/21.
 */
@Controller
public class MvcSampleController {

    private static Logger log = LoggerFactory.getLogger(MvcSampleController.class);

    @Autowired
    private MvcSampleService service;

    @RequestMapping(value = "/samplemvc/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Hotel sample(@PathVariable long id) {
        return service.selectByCityId(id);
    }

    @RequestMapping(value = "/samplemvc2/{name}", method = RequestMethod.GET)
    @ResponseBody
    public List<City> sample2(@PathVariable String name) {
        return service.findNames(name);
    }

    @RequestMapping(value = "/samplemvc3/{name}", method = RequestMethod.GET)
    public String sample3(@PathVariable String name, Map<String, Object> map) {
        map.put("name", "[Angel -- " + name + "]");
        List<City> cityList = service.findNames(name);
        map.put("cityList", cityList);
        return "mvc/body";
    }
}
