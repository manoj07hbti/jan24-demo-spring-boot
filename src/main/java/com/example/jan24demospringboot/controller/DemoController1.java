package com.example.jan24demospringboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController1 {

    //Todo EndPoint syntax:>  @RequestMapping (/" endpoint_name ")


    @RequestMapping("/hey")
    public void hello () {
        System.out.println("Welcome to spring boot application............");

    }

    //Todo create a method which will return welcome message..........


    @RequestMapping("/come")
    public String Welcome(){
        String message = "Welcome to spring boot application......";

        return message;
    }

}
