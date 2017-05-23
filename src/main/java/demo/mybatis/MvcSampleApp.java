package demo.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by kind on 2017/3/21.
 */
@SpringBootApplication
@EnableScheduling
public class MvcSampleApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MvcSampleApp.class, args);
    }
}
