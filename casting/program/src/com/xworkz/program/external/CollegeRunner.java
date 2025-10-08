package com.xworkz.program.external;

import com.xworkz.program.internal.College;
import com.xworkz.program.internal.Student;

public class CollegeRunner {
    public static void main(String[] args) {
        College collegeFees = new Student();
        collegeFees.displayCollege();
        Student studentFee = (Student) collegeFees;
        studentFee.displayStudent();
    }
}
