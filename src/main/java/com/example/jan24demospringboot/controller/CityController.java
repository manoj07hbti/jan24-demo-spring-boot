package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.City;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CityController {

    ArrayList<City> cityArrayList = new ArrayList<>();

    //Assignment Post RequestBody
    @RequestMapping("/postaddcity")
    public String addCity(@RequestBody City city){

        cityArrayList.add(city) ;
        return "city added ... ";
    }

    @RequestMapping("/addcity/{name}/{population}/{region}")
    public String addCity(@PathVariable String name,@PathVariable double population,@PathVariable String region){
        City city = new City(name, population, region);
        cityArrayList.add(city) ;
        return "city added ... ";
    }

    @RequestMapping("/getcity")
    public ArrayList<City> getCitys(){
        return  cityArrayList;
    }

    @RequestMapping("/updatecityname")
    public String updateCityName(@RequestParam String newName,@RequestParam int index){
        City city = cityArrayList.get(index);
        city.setName(newName);
        return newName+" name updated successfully";
    }

    @RequestMapping("/updatepopulation")
    public String updatePopulation(@RequestParam double newPopulation, @RequestParam int index){
        City city = cityArrayList.get(index);
        city.setPopulation(newPopulation);
        return newPopulation +" population updated .. ";
    }

    @RequestMapping("/removecity")
    public String removeCity(@RequestParam int index){
        cityArrayList.remove(index);
        return "city removed ... ";
    }
}
