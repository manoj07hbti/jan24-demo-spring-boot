package com.example.jan24demospringboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CubeNumber {

    @RequestMapping("/findcube")
    public String cube() {
        int number = 5;
        return number*number*number + " Finding cube of given number";
    }

    @RequestMapping("/calculator")
    public String calculator() {
        int number1 = 8;
        int number2 = 4;
        return "Add of " + number1 + " and " + number2 + " is " + (number1 + number2) + "\n"
                + "\n || Subtract of " + number1 + " and " + number2 + " is " + (number1 - number2) + "\n"
                + "\n || Multiplication of " + number1 + " and " + number2 + " is " + (number1 * number2) + "\n"
                + "\n || Division of " + number1 + " and " + number2 + " is " + (double) (number1 / number2);
    }

    @RequestMapping("/brand")
    public ArrayList<String> brands() {
        ArrayList<String> brand = new ArrayList<>();
        brand.add("Levi Leather Purse");
        brand.add("Nick Shoes");
        brand.add("Monte Carlo Cloth");
        brand.add("Diamond Jewellery");
        brand.add("Park Avenue Perfume");

        System.out.println("Name of the brands :-");
        for (String s : brand) {
            System.out.println(s);
        }
        return brand;
    }

    @RequestMapping("/prime")
    public String prime() {

        int number = 7;
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return "given number is prime number";
        } else {
            return "given number is not a prime number";
        }
    }

    @RequestMapping("/oddevencheck")
    public String oddevencheck() {
        int num = 7;
        if ((num % 2) == 0) {

            return (num + " is even");
        } else {
            return (num + " is odd");
        }
    }



}
