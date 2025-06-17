package com.telusko.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class HomeController {
    @RequestMapping("/")
    //@ResponseBody
    public String greet() {
        System.out.println("I am here");
        return "Hello World!";
    }
    @RequestMapping("/about")
    public String about() {
        return "We dont teach,we Educate ";
    }
}
