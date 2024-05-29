package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.College;
import com.example.jan24demospringboot.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollegeDBController {
    @Autowired
    CollegeService service;
    @PostMapping("/college_add_db")
    public String addCollege(@RequestBody College college1){

        return service.addCollege(college1);

    }

}
