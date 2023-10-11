package com.example.TestSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class HelloWorld3 {

    @PostConstruct
    public void init() {
        System.out.println("init method 3");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy method 3");
    }
}
