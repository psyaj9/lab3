package com.COMP2013;

public class Admin extends Employee{

    private String name;

    public Admin(String name){
        this.name = name;
        numEmployees = numEmployees + 1;
    }

    @Override
    public int calculateChristmasBonus() {
        return super.calculateChristmasBonus();
    }
}
