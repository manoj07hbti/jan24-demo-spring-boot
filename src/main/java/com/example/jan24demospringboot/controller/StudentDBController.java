package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.Models.Student;
import com.example.jan24demospringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentDBController {
    @Autowired
    StudentService service;
    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student){

        return service.addStudent(student);
    }

    @GetMapping("/getStudents")
    public List<Student> getStudents(){
        return service.getStudents();
    }

    @GetMapping("/getStudentById")
    public Optional<Student> getStudentById(@RequestParam long id){

        return service.getStudentById(id);
    }

    @GetMapping("/getStudentByName/{name}")
    public Optional<Student> getStudentByName(@PathVariable String name){

        return service.getStudentByName(name);
    }

    @GetMapping("/getStudentByRollNo/{rollNo}")
    public Optional<Student>getStudentByRollNo(@PathVariable int rollNo){

        return service.getStudentByRollNo(rollNo);
    }

    @GetMapping("/getStudentByNameAndRollNo/{name}/{rollNo}")
    public Optional<Student>getStudentByNameAndRollNo(@PathVariable String name,@PathVariable int rollNo){
        return service.getStudentByNameAndRollNo(name,rollNo);
    }

    @GetMapping("/getAll")
    public Optional<Student>getAll(){
        return service.getAll();
    }


    
    @PatchMapping("/updateName")
    public String  updateName(@RequestParam long id,@RequestParam String name){

        return  service.updateName(id,name);
    }
    @DeleteMapping("/removeStudent")
    public String removeStudent(@RequestParam long id){

        return service.removeStudent(id);
    }
}
