package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.City;
import com.example.jan24demospringboot.model.College;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class College_Crud {

    ArrayList<College> collegeArrayList = new ArrayList<>();

    //Create Data ----
    @PostMapping("/college_add")
    public String addCollege(@RequestBody College college1){
        //College college1 = new College(collegeName,add,student_strength);

        collegeArrayList.add(college1);

        return " College Data successfully Added.......";

    }

    @RequestMapping("/Get_College")
    public ArrayList<College>getCollegeArrayList(){

        return collegeArrayList;
    }

    @RequestMapping("/Update_CollegeName/{newCollegeName}/{index}")
    public String updateCollegeName(@PathVariable String newCollegeName, @PathVariable int index){
        College college1= collegeArrayList.get(index);
        college1.setCollegeName(newCollegeName);
        return "College Name Updated successfully--"+newCollegeName;
    }

}
