package com.kubernetes.configmap.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldContoller {

    @Value("${name}")
    public String name;

    @GetMapping("/health")
    public String healthCheck(){
        return "health";
    }

    @GetMapping("/hello")
    public String getMessage(){
        return name;
    }
}
