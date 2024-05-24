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
}
