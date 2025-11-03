package com.zworkz.functionalInterface.external;

import com.zworkz.functionalInterface.bridge.Sum;

public class SumRunner {
    public static void main(String[] args) {
        Sum add=((a , b) ->a+b);
        int sum=add.addition(15,2);
        System.out.println("Addition of two number :"+sum);


    }
}
