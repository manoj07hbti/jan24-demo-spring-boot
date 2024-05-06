package com.example.jan24demospringboot.controller.CrudOperation;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Course {
    ArrayList<String>course=new ArrayList<>();
    @RequestMapping("/AddCourse/{CourseName}")
    public String AddCourse(@PathVariable String CourseName){
        course.add(CourseName);
        return "course "+CourseName+" Added Successfully...";
    }
    @RequestMapping("/GetCourses")
    public ArrayList<String> GetCourses(){
        return course;
    }

    @RequestMapping("/UpdateCourseName/{index}/{Course}")
    public String UpdateCourseName(@PathVariable int index,@PathVariable String Course){
        course.set(index,Course);
        return "Course Updated Successfully...";
    }
    @RequestMapping("/RemoveCourse/{index}")
    public String RemoveCourse(@PathVariable int index){
        course.remove(index);
        return "Course Removed Successfully...";
    }
}
