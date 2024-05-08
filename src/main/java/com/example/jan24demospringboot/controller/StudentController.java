package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentController {

 // we need arraylist of Student variable
    ArrayList<Student> studentArrayList = new ArrayList<>();


    //C

    @RequestMapping("/add_student")
    public String addStudent(@RequestBody Student student){

        //Student student= new Student(name,rollNo, section);

        studentArrayList.add(student);
        return "Student added successfully...";
    }

    @RequestMapping("/get_all_students")
    public ArrayList<Student> getStudentArrayList(){

        return studentArrayList;
    }

    @RequestMapping("update_std/{index}/{newName}")
    public String updateStudentName(@PathVariable int index, @PathVariable String newName){
        //get the object
        Student student= studentArrayList.get(index);
        //change the name
        student.setName(newName);
        return "Name updates successfully as "+newName;

    }

    @RequestMapping("/delete_std/{index}")
    public String remove(@PathVariable int index){
        studentArrayList.remove(index);
        return "deleted successfully...";

    }

}
