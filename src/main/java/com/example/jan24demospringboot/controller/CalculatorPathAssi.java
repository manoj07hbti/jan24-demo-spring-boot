package com.example.jan24demospringboot.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorPathAssi {

    //Todo: calculator pathVariable Assignment..........

    //Todo: Addition....

    @RequestMapping("/addi/{num1}")
    public String addition(@PathVariable int number ){

        int a = 555;
        int b = 445;

        return a+b + "Is addition of a and b .......";
    }
    //Todo: Subtraction.....

    @RequestMapping("/subtrac/{num2")
    public String subtraction(@PathVariable int num){

        int c = 1003;
        int d = 503;

    return c-d + "Is subtraction of c and d......... ";
    }

    //Todo: Multiply....

    @RequestMapping("/multi3/{number}")
    public String multiply(@PathVariable int num){

        int e = 10002;
        int f =10;

        return e*f + "Is multiply of e and f ........";
    }

    //Todo: Divide......

    @RequestMapping("/div/{num}")
    public String divide(@PathVariable int number){

        int g = 52140;
        int h = 5;

        return g/h + "Is divide of g and h............";


    }
}
