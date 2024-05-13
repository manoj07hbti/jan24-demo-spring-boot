package com.example.jan24demospringboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenAndOdd {

    //Todo check even and odd number.........


    @RequestMapping("/even")
    public String even(){

        int num = 5;
        if(num%2==0){

            return "This is even number:  +num";
        }else{

            return "This is odd number:  +num";
        }
    }


}
