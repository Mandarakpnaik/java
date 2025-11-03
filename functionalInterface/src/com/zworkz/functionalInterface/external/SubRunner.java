package com.zworkz.functionalInterface.external;

import com.zworkz.functionalInterface.bridge.Sub;

public class SubRunner {
    public static void main(String[] args) {
        Sub sub=((number1, number2) -> number1-number2);
        float minus=sub.substation(43.4f,34.4f);
        System.out.println("Substation :"+minus);
    }
}
