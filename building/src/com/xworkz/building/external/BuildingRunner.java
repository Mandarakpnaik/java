package com.xworkz.building.external;

import com.xworkz.building.internal.Building;
import com.xworkz.building.internal.Floor;

public class BuildingRunner {
    public static void main(String[] args) {
        Building building=new Floor(10,"Sattva");
        building.displayBuildingDetails();
    }
}
