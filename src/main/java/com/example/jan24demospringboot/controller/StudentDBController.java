package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.StudentTable;
import com.example.jan24demospringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentDBController {

    @Autowired
    StudentService service;

    @PostMapping("/save_student")
    public String addStudent(@RequestBody StudentTable student){
       return service.addStudent(student);
    }

    @GetMapping("/get_students")
    public List<StudentTable> getStudents(){
        return service.getStudents();
    }

    @PatchMapping("/update_student_name")
    public String updateName(@RequestParam long id, @RequestParam String newName){
        return service.updateName(id, newName);
    }

    @PatchMapping("/update_rollno")
    public String updateRollNo(@RequestParam long id,@RequestParam int newRoll){
        return service.updateRollNo(id, newRoll);
    }

    @PatchMapping("/update_section")
    public String updateSection(@RequestParam long id, @RequestParam String newSection){
        return service.updateSection(id, newSection);
    }

    @PatchMapping("/update_student")
    public String updateStudent(@RequestParam long id, @RequestParam String name, @RequestParam int rollNo, @RequestParam String section){
       return service.updateStudent(id, name, rollNo, section);
    }

    @DeleteMapping("/remove_student")
    public String removeStudent(@RequestParam long id){
        return service.removeStudent(id);
    }

}
