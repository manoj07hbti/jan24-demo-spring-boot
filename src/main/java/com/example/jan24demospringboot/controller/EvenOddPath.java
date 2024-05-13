package com.example.jan24demospringboot.controller;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOddPath {


    //Todo: check even and odd number using pathVariable..........

    public String evenOddNum(){

        int number = 18;

        if(number%2==0){

            return "This is even number......... + number";
        }else{

            return "This is odd number.........  +number";
        }
    }


}
