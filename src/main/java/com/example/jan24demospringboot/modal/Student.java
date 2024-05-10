package com.example.jan24demospringboot.modal;


import java.util.Objects;

public class Student {

    String name;
    int roll;
    String sec;

    public Student(String name, int roll, String sec) {
        this.name = name;
        this.roll = roll;
        this.sec = sec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }
}
