package com.xworkz.device.internal;

public class SmartWatch {
    public boolean isWaterproof;
    public String brandName;
    public int releaseYear;
    public Charger charger;

    public SmartWatch(boolean isWaterproof,String brandName,int releaseYear,Charger charger)
    {
        this.isWaterproof=isWaterproof;
        this.brandName=brandName;
        this.releaseYear=releaseYear;
        this.charger=charger;
    }
    public void displaySmartWatchDetalies()
    {
        System.out.println("SmartWatch is waterproof :"+isWaterproof+ ", " +"Brand name :"+brandName+ ","+ "releaseYear :"+releaseYear);
        System.out.println("Charger serial Number : "+charger.serialNumber+ "," + "Charger is fast charger : "+charger.isFastCharge);
    }
}
