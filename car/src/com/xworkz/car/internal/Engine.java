package com.xworkz.car.internal;

public class Engine extends Car{

    public Engine(int carPrice, String carName) {
        super(carPrice, carName);
    }

    @Override
    public void carDetalis(String name, int price) {

    }


    public void displayEngine()
    {
        System.out.println("this is engine class ");
    }
}
