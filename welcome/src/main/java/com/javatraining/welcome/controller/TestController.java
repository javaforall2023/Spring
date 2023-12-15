package com.javatraining.welcome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
@ResponseBody
public class TestController {
    @RequestMapping("/wish")
    public String sayHellow(){
        return "Hello Welcome to Springboot";
    }

    // Get, Post, Delete, Patch, Put

}
