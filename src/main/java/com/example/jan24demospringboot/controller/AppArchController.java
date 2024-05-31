package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.service.AppArchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppArchController {

    @Autowired
    AppArchService service;

    @RequestMapping("/app_hello")
    public String hello(){
        return service.hello();
    }
}
