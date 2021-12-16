package com.example.lambdacontainertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LambdaContainerTestApplication {

    @GetMapping("/")
    public String hello() {
        return "Hello Docker!!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(LambdaContainerTestApplication.class, args);
    }

}
