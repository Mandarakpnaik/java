package com.xworkz.school.internal;

public class Student {
    public String name;
    public int age;
    public Grade[] grade;
    public Student(String name,int age,Grade[] grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
    public void displayStudent() {
        System.out.println("name of the students:" + name);
        System.out.println("number of students:" + age);
        System.out.println("grades:" + grade);
        displayGrade();
    }
    public  void displayGrade(){
        for(Grade grades:grade){
            grades.displayClass();
        }
    }
}
