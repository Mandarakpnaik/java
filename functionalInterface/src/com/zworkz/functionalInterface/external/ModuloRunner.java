package com.zworkz.functionalInterface.external;

import com.zworkz.functionalInterface.bridge.Modulo;

public class ModuloRunner {
    public static void main(String[] args) {
        Modulo modulo=(num1, num2) -> num1%num2;
        int mod=modulo.modulo(5,3);
        System.out.println("modulo :"+mod);
    }
}
