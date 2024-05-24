package com.example.jan24demospringboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "ENGINEER_JAN24_JAVA")
public class Engineer {

    @Id
    @GeneratedValue

    long Id;
    String name;

    int age;

    String dept;

    Double Salary;

    // Default constructor

    public Engineer() {
    }


    // param constructor


    public Engineer(String name, int age, String dept, Double salary) {
        this.name = name;
        this.age = age;
        this.dept = dept;
        Salary = salary;
    }

    // getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }
}
