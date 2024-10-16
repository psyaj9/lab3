package com.COMP2013;

public class Zookeeper extends Employee{

    private String name;

    public Zookeeper(String name2){
        this.setName(name2);
        numEmployees = numEmployees + 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name2) {
        this.name = name;
    }

    @Override
    public int calculateChristmasBonus() {
        return super.calculateChristmasBonus();
    }
}
