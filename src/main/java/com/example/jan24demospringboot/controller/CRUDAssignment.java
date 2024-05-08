package com.example.jan24demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CRUDAssignment {
    ArrayList<Integer> marks = new ArrayList<>();

    @RequestMapping("/addmarks/{num}")
    public String addMarks(@PathVariable int num){
        marks.add(num);
        return num+ " added successfully" ;
    }

    @RequestMapping("/getmarks")
    public ArrayList<Integer> getMarks(){
       return marks ;
    }

    @RequestMapping("/updatemarks/{newmark}/{index}")
    public String updateMarks(@PathVariable int newMark, @PathVariable int index){
       marks.set(index, newMark);
        return  "marks updated  successfully" ;
    }

    @RequestMapping("/removemarks")
    public String removeMarks(int index){
        marks.remove(index);
        return  "marks removed successfully" ;
    }

    // country crud
    ArrayList<String> country = new ArrayList<>();

    @RequestMapping("/addcountry/{countryName}")
    public String addCountry(@PathVariable String countryName){
        country.add(countryName) ;
        return countryName+" country added successfully " ;
    }

    @RequestMapping("/getcountrys")
    public ArrayList<String> getCountrys(){
        return country ;
    }

    @RequestMapping("/updatecountry/{countryName}/{index}")
    public String updateCountry(@PathVariable String countryName, @PathVariable int index){
        country.set(index, countryName);
        return "country name updated successfully" ;
    }

    @RequestMapping("/removecountry/{index}")
    public String removeCountry(@PathVariable int index){
        country.remove(index);
        return  "country removed successfully" ;
    }

    ArrayList<Float> moblie = new ArrayList<>();

    @RequestMapping("/addprice/{price}")
    public String addPrice(@PathVariable float price){
        moblie.add(price);
        return "price is "+ price ;
    }

    @RequestMapping("/getprice")
    public ArrayList<Float> getPrice(){
       return moblie ;
    }

   @RequestMapping("/updateprice/{newPrice}/{index}")
    public String updatePrice(@PathVariable float newPrice,@PathVariable int index){
        moblie.set(index, newPrice) ;
        return "price updated successfully " ;
   }

   @RequestMapping("/removeprice/{index}")
   public String removePrice(@PathVariable int index){
        moblie.remove(index);
        return "Price removed successfully" ;
   }
}
