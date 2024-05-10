package com.example.jan24demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Demo2PathVariable {

//@RequestMapping("endpoint_name/{pathvariable_name}")
    //(@PathVariable Datatype varName)

    @RequestMapping("/pathwelcome/{name}")
    public String welcome(@PathVariable String name){

        return"welcome to Spring boot path variable" + name;

    }

    @RequestMapping("/voted/{age}/{city}")
    public String vote(@PathVariable int age , @PathVariable String city){

        if(age>=18 && city.equalsIgnoreCase("Tundla")){

            return "You are eligible for voting in Tundla...";
        }else {
            return " You are not eligible for voting in Tundla..";
        }

    }

    @RequestMapping("/cubing/{number}")
    public String cube(@PathVariable int number) {
        return number*number*number + " Finding cube of given number";
    }

    @RequestMapping("/calc/{number1}/{number2}")
    public String calculator(@PathVariable int number1 , @PathVariable int number2) {
        return "Add of " + number1 + " and " + number2 + " is " + (number1 + number2) + "\n"
                + "\n || Subtract of " + number1 + " and " + number2 + " is " + (number1 - number2) + "\n"
                + "\n || Multiplication of " + number1 + " and " + number2 + " is " + (number1 * number2) + "\n"
                + "\n || Division of " + number1 + " and " + number2 + " is " + (double) (number1 / number2);
    }

    @RequestMapping("/branding")
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

    @RequestMapping("/primenumber/{number}")
    public String prime(@PathVariable int number) {
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
    @RequestMapping("/evenodd/{number}")
    public String evenoddcheck (@PathVariable int number) {
        if ((number % 2) == 0) {

            return (number + " is even");
        } else {
            return (number + " is odd");
        }
    }

}
