package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.EmployeeUpdate;
import com.example.jan24demospringboot.service.EmployeeUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeUpdateDBController {

    @Autowired
    EmployeeUpdateService service;

    @PostMapping("/addEmployee_db")
    public String addEmployee(@RequestBody EmployeeUpdate employeeUpdate){

      return service.addEmployee(employeeUpdate);


    }

}
