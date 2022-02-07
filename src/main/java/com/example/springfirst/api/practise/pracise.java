package com.example.springfirst.api.practise;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pracise {

    @RequestMapping("/hello")
    public String sayHello(){
        return "hello world";
    }
}
