package com.zworkz.functionalInterface.external;

import com.zworkz.functionalInterface.bridge.Division;

public class DivisionRunner {
    public static void main(String[] args) {
        Division division=((number1, number2) -> number1/number2);
        int divide=division.division(14,2);
        System.out.println("Division :"+divide);

    }
}
