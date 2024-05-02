package com.example.jan24demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentPathVariable {
    @RequestMapping("/pathvariablewelcome/{name}")
    public String welcome(@PathVariable String name){
        return "Welcome to Springboot " +name ;
    }

    @RequestMapping("/vote/{age}/{city}")
    public String vote(@PathVariable int age , @PathVariable String city){
        if(age>=18 && city.equalsIgnoreCase("Pune")) {
            return "you are eligible to vote in pune" ;
        }
        else {
            return "you are not  eligible to vote in pune" ;

        }
    }

    @RequestMapping("/cube_pv/{num}")
    public  String cube(@PathVariable int num){
        return num*num*num +" is cube of " + num  ;
    }

    @RequestMapping("/add_pv/{num1}/{num2}")
    public String add(@PathVariable int num1, @PathVariable int num2){
        return  num1+num2 + " addition of given numbers" ;
    }

    @RequestMapping("/sub_pv/{num1}/{num2}")
    public String sub(@PathVariable int num1, @PathVariable int num2){

        return  num1-num2 + " subtraction of given numbers" ;
    }

    @RequestMapping("/multi_pv/{num1}/{num2}")
    public String multi(@PathVariable int num1, @PathVariable int num2){

        return  num1*num2 + " multiplication of given numbers" ;
    }

    @RequestMapping("/div_pv/{num1}/{num2}")
    public String div(@PathVariable int num1, @PathVariable int num2){

        return  num1/num2 + " division of given numbers" ;
    }

    @RequestMapping("/evenodd_pv/{num}")
    public String evenOdd(@PathVariable int num){
        if(num%2==0){
            return num +" is even";
        }
        else {
            return num +" is odd";
        }
    }

    @RequestMapping("/prime_pv/{num}")
    public String prime(@PathVariable int num){
        int count =0;
        for (int i=1; i<=num; i++){
            if(num%i==0){
                count++;
            }
        }
        if(count == 2){
            return num+ " is Prime";
        }
        else {
            return num+ " is not Prime";
        }
    }
}
