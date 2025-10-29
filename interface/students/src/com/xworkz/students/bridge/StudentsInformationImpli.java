package com.xworkz.students.bridge;

import com.xworkz.students.internal.*;

public class StudentsInformationImpli implements StudentsInformation{
    public String students(StudentDetails studentDetails) {
        if(studentDetails.name == "kavya") {
            studentDetails.name ="kavya";
            System.out.println("this is students details "+studentDetails.name+studentDetails.studentRollNumber);
        }else {
            studentDetails.name ="sushma v ";
            System.out.println("this is students details "+studentDetails.name+studentDetails.studentRollNumber);
        }

        return studentDetails.name;
    }

    @Override
    public int studentName(StudentsAttendence studentsAttendence) {
        if(studentsAttendence.attendence ==60)
        {
            System.out.println("this is students attendence "+studentsAttendence.attendence+ studentsAttendence.name);
        }else
        {

            System.out.println("this is students attendence "+studentsAttendence.attendence+ studentsAttendence.name);
        }
        return 70;
    }

    @Override
    public StudentsInfo info(StudentsInfo studentsInfo) {
        System.out.println("StudentsInfo "+studentsInfo.collegeName +studentsInfo.studentName);
        return studentsInfo;
    }

    @Override
    public boolean marks(StudentsMarks studentsMarks) {
        if(studentsMarks.marks>=76)
        {
            System.out.println("student marks "+studentsMarks.marks+studentsMarks.name);
            return true;
        }else {
            System.out.println("Student marks  "+studentsMarks.marks + studentsMarks.name);
            return false;
        }


    }

    @Override
    public StudentsPerformance performance(StudentsPerformance studentsPerformance) {
        System.out.println("student performance "+studentsPerformance.performance + studentsPerformance.name);
        return studentsPerformance;
    }
}
