package com.xworkz.agriculture.bridge;

import com.xworkz.agriculture.internal.*;

public class Agricultureimpli implements Agriculture{
    @Override
    public AgricultureDetails details(AgricultureDetails agricultureDetails) {
        System.out.println("Agriculture details "+agricultureDetails.grade+ "," + "is organic :"+agricultureDetails.isOrganic);
        return agricultureDetails;
    }

    @Override
    public AgricultureInfo info(AgricultureInfo agricultureInfo) {
        System.out.println("agriculture information :"+agricultureInfo.quality + ","+ "Total farmers:"+agricultureInfo.totalFarmers);
        return agricultureInfo;
    }

    @Override
    public CropVarieties varieties(CropVarieties cropVarieties) {
        System.out.println("Crop varieties :"+cropVarieties.totalCrops + ","+ ":"+cropVarieties.cropName);
        return cropVarieties;
    }

    @Override
    public FarmEquipment equipment(FarmEquipment farmEquipment) {
        System.out.println("Farm equipments :"+farmEquipment.totalEquipments+ ","+ "equipment is automated:"+farmEquipment.isAutomated);

        return farmEquipment;
    }

    @Override
    public HarvestInfo infoHarvest(HarvestInfo harvestInfo) {
        System.out.println("Harvest info :"+harvestInfo.income+ ","+ "Total workers:"+harvestInfo.totalWorkers);
        return harvestInfo;
    }
}
