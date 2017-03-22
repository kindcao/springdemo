package demo.greeting;

import java.util.concurrent.atomic.AtomicLong;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kind on 2017/3/21.
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";

    private static Logger logger = Logger.getLogger(GreetingController.class);

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/")
    public String home(@RequestParam(value = "name", defaultValue = "~World~") String name) {
        logger.info("received request ...");
        return String.format(template, name);
    }

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
