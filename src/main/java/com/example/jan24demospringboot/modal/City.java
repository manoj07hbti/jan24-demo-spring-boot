package com.example.jan24demospringboot.modal;

import javax.persistence.*;

@Entity(name = "City")
public class City {

    @SequenceGenerator(name = "city_seq")
    @Column(name = "ID")
    @Id
    @GeneratedValue
    long id;

    public City() {
    }

    String name;
    int population;
    int indX;
    String newname;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public int getIndX() {
        return indX;
    }

    public void setIndX(int indX) {
        this.indX = indX;
    }

    public String getNewname() {
        return newname;
    }

    public void setNewname(String newname) {
        this.newname = newname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
    
}
