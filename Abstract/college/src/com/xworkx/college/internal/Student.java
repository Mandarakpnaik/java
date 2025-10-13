package com.xworkx.college.internal;

public class Student extends College{

    public Student(int noOfRooms, String collegeName) {
        super(noOfRooms, collegeName);
    }

    @Override
    public void collegeDetails(int noOfRooms, String collegeName) {

    }
    public void displayStudent()
    {
        System.out.println("this is Student class");
    }
}
