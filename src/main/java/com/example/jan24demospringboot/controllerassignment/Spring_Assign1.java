package com.example.jan24demospringboot.controllerassignment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Spring_Assign1 {

    @RequestMapping("/square")
    public String square(){
        int num=5;
        return num*num+" is the square of given number";
    }
    @RequestMapping("/calculator")
    public String calculator(){
        int num1=5;
        int num2=8;

    return num1+num2+"is the addition"+"/n"+
            (num1-num2)+"is the subtraction"+"/n"+
            (num1*num2)+"is the multiplication"+"/n"+
            (double)(num1/num2)+"is the division";

    }
    @RequestMapping("/brand")
    public ArrayList<String> brands() {
        ArrayList<String> brand = new ArrayList<>();
        brand.add("Rebook");
        brand.add("Adidas");
        brand.add("One8");
        brand.add("Puma");
        brand.add("Nike");

        System.out.println("Name of the brands :-");
        for (String s : brand) {
            System.out.println(s);
        }
        return brand;
    }
    @RequestMapping("/prime")
    public String prime() {

        int num = 11;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return "given number is prime number";
        } else {
            return "given number is not a prime number";
        }
    }
}
