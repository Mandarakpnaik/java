package com.xworkz.students.bridge;

import com.xworkz.students.internal.*;

public interface Students {
    String students(StudentDetails studentDetails);
    int studentName(StudentsAttendence studentsAttendence);
    StudentsInfo info(StudentsInfo studentsInfo);
    boolean marks(StudentsMarks studentsMarks);
    StudentsPerformance performance(StudentsPerformance studentsPerformance);

}
