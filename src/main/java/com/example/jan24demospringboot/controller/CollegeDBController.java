package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.College;
import com.example.jan24demospringboot.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/college/{id}")

    public Optional<College> getCollege(@PathVariable long id){

        return service.getCollege(id);
    }

    @GetMapping("/college_By_collegeName/{collegeName}")

    public Optional<College> getCollegeByCollegeName(@PathVariable String collegeName){

        return service.getCollegeByCollegeName(collegeName);
    }

    @PatchMapping("/college_name_update")
    public String update_collegeName(@RequestParam String new_collegeName , @RequestParam long id){

        return service.update_collegeName(new_collegeName, id);
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
