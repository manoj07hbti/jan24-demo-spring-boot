package com.example.jan24demospringboot.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "student_details")
public class Student {

    @Id
    @GeneratedValue
    long id;
    String name;
    int rollNo;
    String section;

    //default constructor
    public Student() {
    }

    //param constructor
    public Student(long id, String name, int rollNo, String section) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    // getter setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
