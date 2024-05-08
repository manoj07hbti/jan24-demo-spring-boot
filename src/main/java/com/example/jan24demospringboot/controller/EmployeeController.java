package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.Employee1;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeController {
    ArrayList<Employee1> employee1ArrayList = new ArrayList<>();

    @RequestMapping("/addemployee/{name}/{emp_id}/{dept}")
    public String addEmployee(@PathVariable String name,@PathVariable int emp_id,@PathVariable String dept){
        Employee1 employee1 = new Employee1(name, emp_id, dept);
        employee1ArrayList.add(employee1);
        return "Employee added ..";
    }
    @RequestMapping("/getemployees")
    public ArrayList<Employee1> getEmployees(){
        return employee1ArrayList;
    }

    @RequestMapping("/update_empname/{newName}/{index}")
    public String updateEmployeeName(@PathVariable String newName, @PathVariable int index){
        Employee1 employee1 = employee1ArrayList.get(index);
        employee1.setName(newName);
        return newName +" updated successfully";
    }

    @RequestMapping("/update_empid/{empid}/{index}")
    public String updateEmployeeId(@PathVariable int empid, @PathVariable int index){
        Employee1 employee1 = employee1ArrayList.get(index);
        employee1.setEmp_id(empid);
        return empid +" emp_id updated ..";
    }

    @RequestMapping("/update_dept/{newDept}/{index}")
    public String updateEmployeeDept(@PathVariable String newDept, @PathVariable int index){
        Employee1 employee1 = employee1ArrayList.get(index);
        employee1.setDept(newDept);
        return newDept +" dept updated successfully";
    }

    @RequestMapping("/remove_employee/{index}")
    public String removeEmployee(@PathVariable int index){
        employee1ArrayList.remove(index);
        return "employee removed successfully";
    }
}
