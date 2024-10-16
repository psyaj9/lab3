package com.COMP2013;

public class ZooApp {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Zoo zoo1 = new Zoo("Japan", 5);
        Zoo zoo2 = new Zoo("London", 43);
        System.out.println(zoo1.printInfo());
        System.out.println(zoo2.printInfo());
        ZooCorp megaZoo = new ZooCorp();
        megaZoo.addZoo(zoo1);
        megaZoo.addZoo(zoo2);
        Zoo zoo3 = new Zoo("Lonn", 4);
        zoo3.buildNewCompound();
        Employee sue = new Zookeeper("sue");
        Employee peter = new Admin("peter");

    }
}
