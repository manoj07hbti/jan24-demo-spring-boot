package com.example.jan24demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CRUDController {
    ArrayList<String > course = new ArrayList<>();



    //Course C-create ,insert ,marge or add data.
    @RequestMapping("/add_course/{courseName}")
    public String addCourse(@PathVariable String courseName){

        course.add(courseName);

        return "Course ["+courseName+"]  Added Successfully";

        // Hit Syntax--> (localhost:8087/add_course/_____
    }
    @RequestMapping("/get_all_course")
    public ArrayList<String >getCourse(){

        return course;
    }

    @RequestMapping("/update_course/{newCourseName}/{index}")
    public String updateCourseName(@PathVariable String newCourseName,@PathVariable int index){
        course.set(index,newCourseName);
        return "Name update successfully----!!!";
    }
    @RequestMapping("/remove_course/{index}")
    public String removeCourse(@PathVariable int index){
        course.remove(index);
        return "Course removed successfully-------!!";
    }
}



