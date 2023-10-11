package com.example.TestSpringBoot.Controller;

import com.example.TestSpringBoot.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@RestController
@SessionScope
@RequestMapping("/test/api")
public class TestDataController {

    @RequestMapping("/request-scope")
    public String hello(){
        System.out.println(this);
        return "Hello World";
    }
    @Autowired
    private Data data;

    @RequestMapping("/UpdateRequest")
    public String updateRequest() {
        data.getRequest().setName("update request");
        return data.getRequest().getName();
    }

    @RequestMapping("/Request")
    public String Request() {
        return data.getRequest().getName();
    }

    @RequestMapping("/UpdateSession")
    public String updateSession() {
        data.getSession().setName("update session");
        return data.getSession().getName();
    }

    @RequestMapping("/Session")
    public String Session() {
        return data.getSession().getName();
    }


}
