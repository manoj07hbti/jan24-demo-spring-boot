package com.example.jan24demospringboot.Demo_Controller.Assignments;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Demo_pathVariable {

    @RequestMapping("/cube2/{num}")
    public int cube(@PathVariable int num) {
        return num * num * num;
    }

    @RequestMapping("/oddevencheck0/{num}")
    public String oddevencheck(@PathVariable int num ) {
        if ((num % 2) == 0) {
            return (num + " is even");
        } else {
            return (num + " is odd");
        }
    }

    @RequestMapping("/Primecheck/{num}")
    public String Primecheck(@PathVariable int num) {

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
    @RequestMapping("/calc/{a}/{b}")
    public String CalcK(@PathVariable int a ,@PathVariable int b) {


        return "Addition of given nums is " + (a + b) + "\n" +
                "Multi of given nums is" + (a * b) + "\n" +
                "division of given num is " + a / b + "\n" +
                "sub of given nums is " + (a - b) + "\n";

    }

    @RequestMapping("/strings/{values}")
    public List<String> getStringList(@PathVariable List<String> values) {
        return values;
    }






}
