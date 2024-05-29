package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.Student;
import com.example.jan24demospringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentDBController {

    @Autowired
    StudentService service;
    @PostMapping("/add_student_db")
    public String addStudent(@RequestBody Student student){

        return   service.addStudent(student);

    }

    @GetMapping("/students")
    public List<Student> getAllStudent(){

        return service.getAllStudent();
    }


    @PatchMapping("/update_name")
    public String updateName(@RequestParam String newName, @RequestParam long id){

      return service.updateName(newName,id);

    }

    @DeleteMapping("/remove_std_db")
    public String removeStudent(@RequestParam long id){

        return service.removeStudent(id);
    }

}
