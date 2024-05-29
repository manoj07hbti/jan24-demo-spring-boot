package com.example.jan24demospringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name ="STUDENT_DB_TABLE")  // it will consider this class as DB table.
public class Student {
    @Id //it will make field as primary key

    @GeneratedValue //it will auto increment id filled in database
    long id;
    String name;
    @Column(name="roll_No")
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

    //Using getter Setter----


