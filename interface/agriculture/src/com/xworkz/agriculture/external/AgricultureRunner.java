package com.xworkz.agriculture.external;

import com.xworkz.agriculture.bridge.*;
import com.xworkz.agriculture.internal.*;

public class AgricultureRunner {
    public static void main(String[] args) {
        Agriculture agriculture = new Agricultureimpli();
        AgricultureDetails agricultureDetails = new AgricultureDetails('A', true);
        agriculture.details(agricultureDetails);
        AgricultureInfo agricultureInfo = new AgricultureInfo(1000, 'G');
        agriculture.info(agricultureInfo);
        CropVarieties cropVarieties = new CropVarieties(10, "Rice");
        agriculture.varieties(cropVarieties);
        FarmEquipment farmEquipment = new FarmEquipment(15, false);
        agriculture.equipment(farmEquipment);
        HarvestInfo harvestInfo = new HarvestInfo(60000, 50);
        agriculture.infoHarvest(harvestInfo);

        System.out.println("--------------------------------------------------");

        Crop crop = new CropImpli();
        AgricultureDetails details = new AgricultureDetails('B', false);
        crop.details(details);
        AgricultureInfo info = new AgricultureInfo(5000, 'A');
        crop.info(info);
        CropVarieties crops = new CropVarieties(30, "Rice");
        crop.varieties(crops);
        FarmEquipment farmEquipments = new FarmEquipment(35, false);
        crop.equipment(farmEquipments);
        HarvestInfo harvestInfos = new HarvestInfo(100000, 100);
        crop.infoHarvest(harvestInfos);

        System.out.println("--------------------------------------------------");

        Farmer farmer = new FarmerImpli();
        AgricultureDetails detail = new AgricultureDetails('B', true);
        farmer.details(detail);
        AgricultureInfo infos = new AgricultureInfo(4500, 'E');
        farmer.info(infos);
        CropVarieties cropVarietie = new CropVarieties(30, "coffee");
        farmer.varieties(cropVarietie);
        FarmEquipment farms = new FarmEquipment(50, false);
        farmer.equipment(farms);
        HarvestInfo harvest = new HarvestInfo(100000, 300);
        farmer.infoHarvest(harvest);

        System.out.println("--------------------------------------------------");

        Fertilizer fertilizer = new FertilizerImpli();
        AgricultureDetails name = new AgricultureDetails('B', true);
        fertilizer.details(name);
        AgricultureInfo number = new AgricultureInfo(9500, 'E');
        fertilizer.info(number);
        CropVarieties varieties = new CropVarieties(10, "tea");
        fertilizer.varieties(varieties);
        FarmEquipment farm = new FarmEquipment(60, false);
        fertilizer.equipment(farm);
        HarvestInfo harvestAgri = new HarvestInfo(500000, 500);
        fertilizer.infoHarvest(harvestAgri);

        System.out.println("--------------------------------------------------");
        IrrigationMethod irrigationMethod = new IrrigationImpli();
        AgricultureDetails names = new AgricultureDetails('B', true);
        irrigationMethod.details(names);
        AgricultureInfo num = new AgricultureInfo(1000, 'A');
        irrigationMethod.info(num);
        CropVarieties types = new CropVarieties(30, "coffee");
        irrigationMethod.varieties(types);
        FarmEquipment farmerName = new FarmEquipment(50, false);
        irrigationMethod.equipment(farmerName);
        HarvestInfo income = new HarvestInfo(1000000, 5500);
        irrigationMethod.infoHarvest(income);
    }
}