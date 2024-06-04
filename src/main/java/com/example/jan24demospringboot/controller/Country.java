package com.example.jan24demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Country {
    ArrayList<String> countryList=new ArrayList<>();
    @RequestMapping("/AddCountry/{CountryName}")
    public String AddCountry(@PathVariable String CountryName){
        countryList.add(CountryName);
        return "course "+CountryName+" Added Successfully...";
    }
    @RequestMapping("/GetCountries")
    public ArrayList<String> GetCountries(){
        return countryList;
    }

    @RequestMapping("/UpdateCountryName/{index}/{Country}")
    public String UpdateCountryName(@PathVariable int index,@PathVariable String Country){
        countryList.set(index,Country);
        return "Course Updated Successfully...";
    }
    @RequestMapping("/RemoveCountry/{index}")
    public String RemoveCountry(@PathVariable int index){
        countryList.remove(index);
        return "Course Removed Successfully...";
    }
}
