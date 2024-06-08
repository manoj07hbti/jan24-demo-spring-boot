package com.example.jan24demospringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "College_Jan24_Java")
public class College {

    @Id
    @GeneratedValue
    long id;

    String collegeName;

    @Column(name="address")
    String add;

    int studentStrength;

    // Default Constructor

    public College() {
    }


    // param constructor


    public College(long id, String collegeName, String add, int studentStrength) {
        this.id = id;
        this.collegeName = collegeName;
        this.add = add;
        this.studentStrength = studentStrength;
    }

    // getter setter


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getStudentStrength() {
        return studentStrength;
    }

    public void setStudentStrength(int studentStrength) {
        this.studentStrength = studentStrength;
    }
}
