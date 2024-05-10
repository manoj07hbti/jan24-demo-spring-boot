package com.example.jan24demospringboot.Demo_Controller.CRUD_cont;
import com.example.jan24demospringboot.modal.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Crud_stuudent {

    ArrayList<Student> StudentArrayList = new ArrayList<>();

    @RequestMapping("/AddS/{name}/{roll}/{sec}")
    public String addStudent(@PathVariable String name,@PathVariable int roll , @PathVariable String sec ) {
        Student Student = new Student(name,roll, sec);
        StudentArrayList.add(Student);
        return "Sucess";
    }

    @RequestMapping("/get_S")
    public ArrayList<Student> getStudentArrayList() {
        return StudentArrayList;
    }

    @RequestMapping("/updatename/{index}/{newname}")
    public String update(@PathVariable int index,@PathVariable String newname){
        Student student = StudentArrayList.get(index);
        student.setName(newname);
       
        return "Success";


    }
    @RequestMapping("/delete/{index}")
    public String remove (@PathVariable int index){
        StudentArrayList.remove(index);
        return  "Success";
    }
}
