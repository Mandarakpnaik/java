package com.xworkz.animal.external;

import com.xworkz.animal.internal.Animal;
import com.xworkz.animal.internal.Dog;

public class AnimalRunner {
    public static void main(String [] args)
    {
        Animal animalName = new Dog();
        animalName.dispalyAnimal();
        Dog dog = (Dog) animalName;
        dog.dispalyDog();


    }

}
