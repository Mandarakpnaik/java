package com.xworkz.house.external;

import com.xworkz.house.internal.House;
import com.xworkz.house.internal.Rooms;

public class HouseRunner {
    public static void main(String [] ref)
    {
        Rooms room = new Rooms(5,true);
        House house = new House("Happiness",45787.677,room);
        house.displayHouseDetailes();
    }
}
