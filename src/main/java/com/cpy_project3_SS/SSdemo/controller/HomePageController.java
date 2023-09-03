package com.cpy_project3_SS.SSdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {
    
    @GetMapping("/home")
    public String homePage(){
        return "Welcome to the home page";
    }

    @GetMapping("/admin")
    public String adminPage(){
        return "Welcome to the ADMIN page";
    }

    
}
