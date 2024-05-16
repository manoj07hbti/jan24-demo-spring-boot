package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.City;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class City_Crud_Assignment {
    ArrayList<City> cityArrayList = new ArrayList<>();

    //Create Data ----
    @RequestMapping("/city_add")
    public String addCity(@RequestBody City city1){
        //City city1 = new City(name,population);

        cityArrayList.add(city1);

        return " City Data successfully Added.......";

    }

    @RequestMapping("/Get_City")
    public ArrayList<City>getCityArrayList(){
        return cityArrayList;
    }

    @RequestMapping("/Update_CityName/{newCityName}/{index}")
    public String updateCityName(@PathVariable String newCityName, @PathVariable int index){
        City city1= cityArrayList.get(index);
        city1.setName(newCityName);
        return "City Name Updated successfully--"+newCityName;
    }

    @RequestMapping("/updatePopulation/{newPopulation}/{index}")
    public String Update_Population(@PathVariable int newPopulation, @PathVariable int index){
        City city1 = cityArrayList.get(index);
        city1.setPopulation(newPopulation);
        return " Population Data Updated Successfully--"+newPopulation;
    }

    @RequestMapping("/Remove_City/{index}")
    public String removeCity(@PathVariable int index){
        cityArrayList.remove(index);
        return "City Name Removed Successfully---";
    }



}
