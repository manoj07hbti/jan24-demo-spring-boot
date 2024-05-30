package com.example.jan24demospringboot.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Docc")
public class Doctor1 {

    @Id
    @GeneratedValue
    long id;

    public Doctor1() {
    }

    String Name;
   int age;

    public String getName() {
        return Name;
    }

    public Doctor1(String name, int age) {
        Name = name;
        this.age = age;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
