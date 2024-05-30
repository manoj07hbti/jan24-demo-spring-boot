package com.example.jan24demospringboot.Service;

import com.example.jan24demospringboot.Repository.StudentDB_Repo;
import com.example.jan24demospringboot.modal.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentDB_Service {


    @Autowired
    StudentDB_Repo repository;

    public String addStudent( Student student) {

        repository.save(student);
        return "Sucess";
    }
}
