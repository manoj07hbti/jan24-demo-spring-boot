package com.example.jan24demospringboot.controller.Assignment_1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PathVariableHW {
    @RequestMapping("/cube/{num}")
    public String cube(@PathVariable int num) {
        return num * num * num + " is cube of given number";
    }


    @RequestMapping("/my_calculator/{num1}/{num2}")
    public String calculator(@PathVariable int num1, @PathVariable int num2) {

        return "Addition of " + num1 + " and " + num2 + " is " + (num1 + num2) + "\n"
                + "\n || Subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2) + "\n"
                + "\n || Multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2) + "\n"
                + "\n || Division of " + num1 + " and " + num2 + " is " + (double) (num1 / num2);
    }


    @RequestMapping("/print_brand")
    public ArrayList<String> brands() {
        ArrayList<String> brand = new ArrayList<>();
        brand.add("Zara");
        brand.add("fashion 360");
        brand.add("Clothing 365");
        brand.add("Mankind Clothing");
        brand.add("Half Moon");

        System.out.println("Name of the brands :-");
        for (String s : brand) {
            System.out.println(s);
        }
        return brand;
    }


    @RequestMapping("/find_prime/{num}")
    public String prime(@PathVariable int num) {

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
    @RequestMapping("/odd/{num1}/{num2}")
    public ArrayList<Integer> Odd(@PathVariable int num1, @PathVariable int num2){
        ArrayList<Integer>integers=new ArrayList<>();
        for (int i=num1;i<=num2;i++) {
            if (i % 2 != 0) {
                integers.add(i);

            }
        }
        return integers;
    }
    @RequestMapping("/even/{num1}/{num2}")
    public ArrayList<Integer> even(@PathVariable int num1, @PathVariable int num2){
        ArrayList<Integer>integers=new ArrayList<>();
        for (int i=num1;i<=num2;i++) {
            if (i % 2 == 0) {
                integers.add(i);

            }
        }
        return integers;
    }

}
