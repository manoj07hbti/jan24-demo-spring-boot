package com.example.jan24demospringboot.model;

public class City {
    String name;
    int population;
    String place;

    //param constructor

    public City(String name, int population, String place) {
        this.name = name;
        this.population = population;
        this.place = place;
    }
    //getter- setter

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

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
