package demo.greeting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by kind on 2017/3/21.
 */
@Controller
public class GreetingController {

    private static final String template = "Hello, %s!";

    private static Logger log = LoggerFactory.getLogger(GreetingController.class);

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/")
    @ResponseBody
    public String home(@RequestParam(value = "name", defaultValue = "~World~") String name) {
        log.info("received request ...");
        return String.format(template, name);
    }

    @RequestMapping("/greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping(value = "/greetingJson/{id}/{name}", method = RequestMethod.GET)
    @ResponseBody
    public Greeting greetingJson(@PathVariable int id, @PathVariable String name) {
        return new Greeting(id, String.format(template, name));
    }

    @RequestMapping(value = "/greetingXML/{id}/{name}", method = RequestMethod.GET)
    @ResponseBody
    public GreetingXML greetingXML(@PathVariable int id, @PathVariable String name) {
        return new GreetingXML(id, String.format(template, name));
    }
}
