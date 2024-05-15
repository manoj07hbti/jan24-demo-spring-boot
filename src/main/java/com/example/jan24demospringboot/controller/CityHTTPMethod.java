package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.City;
import com.example.jan24demospringboot.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class CityHTTPMethod {
    ArrayList<City> cityArrayList = new ArrayList<>();

    //Create Data ----
    @PostMapping("/addCity/{name}/{population}/{place}")
    public String addCity(@RequestBody City city){


        cityArrayList.add(city);

        return " City Data successfully added.......";

    }





    @GetMapping("/getCity")
    public ArrayList<City>getCityArrayList(){
        return cityArrayList;
    }






    @RequestMapping("/updateCityName")
    public String updateCityName(@RequestParam String newName, @RequestParam int index){
        City city= cityArrayList.get(index);
        city.setName(newName);
        return "Name update successfully--"+newName;
    }






    @PutMapping("/updatePopulation")
    public String updatePopulation(@RequestParam int newPopulation, int index){
        City city = cityArrayList.get(index);
        city.setPopulation(newPopulation);
        return " Population data successfully updated--"+newPopulation;
    }






    @DeleteMapping("RemoveCity")
    public String removeCity(@RequestParam int index){
        cityArrayList.remove(index);
        return "City Name updated---";
    }
}
