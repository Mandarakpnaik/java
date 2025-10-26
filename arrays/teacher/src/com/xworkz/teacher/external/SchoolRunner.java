package com.xworkz.teacher.external;

import com.xworkz.teacher.internal.SchoolName;
import com.xworkz.teacher.internal.Subject;
import com.xworkz.teacher.internal.Teacher;

public class SchoolRunner {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Subject[] subjectName = {new Subject("kannada", "english", "Hindi", "Science")};
        Subject[] subjects = {new Subject("English", "kannada", "hindi", "sicence")};
        Subject[] subject = {new Subject("Hindi", "kannada", "English", "Science")};

        SchoolName name = new SchoolName("Ganga central", 45678900, subjectName);
        SchoolName schoolNames = new SchoolName("Vidya vikas", 797654567, subjects);
        SchoolName names = new SchoolName("akash ", 5678900, subject);
        SchoolName teacherName = new SchoolName("MDRS", 2345677, subjects);
        SchoolName school = new SchoolName("viday public school", 78909876, subject);

        SchoolName[] schools = {name, schoolNames, names, teacherName, school};
        teacher. displayTeacher(schools);
}
}
