package com.example.jan24demospringboot.model;

public class Employee1 {
    String name;
    int emp_id;
    String dept;

    public Employee1(String name, int emp_id, String dept) {
        this.name = name;
        this.emp_id = emp_id;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
