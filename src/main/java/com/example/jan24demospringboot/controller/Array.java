package com.example.jan24demospringboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Array {


    //Todo: arrayList string brands name......

    ArrayList<String> brand = new ArrayList<>();


    @RequestMapping("/brand")
    public String brands(){

        brand.add("Dell");
        brand.add("Asus");
        brand.add("Samsung");
        brand.add("Acer");
        brand.add("Apple");
        brand.add("Microsoft");
        brand.add("HP");
        brand.add("Lenovo");

        return "Printing brands name..... + brand";




    }
}
