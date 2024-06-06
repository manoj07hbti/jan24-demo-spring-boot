package com.example.jan24demospringboot.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "EMP_9PM")
public class Emp {
    @Id
    @GeneratedValue
    int ID;
    @Column
    String name;
    @Column
    String Dept;

    //Default Constructor

    public Emp() {
    }

    public Emp(String name, int ID, String dept) {
        this.name = name;
        this.ID = ID;
        this.Dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        this.Dept = dept;
    }
}
