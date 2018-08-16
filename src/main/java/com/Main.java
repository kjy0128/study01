package com;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by kjy0128 on 2018-08-16.
 */
public class Main {
    public static void main(String[] args) {
        SpringApplication app= new SpringApplication();
        app.run(Main.class, args);
        System.out.println("Spring Boot ST");
    }

    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "hello world!";
    }
}
