package com.COMP2013;

public abstract class Employee implements Employable {

    private int employeeID;
    private String employeeName;
    private int salary;
    static int numEmployees;

    public void Employee(){
        this.employeeID = 0;
        this.employeeName = "Unknown";
        this.salary = 0;
    }

    @Override
    public void setEmployeeID(int number) {
        this.employeeID = number;
    }

    @Override
    public int getEmployeeID() {
        return employeeID;
    }

    @Override
    public void setEmployeeName(String name) {
        this.employeeName = name;
    }

    @Override
    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int calculateChristmasBonus() {
        int salary = getSalary();
        int christmasbonus;
        christmasbonus = salary * 4;

        return christmasbonus;
    }
}
