package com.example.jan24demospringboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EngineerTable {

    @Id
    @GeneratedValue
    long id;

    String name;

    String dept;

    double salary;

    int age;

    public EngineerTable() {
    }
}
