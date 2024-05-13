package com.example.jan24demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CRUDControllerAssignment {

    //Course C - create or insert or add

    ArrayList<String> course = new ArrayList<>();

    @RequestMapping("/course_add/{courseName}")
    public String addCourse(@PathVariable String courseName){

        course.add(courseName);

        return "Course "+courseName+ "Added Successfully...";

    }
    @RequestMapping("/getallcourse")
        public ArrayList<String> getCourse(){

        return course;
        }

        @RequestMapping("/course_update/{newCourseName}/{index}")
        public String updateCourseName(@PathVariable String newCourseName , @PathVariable int index){
        course.set(index, newCourseName);
        return "Name updated Successfully";
        }

        @RequestMapping("/course_remove/{index}")
        public String removeCourse(@PathVariable int index){
        course.remove(index);

        return "Course Removed Successfully";

        }

}
