package com.example.jan24demospringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Doctor_Jan24_Java")
public class Doctor {

    @Id
    @GeneratedValue
    long Id;
    String name;

    @Column(name ="Doctor_Age")
    int age;

    float salary;

    // Default Constructor

    public Doctor() {
    }


    // param constructor

    public Doctor(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
