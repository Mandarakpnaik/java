package com.xworkz.school.internal;

public class School {
    public void displaySchool(Student[] students) {
        for (Student student : students) {
            student.displayStudent();
        }
    }
}
