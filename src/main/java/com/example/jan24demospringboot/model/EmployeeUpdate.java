package com.example.jan24demospringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "EMPLOYEE_TABLE_JAN24_JAVA")
public class EmployeeUpdate {

    @Id // it will consider this class as db table
    @GeneratedValue // // it will auto increment id filed in database

    long id;
    String name;

    @Column(name = "emp_Id")
    int empId;

    String emp_dept;

    // Default Constructor

    public EmployeeUpdate() {
    }


    // param constructor

    public EmployeeUpdate(String name, int empId, String emp_dept) {
        this.name = name;
        this.empId = empId;
        this.emp_dept = emp_dept;
    }


    // getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmp_dept() {
        return emp_dept;
    }

    public void setEmp_dept(String emp_dept) {
        this.emp_dept = emp_dept;
    }
}
