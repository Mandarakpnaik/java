package com.zworkz.functionalInterface.external;

import com.zworkz.functionalInterface.bridge.Multiplication;

public class MultiplicationRunner {
    public static void main(String[] args) {
        Multiplication multiplication=((value1, value2) -> value1*value2);
        int multi=multiplication.multiplication(3,4);
        System.out.println("Multiplication :"+multi);
    }
}
