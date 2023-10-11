package com.example.TestSpringBoot;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class Request {
    private String name = "Request scope";

    public Request() {
        System.out.println("Request constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
