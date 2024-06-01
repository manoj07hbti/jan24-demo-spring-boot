package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.Student;
import com.example.jan24demospringboot.repository.StudentRepository;
import com.example.jan24demospringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentDBController {

    @Autowired
    StudentService service;

    @Autowired
    StudentRepository repository;

    @PostMapping("/add_student_db")
    public String addStudent(@RequestBody Student student){

        return   service.addStudent(student);

    }

    @GetMapping("/students")
    public List<Student> getAllStudent(){

        return service.getAllStudent();
    }

    @GetMapping("/students_native")
    public List<Student> getAllStudentNative(){

        return repository.findAllNative();
    }

    @GetMapping("/students/{id}")
    public Optional<Student> getStudent(@PathVariable long id){

        return  service.getStudent(id);
    }

    @GetMapping("/student_by_name/{name}")
    public Optional<Student> getStudentByName(@PathVariable String name){

        return  service.getStudentByName(name);
    }

    @GetMapping("/student_by_name_native/{name}")
    public Optional<Student> getStudentByNameNative(@PathVariable String name){

        return Optional.ofNullable(repository.findByNameNative(name));
    }

    @GetMapping("/sts_by_name_rollno/{name}/{rollNo}")
    public Optional<Student> getStudentByNameRollNo(@PathVariable String name,@PathVariable int rollNo){

        return  service.getStudentByNameRoll(name,rollNo);
    }

    @GetMapping("/sts_by_name_roll_no_native/{name}/{rollNo}")
    public Optional<Student> getStudentByNameRollNoNative(@PathVariable String name,@PathVariable int rollNo){

        return Optional.ofNullable(repository.findByNameRollNoNative(name, rollNo));
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
