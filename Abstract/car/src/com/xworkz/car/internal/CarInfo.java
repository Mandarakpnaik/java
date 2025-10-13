package com.xworkz.car.internal;

public class CarInfo extends Car{

    public CarInfo(int carPrice, String carName) {
        super(carPrice, carName);
    }

    @Override
    public void carDetalis(String name, int price) {

    }


    public void displayCarInfo()
    {
        System.out.println("this is carInfo ");
    }
}
