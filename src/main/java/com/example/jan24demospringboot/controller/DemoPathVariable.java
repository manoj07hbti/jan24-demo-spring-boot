package com.example.jan24demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoPathVariable {

    //@RequestMapping("endpoint_name/{pathvariable_name}")
    //(@PathVariable Datatype varName)
    @RequestMapping("/path_welcome/{name}")
    public String welcome(@PathVariable String name){

        return "Welcome to Spring Boot Path variable "+name;

    }

    @RequestMapping("/voting/{age}/{city}")
    public String vote(@PathVariable int age, @PathVariable String city){

        if(age>=18 && city.equalsIgnoreCase("Pune")){

            return "You are eligible for voting in Pune..";
        }else {

            return "You are NOT eligible for voting in Pune..";
        }
    }

}
