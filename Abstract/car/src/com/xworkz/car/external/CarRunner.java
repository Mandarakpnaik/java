package com.xworkz.car.external;

import com.xworkz.car.internal.Car;
import com.xworkz.car.internal.CarInfo;

public class CarRunner {
    public static void main(String[] args) {
        Car car= new CarInfo(45000 ,"Suzuki" );
        car.displayCar();

    }
}
