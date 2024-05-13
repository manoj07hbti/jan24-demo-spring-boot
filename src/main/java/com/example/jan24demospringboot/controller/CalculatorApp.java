package com.example.jan24demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculatorApp {


    //Todo: Addition.....

    @RequestMapping("/add")
    public String addition(){

        int a = 125;
        int b = 75;

        return a+b + "is addition of a and b.....";
    }

    //Todo: Subtraction.....

    @RequestMapping("/sub")
    public String subtraction(){

        int x = 1025;
        int y = 25;

        return x-y + "is subtraction of x and y.....";
    }

    //Todo: Multiply.......

    @RequestMapping("/multi")
    public String multiply(){

        int m = 500;
        int n = 10;

        return m*n + "is multiply of m and n......";
    }

    //Todo: Divide........

    @RequestMapping("/divide")
    public String divide(){

        int s = 52100;
        int t = 100;

        return s/t + "is divide of s and t.....";
    }




}
