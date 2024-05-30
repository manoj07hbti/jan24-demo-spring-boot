package com.example.jan24demospringboot.Demo_Controller.AppArch;

import com.example.jan24demospringboot.Service.StudentDB_Service;
import com.example.jan24demospringboot.modal.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentDB_Cont {

    @Autowired
    StudentDB_Service Service;
    @PostMapping("/AddS")
    public String addStudent(@RequestBody Student student) {

        return Service.addStudent(student);

    }
}
