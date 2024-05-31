package com.example.jan24demospringboot.Models;
public class Emp {
    String name;
    int ID;
    String Dept;

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
