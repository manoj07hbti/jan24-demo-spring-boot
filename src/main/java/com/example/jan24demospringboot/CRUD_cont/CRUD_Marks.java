package com.example.jan24demospringboot.CRUD_cont;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CRUD_Marks {

    ArrayList<Integer> marks = new ArrayList<>();

    @RequestMapping("/add/{mark}")
    public String add (@PathVariable int mark){

        marks.add(mark);
        return "Successfully added";
    }
    @RequestMapping("/getM")
    public ArrayList<Integer> getM(){
        return marks;
    }

    @RequestMapping("/updateM/{mark}/{index}")
    public String update (@PathVariable int mark, @PathVariable int index){
        marks.set(index,mark);
        return "success";
    }
    @RequestMapping("/removem/{index}")
    public String removem (@PathVariable int index){

        marks.remove(index);
        return " success";
    }

}
