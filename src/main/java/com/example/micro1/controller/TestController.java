package com.example.micro1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/micro1")
    public String micro1(){
        return "hello I am micro 1";
    }
}
