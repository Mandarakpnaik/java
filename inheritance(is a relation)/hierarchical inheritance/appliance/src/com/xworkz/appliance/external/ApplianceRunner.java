package com.xworkz.appliance.external;

import com.xworkz.appliance.internal.Refrigerator;
import com.xworkz.appliance.internal.WashingMachine;

public class ApplianceRunner {
    public static void main(String[] args) {
        WashingMachine machine=new WashingMachine();
        machine.displayWashingMachine();;
        machine.displayAppliance();

        Refrigerator refrigerator= new Refrigerator();
        refrigerator.displayRefrigerator();;
        refrigerator.displayAppliance();
    }
}
