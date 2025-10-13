package com.xworkx.college.external;

import com.xworkx.college.internal.College;
import com.xworkx.college.internal.Teacher;

public class CollegeRunner {
    public static void main(String[] args) {
        College college = new Teacher(25,"SRS college");
        college.displayCollege();
    }
}
