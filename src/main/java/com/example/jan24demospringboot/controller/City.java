package com.example.jan24demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Hashtable;
@RestController
public class City {
    //update city name and population
    Hashtable<String,Integer>city=new Hashtable<>();


    @RequestMapping("/city/{CityName}/{Population}")
    public String AddCity(@PathVariable String CityName,@PathVariable int Population){
        city.put(CityName,Population);
        return CityName+" is Added successfully...";
    }

@RequestMapping("/getCity")
    public Hashtable<String, Integer> getCity() {
        return city;
    }

    @RequestMapping("/UpdateCityPopulation/{CityName}/{Existing_population}/{new_population}")
    public String UpdateCityPopulation(@PathVariable String CityName,@PathVariable int Existing_population,@PathVariable int new_population){
        city.replace(CityName,Existing_population,new_population);
        return CityName+" is update new Value with "+new_population;
    }
    @RequestMapping("/Remove/{CityName}")
    public String RemoveCity(@PathVariable String CityName){
        city.remove(CityName);
        return CityName+" is Removed from List.";
    }
}
