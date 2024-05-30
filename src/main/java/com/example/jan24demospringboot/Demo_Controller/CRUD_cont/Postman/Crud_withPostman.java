package com.example.jan24demospringboot.Demo_Controller.CRUD_cont.Postman;

import com.example.jan24demospringboot.modal.City;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Crud_withPostman {

    // For City

    ArrayList<City> cityname = new ArrayList<>();

    @RequestMapping("/Add_City1")
    public String addcity2(@RequestBody City city) {
        cityname.add(city);
        return "successfully added city";
    }

    @RequestMapping("/getCity2")
    public ArrayList<City> getCityname2() {
        return cityname;
    }

 /*   @RequestMapping("/updatecityn2/{index}/{newname}")
    public String update2(@PathVariable int index, @PathVariable String newname) {
        City city = cityname.get(index);
        city.setName(newname);
        return "Success";
    }
*/

    @PutMapping("/updatecityn2")
    public String updateCity(@RequestBody City  request) {
        int index = request.getIndX();
        String newname = request.getNewname();
        City city = cityname.get(index);
        city.setName(newname);
        return "Success";
    }


    @RequestMapping("/updatepop2/{index}/{newpop}")
    public String updatepop2(@PathVariable int index, @PathVariable int newpop) {
        City city = cityname.get(index);
        city.setPopulation(newpop);
        return "Success";
    }

    @RequestMapping("/deletecity7/{index}")
    public String remove2(@PathVariable int index) {
        cityname.remove(index);
        return " Success";
    }
}
