package com.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * @author :Alex
 * @since :2021年6月25日19:02:25
 */

@EnableScheduling
@SpringBootApplication()
public class SpringbootDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

}
