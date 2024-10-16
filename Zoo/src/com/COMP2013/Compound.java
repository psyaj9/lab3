package com.COMP2013;

import java.util.ArrayList;

public class Compound {

    private String name;
    private String type;
    private int capacity;
    private ArrayList<Animal> animals;

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    private void addAnimals(Animal animal) {
        this.animals.add(animal);
    }

    public Compound(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    public Compound() {
        this.name = "unknown";
        this.type = "Unknown";
        this.capacity = 50;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
