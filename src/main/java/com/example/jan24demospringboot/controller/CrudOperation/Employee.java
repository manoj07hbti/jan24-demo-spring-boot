package com.example.jan24demospringboot.controller.CrudOperation;

import com.example.jan24demospringboot.controller.Assignment.Models.Emp;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Employee {

    ArrayList<Emp> EmpList=new ArrayList<>();
    @RequestMapping("/AddEmployee/{empName}/{Id}/{dept}")
    public String AddEmployee(@PathVariable String empName, @PathVariable int Id,@PathVariable String dept){
        Emp emp=new Emp(empName,Id,dept);
        EmpList.add(emp);
        return "Employee details added successfully....";
    }
    @RequestMapping("/getEmpList")
    public ArrayList<Emp> getEmpList() {
        return EmpList;
    }
    @RequestMapping("/UpdateEmployee/{index}/{name}")
    public String UpdateEmployee(@PathVariable int index,@PathVariable String name) {
        Emp emp=EmpList.get(index);
        emp.setName(name);
        return "Update successful....";
    }
    @RequestMapping("/RemoveEmployee/{index}")
    public String RemoveEmployee(@PathVariable int index){
        EmpList.remove(index);
        return "Employee removed successfully...";
    }

}
