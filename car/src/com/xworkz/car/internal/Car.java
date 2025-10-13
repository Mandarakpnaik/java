package com.xworkz.car.internal;

public abstract class Car {

    public int carPrice;
    public  String carName;

    public Car(int carPrice,String carName) {
        this.carPrice = carPrice;
        this.carName=carName;
    }
    public abstract void carDetalis(String name,int price);

    public void displayCar()
    {
        System.out.println("this is car class");
    }



}
