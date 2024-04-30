package com.example.jan24demospringboot.controller.Assignment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Spring1st_Assign {
    @RequestMapping("/findcube")
    public String cube() {
        int num = 3;
        return num * num * num + " is cube of given number";
    }


    @RequestMapping("/calculator")
    public String calculator() {
        int num1 = 5;
        int num2 = 3;
        return "Addition of " + num1 + " and " + num2 + " is " + (num1 + num2) + "\n"
                + "\n || Subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2) + "\n"
                + "\n || Multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2) + "\n"
                + "\n || Division of " + num1 + " and " + num2 + " is " + (double) (num1 / num2);
    }


    @RequestMapping("/brand")
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


    @RequestMapping("/prime")
    public String prime() {

        int num = 5;
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
