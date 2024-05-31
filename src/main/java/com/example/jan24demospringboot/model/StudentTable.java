package com.example.jan24demospringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="student_table")
public class StudentTable {
    @Id
    @GeneratedValue
    long id;

    String name;

    @Column(name="roll_no")
    int rollNo;

    String section;

    public StudentTable() {
    }

    public StudentTable(long id, String name, int rollNo, String section) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }


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
