package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.College;
import com.example.jan24demospringboot.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CollegeDBController {
    @Autowired
    CollegeService service;


    @PostMapping("/add_college")
    public String addCollege(@RequestBody College college){
        return service.addCollege(college);
    }

    @GetMapping("/get_college")
    public List<College> getColleges(){
       return service.getColleges();
    }

    @PatchMapping("/update_college_name")
    public String updateName(@RequestParam long id, @RequestParam String newName){
        return service.updateName(id, newName);
    }

    @PatchMapping("/update_city")
    public String updateCity(@RequestParam long id, @RequestParam String cityName){
        return service.updateCity(id, cityName);
    }

    @DeleteMapping("/delete_college")
    public String deleteCollege(@RequestParam long id){
        return service.deleteCollege(id);
    }
}
