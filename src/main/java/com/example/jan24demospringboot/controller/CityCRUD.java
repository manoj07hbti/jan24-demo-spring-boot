package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.City;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CityCRUD {
        ArrayList<City> cityArrayList = new ArrayList<>();

        //Create Data ----
        @RequestMapping("/addCity/{name}/{population}/{place}")
        public String addCity(@PathVariable String name, @PathVariable int population, @PathVariable String place){
        City city = new City(name,population,place);

        cityArrayList.add(city);

        return " City Data successfully added.......";

        }





        @RequestMapping("/get_City")
        public ArrayList<City>getCityArrayList(){
            return cityArrayList;
        }






        @RequestMapping("/update_CityName")
    public String updateCityName(@RequestParam String newName, @RequestParam int index){
            City city= cityArrayList.get(index);
            city.setName(newName);
            return "Name update successfully--"+newName;
        }






        @RequestMapping("/update_Population")
    public String updatePopulation(@RequestParam int newPopulation, int index){
            City city = cityArrayList.get(index);
            city.setPopulation(newPopulation);
            return " Population data successfully updated--"+newPopulation;
        }






        @RequestMapping("RemoveCity")
    public String removeCity(@RequestParam int index){
            cityArrayList.remove(index);
            return "City Name updated---";
        }


}

