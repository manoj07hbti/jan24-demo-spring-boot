package com.example.jan24demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class ProjectCountryCURD {
    ArrayList<String > country = new ArrayList<>();

    //Country C-create ,insert , add data.

    @RequestMapping("/add_country/{countryName}")
    public String addCountry(@PathVariable String countryName){

        country.add(countryName);

        return "Country ["+countryName+"]  Added Successfully";

        // Hit Syntax--> (localhost:8088/add_country/_____
    }

    //Country--Get all data  , find all data

    @RequestMapping("/get_all_country")
    public ArrayList<String >getCountry(){

        return country;
    }



    //Country -- update, edit data

    @RequestMapping("/update_country/{newCountryName}/{index}")
    public String updateCountryName(@PathVariable String newCountryName,@PathVariable int index){
        country.set(index,newCountryName);
        return "Name update successfully----!!!";
    }


    //country-- remove ,delete data

    @RequestMapping("/remove_country/{index}")
    public String removeCourse(@PathVariable int index){
        country.remove(index);
        return "Country removed successfully-------!!";
    }
}
