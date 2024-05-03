package com.example.jan24demospringboot.model;

public class Employee {
    String name;
    int empId;
    String dept;
    //parameterized constructor
    // R-click->Generate->Constructor-select all property
    public Employee(String name, int empId, String dept) {
        this.name = name;
        this.empId = empId;
        this.dept = dept;
    }
    //using getter and setter method
    //R-click-->Generation-->getter & setter-->select all property


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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
