package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.College;
import com.example.jan24demospringboot.model.EmployeeUpdate;
import com.example.jan24demospringboot.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CollegeDBController {
    @Autowired
    CollegeService service;
    @PostMapping("/college_add_db")
    public String addCollege(@RequestBody College college1){

        return service.addCollege(college1);

    }

    @GetMapping("/college")

    public List<College> getAllCollege(){

        return service.getAllCollege();
    }

    @PatchMapping("/college_name_update")
    public String update_college_name(@RequestParam String new_college_name , @RequestParam long id){

        return service.update_college_name(new_college_name, id);
    }

    @PatchMapping("/add_update")
    public String update_add(@RequestParam String new_add , @RequestParam long id){

        return service.add_update(new_add, id);
    }

    @DeleteMapping("/remove_college_bd")
    public String removeCollege(@RequestParam long id){

        return service.removeCollege(id);

    }





}
