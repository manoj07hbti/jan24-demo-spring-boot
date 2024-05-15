package com.example.jan24demospringboot.model;

public class City {

    String name;

    int population;

    // param constructor


    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    // getter and setter


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
