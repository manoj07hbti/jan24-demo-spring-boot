package com.example.jan24demospringboot.model;

public class Doctor {

    String name;

    int age;

    float salary;

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
