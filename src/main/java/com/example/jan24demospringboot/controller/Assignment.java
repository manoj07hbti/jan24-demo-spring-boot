package com.example.jan24demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class Assignment {

    @RequestMapping("/makecube")
    public String Cube(){
        int num=3;
        return num*num*num+" is cube of "+num ;
    }

    @RequestMapping("/add")
    public String add(){
        int num1 = 5;
        int num2 = 80;
        return  num1+num2 + " addition of given numbers" ;
    }

    @RequestMapping("/sub")
    public String sub(){
        int num1 = 5;
        int num2 = 80;
        return  num1-num2 + " substraction of given numbers" ;
    }

    @RequestMapping("/multi")
    public String multi(){
        int num1 = 5;
        int num2 = 80;
        return  num1*num2 + " multiplication of given numbers" ;
    }

    @RequestMapping("/div")
    public String div(){
        int num1 = 5;
        int num2 = 80;
        return  num1/num2 + " division of given numbers" ;
    }

    @RequestMapping("/list1")
    public String[] list1(){
        String [] brands = {"apple", "vivo","samsung","realme"} ;

        return brands ;
    }

    @RequestMapping("/list2")
    public String list2(){
        String [] brands = {"apple", "vivo","samsung","realme"} ;

        return Arrays.toString(brands) ;
    }

    @RequestMapping("/evenodd")
    public String evenOdd(){
        int num = 4;
        if(num%2==0) {
            return num + " is even" ;
        }
        return num + " is odd" ;
    }

    @RequestMapping("/prime")
    public String prime(){
        int num =7;
        int count=0;
        for(int i=1; i<=num; i++){
            if(num%i == 0){
                count ++ ;
            }
        }
        return (count==2 ? num+" = prime" : num+ " = not prime") ;

    }

}
