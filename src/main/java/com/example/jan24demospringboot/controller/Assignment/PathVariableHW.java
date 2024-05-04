package com.example.jan24demospringboot.controller.Assignment;

import com.example.jan24demospringboot.controller.Assignment.Models.Employee_Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;

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
    @RequestMapping("/EmpDetails/{id}/{name}/{gender}/{salary}")
    public Employee_Model EmpDetails(@PathVariable int id, @PathVariable String name, @PathVariable char gender, @PathVariable int salary){
        Employee_Model Employee=new Employee_Model(id,name,gender,salary);
        return Employee;
    }
    @RequestMapping("/Emp/{id}/{name}/{gender}/{salary}")
    public HashSet<Employee_Model> Employees(@PathVariable int id, @PathVariable String name, @PathVariable char gender, @PathVariable int salary){
        HashSet<Employee_Model> employeeModels=new HashSet<>();
        employeeModels.add(new Employee_Model(id,name,gender,salary));
        return employeeModels;
    }
    @RequestMapping("/armstrong_PathVariable/{number}")
    public String Armstrong_PathVariable(@PathVariable int number){
        int temp=number;
        int r,sum=0;

        while (number>0) {
            r = number % 10;
            number = number / 10;
            sum = sum + r * r * r;
        }
        if (temp==sum)
            return number+" is Armstrong number";
        else
            return number+" is Not Armstrong number";
    }
    @RequestMapping("/Palindrome_PathVariable/{number}")
    public String Palindrome(@PathVariable int number){
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
