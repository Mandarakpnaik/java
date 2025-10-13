package com.xworkz.building.internal;

public abstract class Building {
    public int noOfFloor;

    public String buildingName;

    public Building(int noOfFloor,String buildingName)
    {
        this.noOfFloor=noOfFloor;
        this.buildingName=buildingName;
    }
    public void displayBuildingDetails()
    {
        System.out.println("Number of floor");
        System.out.println("Name of building");
    }
    public abstract void buildingDetails(int noOfFloor,String buildingName);


}
