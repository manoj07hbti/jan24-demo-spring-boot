package com.example.jan24demospringboot.controller;

import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class ProjectMarksCURD {


    ArrayList<Integer> marks = new ArrayStack<>();
    @RequestMapping("/add_marks/{no}")
    public String add (@PathVariable int mark){
        // marks ---- add insert put
        marks.add(mark);
        return "Digit Successfully added";
    }


    @RequestMapping("/get_marks")
    public ArrayList<Integer> getMarks(){
        return marks;
    }



    @RequestMapping("/update_marks/{no}/{index}")
    public String updateMarks (@PathVariable int mark, @PathVariable int index){
        marks.set(index,mark);
        return "successfully Updated";
    }



    @RequestMapping("/remove_marks/{index}")
    public String removeMarks (@PathVariable int index){

        marks.remove(index);
        return " successfully Removed";
    }

}
