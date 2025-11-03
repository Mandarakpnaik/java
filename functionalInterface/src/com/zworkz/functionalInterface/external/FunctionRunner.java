package com.zworkz.functionalInterface.external;

import com.zworkz.functionalInterface.bridge.Function;

public class FunctionRunner {
    public static void main(String[] args) {
        Function function=(a, b) -> a/b;
        long divid=function.division(123456,23456);
        System.out.println("Division :"+divid);
    }
}
