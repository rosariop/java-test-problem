package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SomeClass {

    @Value("${config.key}") // TODO: How to mock this?
    private String key;

    @GetMapping
    public String sayHello(){
        return key;
    }
}
