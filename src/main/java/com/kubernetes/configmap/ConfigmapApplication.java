package com.kubernetes.configmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigmapApplication {


	public static void main(String[] args) {

		System.out.println("Hi");
		SpringApplication.run(ConfigmapApplication.class, args);
	}

}
