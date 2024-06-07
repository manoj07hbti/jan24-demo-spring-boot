package com.example.jan24demospringboot.service;

import com.example.jan24demospringboot.Models.Student;
import com.example.jan24demospringboot.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    IStudentRepository repository;
    public String addStudent(Student student){
        repository.save(student);
        return "Student details added successfully...";
    }
}
