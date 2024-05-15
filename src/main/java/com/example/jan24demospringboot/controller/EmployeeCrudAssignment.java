package com.example.jan24demospringboot.controller;


import com.example.jan24demospringboot.model.EmployeeUpdate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeCrudAssignment {

    //we need arraylist of Employee variable----
    ArrayList<EmployeeUpdate> employeeUpdateArrayList = new ArrayList<>();
    // create


    @RequestMapping("/addEmployee/{name}/{empId}/{emp_dept}")
    public String addEmployee(@PathVariable String name, @PathVariable int empId, @PathVariable String emp_dept){

        EmployeeUpdate employeeUpdate = new EmployeeUpdate(name ,empId ,emp_dept);

        employeeUpdateArrayList.add(employeeUpdate);
        return "Employee data added successfully";

    }
    @RequestMapping("/get_all_employee")
    public ArrayList<EmployeeUpdate> getEmployeeUpdateArrayList(){

        return employeeUpdateArrayList;
    }
    @RequestMapping("/update_employee/{newEmployeeName}/{index}")
    public String UpdateEmployee(@PathVariable String newEmployeeName, @PathVariable int index){
        //get the object----
        EmployeeUpdate employeeUpdate = employeeUpdateArrayList.get(index);
        //change the name----
        employeeUpdate.setName(newEmployeeName);
        return "Employee Name update successfully as  "+newEmployeeName;

    }
    @RequestMapping("/delete_employee/{index}")
    public String remove(@PathVariable int index){
        employeeUpdateArrayList.remove(index);
        return " Employee Data Deleted Successfully ---";
    }


}
