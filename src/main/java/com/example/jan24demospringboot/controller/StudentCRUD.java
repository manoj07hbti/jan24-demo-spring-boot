package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentCRUD {
    //we need arraylist of student variable----
    ArrayList<Student> studentArrayList = new ArrayList<>();
    // create


    @RequestMapping("/add_student")
    public String addStudent(@RequestParam String name, @RequestParam int rollNO, @RequestParam String section){
        Student student = new Student(name,rollNO,section);

        studentArrayList.add(student);

        return "Student data added successfully";

    }
    @RequestMapping("/get_all_students")
    public ArrayList<Student>getStudentArrayList(){

        return studentArrayList;
    }
    @RequestMapping("/update_std/{index}/{newName}")
    public String updateStudentName(@PathVariable int index,@PathVariable String newName){
        //get the object----
        Student student = studentArrayList.get(index);
        //change the name----
        student.setName(newName);
        return "Name update successfully as  "+newName;

    }
    @RequestMapping("/delete_std/{index}")
    public String remove(@PathVariable int index){
        studentArrayList.remove(index);
        return " data deleted successfully ---";
    }



}
