package com.xworkz.device.external;

import com.xworkz.device.internal.Charger;
import com.xworkz.device.internal.Laptop;
import com.xworkz.device.internal.Phone;
import com.xworkz.device.internal.SmartWatch;

public class DeviceRunner {
    public static  void main(String[] ref)
    {
        Charger charger = new Charger(12345690l, true);
        Charger cable = new Charger(23456965l, true);
        Charger wire = new Charger(546789l, false);
        Charger cables = new Charger(897655444l, true);

        Phone phone = new Phone("Redmi 12", 1505.60, charger);
        Laptop laptop = new Laptop(true, "Dell", cable);
        SmartWatch smartWatch = new SmartWatch(false, "Apple watch", 2023, cables);


        phone.displayPhoneDetalies();
        System.out.println("----------------------------------------------");

        laptop.displayLaptopDetalies();
        System.out.println("----------------------------------------------");


       

        smartWatch.displaySmartWatchDetalies();

    }
}
