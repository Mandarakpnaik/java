package com.xworkz.students.external;

import com.xworkz.students.bridge.*;
import com.xworkz.students.internal.*;

public class StudentsRunner {
    public static void main(String[] args) {
        Students students = new StudentsImpli();
        StudentDetails studentDetails = new StudentDetails(12,"Sushma");
        students.students(studentDetails);
        StudentsAttendence studentsAttendence = new StudentsAttendence(8.6f,"vinay");
        students.studentName(studentsAttendence);
        StudentsInfo studentsInfo = new StudentsInfo("Vidya vikas collge","Kumar");
        students.info(studentsInfo);
        StudentsMarks studentsMarks = new StudentsMarks("Arun",55.7f);
        students.marks(studentsMarks);
        StudentsPerformance studentsPerformance = new StudentsPerformance("sunitha",'G');
        students.performance(studentsPerformance);

        System.out.println("------------------------------------------------------");


        StudentsInformation studentsInformation = new StudentsInformationImpli();
        StudentDetails studentsDetail = new StudentDetails(18,"Kavya");
        studentsInformation.students(studentDetails);
        StudentsAttendence studentAttendence = new StudentsAttendence(7.4f,"karna");
        studentsInformation.studentName(studentAttendence);
        StudentsInfo studentInfo = new StudentsInfo("akash","Kumar");
        studentsInformation.info(studentInfo);
        StudentsMarks studentMarks = new StudentsMarks("Arun",78.7f);
        studentsInformation.marks(studentMarks);
        StudentsPerformance studentPerformance = new StudentsPerformance("kavya",'G');
        studentsInformation.performance(studentPerformance);

        System.out.println("-----------------------------------------------------------------");

        College college = new CollegeImpli();
        StudentDetails  num= new StudentDetails(22,"Mandara");
        college.students(num);
        StudentsAttendence value = new StudentsAttendence(88.56f,"deepa");
        college.studentName(value);
        StudentsInfo studentNumber = new StudentsInfo("SRS college","vidya");
        college.info(studentNumber);
        StudentsMarks markInSubject = new StudentsMarks("ramesh",85.7f);
       college.marks(markInSubject);
        StudentsPerformance performanceInSubject = new StudentsPerformance("rakshita",'G');
       college.performance(performanceInSubject);
        System.out.println("------------------------------------------------------------");

        StudentMark studentMark= new StudentMarkImpli();

        StudentDetails Detail = new StudentDetails(34,"Kavya");
        studentMark.students(Detail);
        StudentsAttendence Attendence = new StudentsAttendence(8.4f,"karna");
        studentMark.studentName(Attendence);
        StudentsInfo iinfo = new StudentsInfo("MDRs","Kumar");
       studentMark.info(iinfo);
        StudentsMarks markes = new StudentsMarks("Arun",89.7f);
       studentMark.marks(markes);
        StudentsPerformance performances = new StudentsPerformance("kavya",'G');
        studentMark.performance(performances);

        System.out.println("-------------------------------------------------------");

        StudentsCollege studentsCollege = new StudentsCollegeImpli();
        StudentDetails names = new StudentDetails(40,"vikas");
        studentsCollege.students(names);
        StudentsAttendence colleges = new StudentsAttendence(99.0f,"ramya");
        studentsCollege.studentName(colleges);
        StudentsInfo name = new StudentsInfo("akash gobal college","rakesh");
        studentsCollege.info(name);
        StudentsMarks number = new StudentsMarks("Arun",45.7f);
        studentsCollege.marks(number);
        StudentsPerformance grade = new StudentsPerformance("prasad",'E');
        studentsCollege.performance(grade);
    }

}
