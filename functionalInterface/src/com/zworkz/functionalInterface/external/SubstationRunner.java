package com.zworkz.functionalInterface.external;

import com.zworkz.functionalInterface.bridge.Substation;

public class SubstationRunner {
    public static void main(String[] args) {
        Substation substation=(a, b) -> a-b;
        double sub=substation.sub(2045.56,34.32);
        System.out.println("Sub :"+sub);

    }
}
