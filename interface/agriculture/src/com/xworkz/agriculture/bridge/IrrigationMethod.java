package com.xworkz.agriculture.bridge;

import com.xworkz.agriculture.internal.*;

public interface IrrigationMethod {
    AgricultureDetails details(AgricultureDetails agricultureDetails);
    AgricultureInfo info(AgricultureInfo agricultureInfo);
    CropVarieties varieties(CropVarieties cropVarieties);
    FarmEquipment equipment(FarmEquipment farmEquipment);
    HarvestInfo infoHarvest(HarvestInfo harvestInfo);
}
