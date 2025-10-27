package com.xworkz.school.external;

import com.xworkz.school.internal.Grade;
import com.xworkz.school.internal.School;
import com.xworkz.school.internal.Student;

public class SchoolRunner {
    public static void main(String[] args) {
        School school =new School();
        Grade[] gradenumber1 = {new Grade("Lkg", "Ukg", "First", "Second")};
        Grade[] gradenumber2={new Grade("third","fourth","fifth","sixth")};
        Grade[]gradenumber3={new Grade("1bsc","2bsc","3rdbsc","fourtbsc")};
        Grade[]gradenumber4={new Grade("10thgrade","puc","diplom","dgrew")};


        Student  firststudents=new Student("chandan",20,gradenumber1);
        Student secondstudents=new Student("chethan",18,gradenumber2);
        Student thirdstudents=new Student("yashu",8,gradenumber3);
        Student fourthstudents=new Student("hasini",7,gradenumber4);
        Student[]students={firststudents,secondstudents,thirdstudents,fourthstudents};
        school.displaySchool(students);


    }
}

