package com.xworkz.exception.external;

import com.xworkz.exception.internal.ProblemsInvalid;

public class ProblemInvalidRunner {
    public static void main(String[] args) {
        ProblemsInvalid problemsInvalid=new ProblemsInvalid();
        problemsInvalid.issue(10);
    }
}
