package com.example.jan24demospringboot.Demo_Controller.CRUD_cont.Postman;
import com.example.jan24demospringboot.modal.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@RequestMapping
public class Employee_Crud {

    @RequestMapping()
    ArrayList<Employee> employees = new ArrayList<>();
    public void stuName(){


    }

}
