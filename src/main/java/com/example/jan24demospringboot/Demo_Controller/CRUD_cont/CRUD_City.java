package com.example.jan24demospringboot.Demo_Controller.CRUD_cont;
import com.example.jan24demospringboot.modal.City;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class CRUD_City {

    ArrayList<City> cityname = new ArrayList<>();

    @RequestMapping("/Add_city/{name}/{population}")
    public String addcity(@PathVariable String name, @PathVariable int population) {
        City city = new City(name, population);
        cityname.add(city);

        return "successfully added city";
    }

    @RequestMapping("/getCity")
    public ArrayList<City> getCityname() {
        return cityname;
    }

    @RequestMapping("/updatecityn/{index}/{newname}")
    public String update(@PathVariable int index, @PathVariable String newname) {
        City city = cityname.get(index);
        city.setName(newname);
        return "Success";
    }

    @RequestMapping("/updatepop/{index}/{newpop}")
    public String updatepop(@PathVariable int index, @PathVariable int newpop) {
        City city = cityname.get(index);
        city.setPopulation(newpop);
        return "Success";
    }

    @RequestMapping("/deletecity77/{index}")
    public String remove(@PathVariable int index) {
        cityname.remove(index);
        return " Success";
    }


}
