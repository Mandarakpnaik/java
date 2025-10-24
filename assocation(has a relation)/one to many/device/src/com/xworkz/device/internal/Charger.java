package com.xworkz.device.internal;

public class Charger {
    public long serialNumber;
    public boolean isFastCharge;

    public Charger(long serialNumber,boolean isFastCharge)
    {
        this.isFastCharge=isFastCharge;
        this.serialNumber=serialNumber;
    }
}
