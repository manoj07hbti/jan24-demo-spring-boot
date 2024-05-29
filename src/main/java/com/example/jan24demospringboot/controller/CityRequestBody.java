package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.City;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CityRequestBody {
    //we need arraylist of city variable----
    ArrayList<City> cityArrayList = new ArrayList<>();
    // create



    @RequestMapping("/city_add")
    public String addStudent(@RequestBody City city){



        cityArrayList.add(city);

        return "city data added successfully";

    }
    @RequestMapping("/get_city_name")
    public ArrayList<City>getCityArrayList(){

        return cityArrayList;
    }
}
