package com.example.jan24demospringboot.controller;


import com.example.jan24demospringboot.service.AppArchServiceDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppArchControllerDemo {

    @Autowired
     AppArchServiceDemo serviceDemo;

    @RequestMapping("/app_hello")
    public String hello_world(){

        // AppArchServiceDemo obj = new AppArchServiceDemo();

        return serviceDemo.hello_world();

    }



}
