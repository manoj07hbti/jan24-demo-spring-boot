package com.example.jan24demospringboot.Demo_Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller {


    @RequestMapping("/hello")
    public void hello() {
        System.out.println(" welcome ");
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome to spring boot";
    }


    @RequestMapping("/cube")
    public int cube() {
        int num = 5;
        return num * num * num;
    }

    @RequestMapping("/brand")
    public ArrayList<String> brands() {

        ArrayList<String> brand = new ArrayList<>();
        brand.add("PeterEngland");
        brand.add("xyz");
        brand.add("abc");
        brand.add("Duke");
        brand.add("Zara");


        for (String s : brand) {
            System.out.println(s);
        }
        return brand;
    }

    @RequestMapping("/oddevencheck")
    public String oddevencheck() {
        int num = 6;
        if ((num % 2) == 0) {

            return (num + " is even");
        } else {
            return (num + " is odd");
        }
    }

    // prime number
    @RequestMapping("/Primecheck")
    public String Primecheck() {
        int num = 5;
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % 2 == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            return num + " is prime";
        } else {
            return num + " is not prime";
        }
    }

    //calculator controller
    @RequestMapping("/calc")
    public String Calc() {
        int a = 5;
        int b = 2;

        return "Addition of given nums is " + (a + b) + "\n" +
                "Multi of given nums is" + (a * b) + "\n" +
                "division of given num is " + a / b + "\n" +
                "sub of given nums is " + (a - b) + "\n";

    }



}

