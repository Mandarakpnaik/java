package com.xworkx.college.internal;

public abstract class College {

    public int noOfRooms;
    public String collegeName;

    public College(int noOfRooms,String collegeName)
    {
        this.collegeName=collegeName;
        this.noOfRooms=noOfRooms;
    }
    public void displayCollege()
    {
        System.out.println("Number of rooms in college");
        System.out.println("College name");

    }
    public  abstract void collegeDetails(int noOfRooms,String collegeName);
}
