package com.zworkz.functionalInterface.external;

import com.zworkz.functionalInterface.bridge.Mod;

public class ModRunner {
    public static void main(String[] args) {
        Mod mod =(a, b) -> a%b;
        float modulo=mod.modulo(12.3f,11.2f);
        System.out.println("Mod of a and b :"+modulo);
    }
}
