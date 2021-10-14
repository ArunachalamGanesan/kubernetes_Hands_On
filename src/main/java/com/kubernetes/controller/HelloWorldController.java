package com.kubernetes.configmap.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${message}")
    public String message;

    @GetMapping("/health")
    public String healthCheck(){
        return "Health Check is Good";
    }

    @GetMapping("/welcome")
    public String welcomeMessage(){
        return message;
    }

}
