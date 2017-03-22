package demo.greeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by kind on 2017/3/21.
 */
@SpringBootApplication
@EnableScheduling
public class GreetingApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(GreetingApp.class, args);
    }
}
