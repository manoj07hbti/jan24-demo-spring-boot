package com.example.jan24demospringboot.model;

public class EmployeeUpdate {

    String name;

    int empId;

    String emp_dept;

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
