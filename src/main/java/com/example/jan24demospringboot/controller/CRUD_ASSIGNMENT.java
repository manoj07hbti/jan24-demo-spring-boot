package com.example.jan24demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CRUD_ASSIGNMENT {

    ArrayList<Integer> marksCrud = new ArrayList<>();

    @RequestMapping("/marksadd/{number}")
    public String marksadd(@PathVariable int number){
        marksCrud.add(number);
        return number+ " number added successfully" ;
    }

    @RequestMapping("/marksget")
    public ArrayList<Integer> marksget(){
        return marksCrud ;
    }

    @RequestMapping("/marksupdate/{marksnew}/{index}")
    public String marksupdate(@PathVariable int marksnew, @PathVariable int index){
        marksCrud.set(index, marksnew);
        return  "marks updated successfully" ;
    }

    @RequestMapping("/marksremove/{index}")
    public String marksremove(@PathVariable int index){
        marksCrud.remove(index);
        return  "marks removed successfully" ;
    }

    // country crud
    ArrayList<String> countryname = new ArrayList<>();

    @RequestMapping("/country_add/{countryName}")
    public String addCountry(@PathVariable String countryName){
        countryname.add(countryName) ;
        return countryName+" country added successfully " ;
    }

    @RequestMapping("/getall_countrys")
    public ArrayList<String> getCountrys(){
        return countryname ;
    }

    @RequestMapping("/country_update/{countryName}/{index}")
    public String updateCountry(@PathVariable String countryName, @PathVariable int index){
        countryname.set(index, countryName);
        return "country name updated successfully" ;
    }

    @RequestMapping("/country_remove/{index}")
    public String removeCountry(@PathVariable int index){
        countryname.remove(index);
        return  "country removed successfully" ;
    }

    // Price Crud

    ArrayList<Double> Shoes = new ArrayList<>();

    @RequestMapping("/price_Add/{price}")
    public String addPrice(@PathVariable Double price){
        Shoes.add(price);
        return "price is "+ price ;
    }

    @RequestMapping("/price_get")
    public ArrayList<Double> getPrice(){
        return Shoes ;
    }

    @RequestMapping("/price_update/{newPrice}/{index}")
    public String updatePrice(@PathVariable Double newPrice,@PathVariable int index){
        Shoes.set(index, newPrice) ;
        return "price updated successfully " ;
    }

    @RequestMapping("/Price_remove/{index}")
    public String removePrice(@PathVariable int index){
        Shoes.remove(index);
        return "Price removed successfully" ;
    }
}

