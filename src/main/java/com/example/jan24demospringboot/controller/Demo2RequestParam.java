package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.Employee1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;

// TODO Calulcator PathVariable and Requestparam
@RestController
public class Demo2RequestParam {

    @RequestMapping("/RequestParam_Calc")
    public String calculator(@RequestParam int number1 , @RequestParam int number2) {
        return "Add of " + number1 + " and " + number2 + " is " + (number1 + number2) + "\n"
                + "\n || Subtract of " + number1 + " and " + number2 + " is " + (number1 - number2) + "\n"
                + "\n || Multiplication of " + number1 + " and " + number2 + " is " + (number1 * number2) + "\n"
                + "\n || Division of " + number1 + " and " + number2 + " is " + (double) (number1 / number2);
    }

    // TODO return Employee PathVariable and Requestparam
    @RequestMapping("/RPEmployee")
    public Employee1 Employee_Details(@RequestParam int id, @RequestParam String name, @RequestParam String gender, @RequestParam Double salary) {
        Employee1 Employee2 = new Employee1(id, name, gender, salary);
        return Employee2;
    }


    // TODO Armstrong number with PathVariable and Requestparam
    @RequestMapping("/RequestParam_Armstrong")
    public String arms(@RequestParam int num) {
        int rem, sum = 0;
        int c = num;
        while (num > 0) {
            rem = num % 10;
            sum = rem * rem * rem +(sum);
            num = num / 10;
        }
        if (sum == c)
            return " num is arm " + c;
        else
            return "num is not arm " + c;


    }

// TODO Palendrom number with PathVariable and Requestparam

    @RequestMapping("/palindrome1")
    public String pal(@RequestParam int num) {
        int rem, c, s = 0;
        c = num;
        while (num > 0) {
            rem = num % 10;
            s = (s * 10) + rem; // Reverse the number
            num = num / 10;
        }
        if (c == s)
            return "Number is a palindrome: " + c;
        else
            return "Number is not a palindrome: " + c;
    }



}
