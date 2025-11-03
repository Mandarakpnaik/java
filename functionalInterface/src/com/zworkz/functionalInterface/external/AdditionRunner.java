package com.zworkz.functionalInterface.external;

import com.zworkz.functionalInterface.bridge.Addition;

public class AdditionRunner {
    public static void main(String[] args) {
        Addition addition=(number1, number2) -> number1+number2;
        long add=addition.add(56789,12345);
        System.out.println("Addition :"+add);
    }
}
