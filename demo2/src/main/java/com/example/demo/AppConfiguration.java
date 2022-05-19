package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfiguration {
@RequestMapping("/Hello")
    public String hello(){
    return "Hello World";
}
}
