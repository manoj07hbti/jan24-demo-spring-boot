package com.example.jan24demospringboot.service;

import com.example.jan24demospringboot.model.Student;
import com.example.jan24demospringboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository repository;
    public String addStudent(Student student){
        repository.save(student);// insert INto student quarry
        return "Student added to the DATABASE successfully...";
    }
}
