package com.example.jan24demospringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "STUDENT_JAN24_JAVA") // it will consider this class as db table
public class Student {

    @Id //it will make your field as primary key
    @GeneratedValue // it will auto increment id filed in database
    long id;

    String name;
    @Column(name="roll_no")
    int rollNo;
    String section;
// default constructor

    public Student() {
    }

    public Student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
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
