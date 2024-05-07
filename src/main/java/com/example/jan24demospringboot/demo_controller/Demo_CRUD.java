package com.example.jan24demospringboot.demo_controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController

public class Demo_CRUD {

        ArrayList<String> country= new ArrayList<>();

        //Country C- create or insert or add
        @RequestMapping("/add_country/{countryName}")
        public String addCountry(@PathVariable String countryName){

            country.add(countryName);

            return "Country "+countryName+ " Added successfully..";
        }

        @RequestMapping("/get_all_country")
        public ArrayList<String> getCountry(){

            return country;
        }

        @RequestMapping("/update_country/{newCountryName}/{index}")
        public String updateCountryName(@PathVariable String newCountryName,@PathVariable int index){

            country.set(index,newCountryName);

            return "Name updated Successfully...";

        }

        @RequestMapping("/remove_country/{index}")
        public String removeCountry(@PathVariable int index){

            country.remove(index);

            return "Country removed successfully...";
        }

    }



