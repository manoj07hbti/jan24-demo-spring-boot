package com.example.jan24demospringboot.controller.CrudOperation;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
@RestController
public class Marks {
    HashMap<String,Integer>MidExamsMarks=new HashMap<>();
    @RequestMapping("/AddMarks/{StudentName}/{marks}")
    public String AddMarks(@PathVariable String StudentName, @PathVariable int marks){
        MidExamsMarks.put(StudentName,marks);
        return "Details of "+StudentName+" is Added Successfully...";
    }
    @RequestMapping("/GetMarks")
    public HashMap<String,Integer> GetMarks(){
        return MidExamsMarks;
    }
    @RequestMapping("/UpdateMarks/{StudentName}/{oldMarks}/{newMarks}")
    public String UpdateMarks(@PathVariable String StudentName,@PathVariable int oldMarks,@PathVariable int newMarks){
        MidExamsMarks.replace(StudentName,oldMarks,newMarks);
        return StudentName+"'S Details Updated Successfully....";
    }
    @RequestMapping("/RemoveMarks/{name}")
    public String RemoveMarks(@PathVariable String name){
        MidExamsMarks.remove(name);
        return "Marks Removed Successfully";
    }
}
