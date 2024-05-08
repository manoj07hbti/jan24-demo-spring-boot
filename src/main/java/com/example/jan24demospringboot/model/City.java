package com.example.jan24demospringboot.model;

public class City {
    String name;
    double population;
    String region;

    public City(String name, double population, String region) {
        this.name = name;
        this.population = population;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
