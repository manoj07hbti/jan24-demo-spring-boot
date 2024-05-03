package com.example.jan24demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CRUDController {



    ArrayList<String> course= new ArrayList<>();

    //Course C- create or insert or add
    @RequestMapping("/add_course/{courseName}")
    public String addCourse(@PathVariable String courseName){

        course.add(courseName);

        return "Course "+courseName+ " Added successfully..";
    }

    @RequestMapping("/get_all_course")
    public ArrayList<String> getCourse(){

        return course;
    }

    @RequestMapping("/update_course/{newCourseName}/{index}")
    public String updateCourseName(@PathVariable String newCourseName,@PathVariable int index){

        course.set(index,newCourseName);

        return "Name updated Successfully...";

    }

    @RequestMapping("/remove_course/{index}")
    public String removeCourse(@PathVariable int index){

        course.remove(index);

        return "Course removed successfully...";
    }

}
