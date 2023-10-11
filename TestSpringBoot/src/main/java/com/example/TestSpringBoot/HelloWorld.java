package com.example.TestSpringBoot;

public class HelloWorld {

    //execute automatically when bean is initialized
    public void init() {
        System.out.println("init method");
    }

    //execute when container is closed
    public void destroy() {
        System.out.println("destroy method");
    }
}
