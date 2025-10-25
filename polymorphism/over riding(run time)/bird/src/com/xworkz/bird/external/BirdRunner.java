package com.xworkz.bird.external;

import com.xworkz.bird.internal.Parrot;

public class BirdRunner {
    public static void main(String [] ref)
    {
        Parrot parrot = new Parrot();
        parrot.displayColor("Green");
        parrot.displayEggsPerYear(23455);
        parrot. displayId(6788765l);
        parrot.displaySymbol('P');
        parrot.displayHeight(1.2f);
        parrot.displayWeight(12.32);
        parrot.displayCanFly(true);

    }
}
