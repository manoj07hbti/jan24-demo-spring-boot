package com.example.jan24demospringboot.demo_controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller_1 {

    @RequestMapping("/square")
    public String make_square(){
        int num=7;
        return num*num*num +"square of given number";
    }


}
