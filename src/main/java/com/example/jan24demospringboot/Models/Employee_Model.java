package com.example.jan24demospringboot.Models;
public class Employee_Model {
    int Id;
    String name;
    char gender;
    int salary;

    //param constructor
    public Employee_Model(int id, String name, char gender, int salary) {
       this.Id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
