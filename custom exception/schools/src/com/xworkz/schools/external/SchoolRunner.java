package com.xworkz.schools.external;

import com.xworkz.schools.internal.Schools;

public class SchoolRunner {
    public static void main(String[] args) {
        Schools school=new Schools();

        school.displayTotalStudents(10000);

        school.displaySchoolName("Bapuji");

        school.displaySchoolAdrress("Durga");

        school.displayStudentId(101);

        school.displayTotalStudentsfee(500001);
    }
}
