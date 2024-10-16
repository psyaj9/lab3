package com.COMP2013;

import java.util.ArrayList;

public class Zoo {

    private String location;
    private int numCompounds;
    public static int zooNums = 0;
    private int zooID = 1;
    private ArrayList<Compound> compounds;


    public Zoo(){
        this.setLocation("unknown");
        this.setNumCompounds(30);
        this.setZooID(getZooID());
        compounds = new ArrayList<Compound>();
        zooNums =  zooNums + 1;
        zooID = zooID + 1;
        for (int i=0;i<numCompounds;i++){
            addCompound(new Compound());
        }
    }

    private void addCompound(Compound compound) {
        this.compounds.add(compound);
    }

    public Zoo(String location, int numCompounds){
        this.setLocation(location);
        this.setNumCompounds(numCompounds);
        this.setZooID(getZooID());
        zooNums =  zooNums + 1;
        zooID = zooID + 1;
    }

    public void setNumCompounds(int numCompounds) {
        this.numCompounds = numCompounds;
    }

    public int getNumCompounds() {
        return numCompounds;
    }

    public void buildNewCompound(){
        int newNumCompounds = getNumCompounds();

        newNumCompounds = newNumCompounds + 1;

        this.numCompounds = newNumCompounds;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String printInfo(){
        String string = "The zoo's location is " + this.location + " and the number of compounds is " + this.numCompounds;

        return string;
    }


    public int getZooID() {
        return zooID;
    }

    public void setZooID(int zooID) {
        this.zooID = zooID;
    }
}
