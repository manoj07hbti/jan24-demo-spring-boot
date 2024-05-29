package com.example.jan24demospringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "College_Jan24_Java")
public class College {

    @Id
    @GeneratedValue
    long Id;

    String college_name;

    @Column(name="address")
    String add;

    int student_strength;

    // Default Constructor

    public College() {
    }


    // param constructor

    public College(long id, String college_name, String add, int student_strength) {
        Id = id;
        this.college_name = college_name;
        this.add = add;
        this.student_strength = student_strength;
    }


    // getter and setter


    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getCollege_name() {
        return college_name;
    }

    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getStudent_strength() {
        return student_strength;
    }

    public void setStudent_strength(int student_strength) {
        this.student_strength = student_strength;
    }
}
