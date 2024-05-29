package com.example.jan24demospringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Employ_DB_LIST")
public class Employee {
    @Id
    @GeneratedValue
    String name;
    int empId;
    @Column(name = "section")
    String dept;


    public Employee() {
    }

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
