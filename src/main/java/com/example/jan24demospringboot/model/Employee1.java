package com.example.jan24demospringboot.model;

public class Employee1 {

    int id;

    String name;

    String gender;

    Double salary;

    // param constructor


    public Employee1(int id, String name, String gender, Double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    // getter and setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
