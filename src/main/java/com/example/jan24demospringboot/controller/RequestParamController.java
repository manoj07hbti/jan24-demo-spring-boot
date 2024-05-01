package com.example.jan24demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {

    @RequestMapping("/param_welcome")
    public String welcome(@RequestParam String name){

        return "Welcome to Spring Boot Path variable "+name;

    }

    @RequestMapping("/path_voting")
    public String vote(@RequestParam int age, @RequestParam String city){

        if(age>=18 && city.equalsIgnoreCase("Pune")){

            return "You are eligible for voting in Pune..";
        }else {

            return "You are NOT eligible for voting in Pune..";
        }
    }


}
