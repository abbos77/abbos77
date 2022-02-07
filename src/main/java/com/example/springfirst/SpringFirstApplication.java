package com.example.springfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class SpringFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringFirstApplication.class, args);
        System.out.println("new days will start with comeback");

    }
    @Scheduled(fixedRate = 10000L)
    public void start(){
        System.out.println("new rate " +  new Date());
    }

}
