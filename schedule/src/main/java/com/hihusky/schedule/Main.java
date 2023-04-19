package com.hihusky.schedule;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;

// main method to run the spring boot application
@SpringBootApplication
@EnableScheduling
public class Main {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Main.class, args);
        // let the current thread always sleep so that the spring boot application will not exit
        Thread.currentThread().join();
    }
}