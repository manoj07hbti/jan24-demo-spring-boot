package com.example.jan24demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CRUDController {

    ArrayList<String > course = new ArrayList<>();

    @RequestMapping("/addcourse/{courseName}")
    public String addCourse(@PathVariable String courseName){
        course.add(courseName);

        return "Course "+courseName +" added sucessfully" ;
    }

    @RequestMapping("getallcourse")
    public ArrayList<String> getCourse(){
        return  course ;
    }

    @RequestMapping("updatecourse/{newCourseName}/{index}")
    public String updateCourseName(@PathVariable String newCourseName,@PathVariable int index){
        course.set(index, newCourseName);

        return "name updatesd sucessfully" ;
    }

    @RequestMapping("/removecourse/{index}")
    public String removeCourse(@PathVariable int index){
        course.remove(index);
        return "course removed successfully" ;
    }
}
