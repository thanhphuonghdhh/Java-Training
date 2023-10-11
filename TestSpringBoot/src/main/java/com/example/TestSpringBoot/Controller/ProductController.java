package com.example.TestSpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Products") //http://localhost:8080/api/Products
public class ProductController {
    @GetMapping("")
    //Abc
    public List<String> getProducts(){
        return List.of("A","B");
    }
}
