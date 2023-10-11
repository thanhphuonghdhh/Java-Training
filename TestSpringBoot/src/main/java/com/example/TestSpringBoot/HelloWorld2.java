package com.example.TestSpringBoot;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld2 implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method 2");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init method 2");
    }
}
