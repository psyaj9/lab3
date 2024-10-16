package com.COMP2013;

import java.util.ArrayList;

import static com.COMP2013.Employee.numEmployees;
import static com.COMP2013.Zoo.zooNums;

public class ZooCorp {
    private ArrayList<Zoo> zoos;
    private ArrayList<Employee> employees;

    public void ZooCorp(Zoo zoo, Employee employee){
        for (int i=0;i<zooNums;i++) {
            addZoo(new Zoo());
        }
    }

    private void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void addZoo(Zoo zoo) {
        this.zoos.add(zoo);
    }
}
