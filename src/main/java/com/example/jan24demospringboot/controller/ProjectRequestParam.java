package com.example.jan24demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProjectRequestParam {



    @RequestMapping("/param_calc")
    public String Calc(@RequestParam int a, @RequestParam int b) {



        return "Addition of given num is----- " + (a + b) +
                "\n" +
                "Multi of given num is------" + (a * b) +
                "\n" +
                "division of given num------ is " +(double) a / b +
                "\n" +
                "sub of given num is---- " + (a - b) +
                "\n";
    }






    @RequestMapping("/param_hello")
    public String Hello(@RequestParam String name) {

        return "Welcome to Spring Boot Path Variable-- " + name;
    }


    @RequestMapping("/param_result")
    public String result(@RequestParam int number, @RequestParam String status) {


        if (number >= 33 && status.equalsIgnoreCase("PASS")) {
            return "Congratulation u are qualified--";
        } else {
            return "Sorry u are not qualified--";
        }
    }


    @RequestMapping("/param_vote")
    public String vote(@RequestParam int age, @RequestParam String city) {

        if (age >= 18 && city.equalsIgnoreCase("AGRA")) {


            return "You are eligible for vote in AGRA";
        } else {
            return "You are not eligible for vote in AGRA--";
        }
    }










    }
