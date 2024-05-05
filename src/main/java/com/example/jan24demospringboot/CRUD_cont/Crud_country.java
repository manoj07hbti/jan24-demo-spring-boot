package com.example.jan24demospringboot.CRUD_cont;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Crud_country {

//CountryCRUD

    ArrayList<String> countries = new ArrayList<>();
    @RequestMapping("/countryname/{country}")
    public String addCountry(@PathVariable String country) {
        countries.add(country);
        return "added successfully";
    }

    @RequestMapping("/get_cou")
    public ArrayList<String> getCountries() {
        return countries;
    }

    @RequestMapping("/update/{country}/{index}")
    public String update(@PathVariable String country ,@PathVariable int index){
        countries.set(index,country);
        return "success";
    }
    @RequestMapping("/remove/{index}")
    public String delete (@PathVariable int index){
        countries.remove(index);
        return "success";
    }


}
