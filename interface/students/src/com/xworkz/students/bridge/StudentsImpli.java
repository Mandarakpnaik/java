package com.xworkz.students.bridge;

import com.xworkz.students.internal.*;

public class StudentsImpli implements Students {
    @Override
    public String students(StudentDetails studentDetails) {
        if(studentDetails.name == "Sushma") {
           studentDetails.name ="Sushma";
            System.out.println("this is students details "+studentDetails.name+studentDetails.studentRollNumber);
        }else {
        studentDetails.name ="sushma v ";
            System.out.println("this is students details "+studentDetails.name+studentDetails.studentRollNumber);
        }

return studentDetails.name;
    }

    @Override
    public int studentName(StudentsAttendence studentsAttendence) {
        if(studentsAttendence.attendence ==70)
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
        if(studentsMarks.marks>=65)
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
