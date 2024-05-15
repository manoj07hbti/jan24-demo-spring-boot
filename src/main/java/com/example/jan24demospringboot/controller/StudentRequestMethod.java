package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentRequestMethod {
    //we need arraylist of student variable----
    ArrayList<Student> studentArrayList = new ArrayList<>();
    // create



    //general use instruction--
    // @RequestMapping(value = "/add_student",method = RequestMethod.POST)
    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student){



        studentArrayList.add(student);

        return "Student data added successfully";

    }
    @GetMapping("/get_all_students")
    public ArrayList<Student>getStudentArrayList(){

        return studentArrayList;
    }
    @PutMapping("/update_std/{index}/{newName}")
    public String updateStudentName(@PathVariable int index, @PathVariable String newName){
        //get the object----
        Student student = studentArrayList.get(index);
        //change the name----
        student.setName(newName);
        return "Name update successfully as  "+newName;

    }
    @DeleteMapping("/delete_std/{index}")
    public String remove(@PathVariable int index){
        studentArrayList.remove(index);
        return " data deleted successfully ---";
    }
}
