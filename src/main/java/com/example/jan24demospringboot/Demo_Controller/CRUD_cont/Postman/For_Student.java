package com.example.jan24demospringboot.Demo_Controller.CRUD_cont.Postman;

import com.example.jan24demospringboot.modal.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class For_Student {


    ArrayList<Student> StudentArrayList = new ArrayList<>();

    @RequestMapping("/AddSC")
    public String addStudentC(@RequestBody Student student) {
       // Student Student = new Student();
        StudentArrayList.add(student);
        return "Sucess";
    }

    @RequestMapping("/get_SC")
    public ArrayList<Student> getStudentArrayList() {
        return StudentArrayList;
    }

    @RequestMapping("/updatenameC/{index}/{newname}")
    public String update(@PathVariable int index,@PathVariable String newname){
        Student student = StudentArrayList.get(index);
        student.setName(newname);

        return "Success";


    }
    @RequestMapping("/deleteC/{index}")
    public String remove (@PathVariable int index){
        StudentArrayList.remove(index);
        return  "Success";
    }
}
