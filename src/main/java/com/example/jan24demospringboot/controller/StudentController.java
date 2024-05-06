package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {

 // we need arraylist of Student variable
    ArrayList<Student> studentArrayList = new ArrayList<>();


    //C

    @RequestMapping("/add_student")
    public String addStudent(@RequestParam String name,@RequestParam int rollNo,@RequestParam String section){

        Student student= new Student(name,rollNo, section);

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
