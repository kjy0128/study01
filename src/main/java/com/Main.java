package com;

import org.springframework.boot.SpringApplication;

/**
 * Created by kjy0128 on 2018-08-16.
 */
public class Main {
    public static void main(String[] args) {
        SpringApplication app= new SpringApplication();
        app.run(Main.class, args);
        System.out.println("Spring Boot ST");
    }
}
