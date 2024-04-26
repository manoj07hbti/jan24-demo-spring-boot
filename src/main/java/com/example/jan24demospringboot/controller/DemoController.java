package com.example.jan24demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //ENDPOINT : @RequestMapping("/endpoint_name")
    @RequestMapping("/hello")
    public void hello(){

        System.out.println("Welcome to Spring Boot...");
    }


    // create a method which will return welcome message

    @RequestMapping("/welcome")
    public String welcome(){

        String msg="Welcome to Spring boot...";

        return msg;
    }

    @RequestMapping("/cube")
    public String makeCube(){

        int number=3;

        return number*number*number+" is Cube of Given Number" ;
    }

}
