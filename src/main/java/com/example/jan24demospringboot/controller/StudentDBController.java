package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.Models.Student;
import com.example.jan24demospringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDBController {
    @Autowired
    StudentService service;
    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student){

        return service.addStudent(student);
    }
}
