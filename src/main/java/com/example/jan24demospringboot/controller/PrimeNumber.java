package com.example.jan24demospringboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeNumber {

    //Todo check prime number.........



    @RequestMapping("/prime")
    public String prime(int number){
        boolean prime = true;
        for(int i = 2; i < number; i++){

            if(number % i == 0){

                prime = false;

            }
            if(prime){
                return "Number is prime......";
            }else{
                return "Number is not prime....";
            }

        }
    }


}
