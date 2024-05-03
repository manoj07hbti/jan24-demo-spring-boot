package com.example.jan24demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DemoController {

    //ENDPOINT : @RequestMapping("/endpoint_name")
    @RequestMapping("/hello")
    public void hello() {

        System.out.println("Welcome to Spring Boot...");
    }


    // create a method which will return welcome message

    @RequestMapping("/welcome")
    public String welcome() {

        String msg = "Welcome to Spring boot...";

        return msg;
    }

    @RequestMapping("/square")
    public String makeSquare() {

        int number = 3;

        return number * number + " is  of Square Given Number";
    }

    @RequestMapping("/cube")
    public String makeCube() {
        int nmb = 5;
        return nmb * nmb * nmb + "is cube of given number";

    }

    @RequestMapping("/add")
    public String makeAdd() {
        int nmb1 = 5;
        int nmb2 = 2;
        return nmb1 + nmb2 + "is Addition of given number";

    }

    @RequestMapping("/sub")
    public String makeSub() {
        int nmb1 = 9;
        int nmb2 = 7;
        return nmb1 - nmb2 + "is SUB of given number";
    }

    @RequestMapping("/divide")
    public String makeDivide() {
        int nmb1 = 5;
        int nmb2 = 3;
        return (double) nmb1 / nmb2 + "is divide of given number";
    }
    @RequestMapping("/prime")
    public String prime(){
        int nmb =5;
        int count =0;
        for(int i=1; i<=nmb; i++){
            if (nmb %  i==0){
                count++;
            }
        }
        if (count ==2){
            return "number is   prime";
        }else {
            return "no is not prime";

        }

    }

}




