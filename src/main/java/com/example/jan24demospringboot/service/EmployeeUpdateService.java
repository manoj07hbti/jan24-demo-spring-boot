package com.example.jan24demospringboot.service;

import com.example.jan24demospringboot.model.EmployeeUpdate;
import com.example.jan24demospringboot.repository.EmployeeUpdateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeUpdateService {

    @Autowired
    EmployeeUpdateRepository repository;

    public String addEmployee(EmployeeUpdate employeeUpdate){

        repository.save(employeeUpdate);// Insert Into Employee....
        return "Employee data added to the DataBase";

    }

}
