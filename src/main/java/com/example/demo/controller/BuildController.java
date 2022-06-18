package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildController {

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "Welcome Home " + name;
    }
}
