package com.example.jan24demospringboot.service;

import com.example.jan24demospringboot.model.EmployeeUpdate;
import com.example.jan24demospringboot.repository.EmployeeUpdateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class EmployeeUpdateService {

    @Autowired
    EmployeeUpdateRepository repository;

    public String addEmployee(EmployeeUpdate employeeUpdate){

        repository.save(employeeUpdate);// Insert Into Employee....
        return "Employee data added to the DataBase";

    }

    public List<EmployeeUpdate> getAllEmployee(){

        return repository.findAll();//select*from table
    }

    public String updateName(String newName , long id){

      // find record from DB

        EmployeeUpdate employeeUpdate = repository.getById(id); // select*from EMPLOYEE_TABLE_JAN24_JAVA where id=7

        // update the name with the help of setter method

        employeeUpdate.setName(newName);

        // save back to the database again

        repository.save(employeeUpdate);

        return "Name" +newName+ "updated successfully";

    }
    public String update_emp_dept(String new_emp_dept , long id){

        EmployeeUpdate employeeUpdate = repository.getById(id);

        employeeUpdate.setEmp_dept(new_emp_dept);

        repository.save(employeeUpdate);

        return "emp_dept" +new_emp_dept+"updated successfully";
    }

    public String removeEmployee(long id){

        repository.deleteById(id);// delete from table where id=

        return "Data removed successfully....";

    }

}
