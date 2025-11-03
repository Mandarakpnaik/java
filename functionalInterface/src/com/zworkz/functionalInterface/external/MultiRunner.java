package com.zworkz.functionalInterface.external;

import com.zworkz.functionalInterface.bridge.Multi;

public class MultiRunner {
    public static void main(String[] args) {
        Multi multi=(a, b) -> a*b;
        double num=multi.multi(567.45,234.2);
        System.out.println("Multi :"+num);
    }
}
