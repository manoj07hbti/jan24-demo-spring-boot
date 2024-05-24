package com.example.jan24demospringboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DoctorTable {

    @Id
    @GeneratedValue
    long id;

    String name;

    int age;

    double salary;

    public DoctorTable() {
    }
}
