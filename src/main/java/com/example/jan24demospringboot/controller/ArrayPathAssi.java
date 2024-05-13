package com.example.jan24demospringboot.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ArrayPathAssi {

    //Todo: arrayList String brand name..............

    @RequestMapping("/bike/{name}")
    public String BrandName(@PathVariable String brandName){
        ArrayList<String> BrandName = new ArrayList<>();

        BrandName.add("Honda");
        BrandName.add("Royal Enfield");
        BrandName.add("Bajaj Pulsar NS200");
        BrandName.add("Hero");
        BrandName.add("KTM");
        BrandName.add("Yamaha");
        BrandName.add("Java");

        return "Printing bike brand name is:  + BrandName";



    }
}
