package com.example.jan24demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CubeAssi {



    @RequestMapping("/findcube")
    public String makeCube(){

        int number = 5;

        return number*number*number+ "is cube of given number";
    }



    @RequestMapping("/number")
    public void value(){

        int num = 2;

        int result = num*num*num;

        System.out.println("This is cube of given number: "  +result);
    }
}
