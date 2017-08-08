package demo.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by kind on 2017/7/19.
 */
@EnableScheduling
@SpringBootApplication
public class WebSocketApp {

    public static void main(String[] args) {
        SpringApplication.run(WebSocketApp.class, args);
    }
}

