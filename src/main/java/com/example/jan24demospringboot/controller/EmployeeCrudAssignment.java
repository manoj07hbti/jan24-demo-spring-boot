package com.example.jan24demospringboot.controller;


import com.example.jan24demospringboot.model.EmployeeUpdate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeCrudAssignment {

    //we need arraylist of Employee variable----
    ArrayList<EmployeeUpdate> employeeUpdateArrayList = new ArrayList<>();
    // create


    @RequestMapping("/addEmployee")
    public String addEmployee(@RequestBody EmployeeUpdate employeeUpdate){

        // EmployeeUpdate employeeUpdate = new EmployeeUpdate(name ,empId ,emp_dept);

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
