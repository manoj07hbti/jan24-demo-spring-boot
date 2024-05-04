package com.example.jan24demospringboot.controller.Assignment;

import com.example.jan24demospringboot.controller.Assignment.Models.Employee_Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;

@RestController
public class RequestParamHW {
    @RequestMapping("/calculator_RequestParam")
    public String Calculator(@RequestParam int num1, @RequestParam int num2) {
        return "Addition of " + num1 + " and " + num2 + " is " + (num1 + num2) + "\n" +
                "Subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2) + "\n" +
                "Multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2) + "\n" +
                "Division of " + num1 + " and " + num2 + " is " + (double) (num1 / num2);
    }

     @RequestMapping("/Employee")    //TODO Returning Employee object
    public Employee_Model Employee_Details(@RequestParam int id, @RequestParam String name, @RequestParam char gender, @RequestParam int salary) {
        Employee_Model Employee1 = new Employee_Model(id, name, gender, salary);
        return Employee1;
    }
    public HashSet<Employee_Model>Employee_List(int id,String name,char gender,int salary){
        HashSet<Employee_Model>employeeModels=new HashSet<>();
        Employee_Model e=new Employee_Model(id,name,gender,salary);
        employeeModels.add(e);
        return employeeModels;
    }
    @RequestMapping("/Armstrong_RequestParam")
    public String Armstrong_RequestParam(@RequestParam int Number){
        int Temp=Number;
        int r;
        int sum=0;
       while (Number>0) {
           r = Number % 10;
           sum = sum + r * r * r;
           Number /= 10;
       }
       if (sum==Temp){
           return Number+"is Armstrong Number";
       }else {
           return Number + "is not a Armstrong Number";
       }
    }
    @RequestMapping("/Palindrome_RequestParam")
    public String Palindrome(@RequestParam int number){
        int o=number;
        int r,n=0;
        while (number!=0) {
            r = number % 10;
            n = n * 10 + r;
            number = number / 10;
        }
        if (o==n){
            return number+" is palindrome Numbeer";
        }else {
            return number+" is not a palindrome number";
        }
    }

}