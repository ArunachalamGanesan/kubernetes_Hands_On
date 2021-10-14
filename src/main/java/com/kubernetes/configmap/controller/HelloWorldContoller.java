package com.kubernetes.configmap.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloWorldContoller {

    @Value("${name:Arun}")
    public String name;

    @GetMapping("/health")
    public String healthCheck(){
        return "health";
    }

    @GetMapping("/world")
    public String getMessage(){
        log.info("helloworld");
        return name;
    }
}
