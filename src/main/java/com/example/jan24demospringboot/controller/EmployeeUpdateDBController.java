package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.EmployeeUpdate;
import com.example.jan24demospringboot.service.EmployeeUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeUpdateDBController {

    @Autowired
    EmployeeUpdateService service;

    @PostMapping("/addEmployee_db")
    public String addEmployee(@RequestBody EmployeeUpdate employeeUpdate){

      return service.addEmployee(employeeUpdate);
    }

    @GetMapping("/employee")

    public List<EmployeeUpdate> getAllEmployee(){

        return service.getAllEmployee();
    }

    @PatchMapping("/name_update")
    public String updateName(@RequestParam String newName , @RequestParam long id){

        return service.updateName(newName, id);
    }

    @PatchMapping("/emp_dept_update")
    public String update_emp_dept(@RequestParam String new_emp_dept , @RequestParam long id){

        return service.update_emp_dept(new_emp_dept, id);
    }

    @DeleteMapping("/remove_employee_bd")
    public String removeEmployee(@RequestParam long id){

        return service.removeEmployee(id);

    }



}
