package com.xworkz.keyboard.dto;

public class ComputerDto {
    private int storageSize;
    private long serialNumber;
    private float processorSpeed;
    private double price;
    private char processorType;
    private boolean isLaptop;

    private String brandName;
    private Integer warrantyYears;
    private Float screenSize;
    private Double weight;
    private Boolean hasBluetooth;
    private Character osType;
    private Long productCode;

    public ComputerDto(int storageSize,long serialNumber,float processorSpeed,double price,char processorType,boolean isLaptop,String brandName,Integer warrantyYears,
                       Long productCode,Float screenSize,Double weight,Boolean hasBluetooth,Character osType){
        this.brandName=brandName;
        this.storageSize=storageSize;
        this.serialNumber=serialNumber;
        this.processorSpeed=processorSpeed;
        this.price=price;
        this.processorType=processorType;
        this.isLaptop=isLaptop;
        this.weight=weight;
        this.warrantyYears=warrantyYears;
        this.hasBluetooth=hasBluetooth;
        this.osType=osType;
        this.productCode=productCode;
        this.screenSize=screenSize;
    }

    public  void setStorageSize(int storageSize)
    {
        this.storageSize=storageSize;
    }
    public int getStorageSize()
    {
        return storageSize;
    }
    public void setSerialNumber(long serialNumber)
    {
        this.serialNumber=serialNumber;
    }
    public long getSerialNumber()
    {
        return  serialNumber;
    }
    public void setProcessorSpeed(float processorSpeed)
    {
        this.processorSpeed=processorSpeed;
    }
    public float getProcessorSpeed()
    {
        return processorSpeed;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public double getPrice()
    {
        return price;
    }
    public void setProcessorType(char processorType)
    {
        this.processorType=processorType;
    }
    public char getProcessorType(){
        return processorType;
    }
    public void setLaptop(boolean isLaptop)
    {
        this.isLaptop=isLaptop;
    }
    public boolean isLaptop()
    {
        return isLaptop;
    }

    public void setBrandName(String brandName)
    {
        this.brandName=brandName;
    }
    public String getBrandName()
    {
        return brandName;
    }
    public void  setWeight(Double weight)
    {
        this.weight=weight;
    }
    public Double getWeight()
    {
        return weight;
    }
    public void setWarrantyYears(Integer warrantyYears)
    {
        this.warrantyYears=warrantyYears;
    }
    public Integer getWarrantyYears()
    {
        return warrantyYears;
    }
    public void setScreenSize(Float screenSize)
    {
        this.screenSize=screenSize;
    }
    public Float getScreenSize()
    {
        return screenSize;
    }
    public void setHasBluetooth(Boolean hasBluetooth)
    {
        this.hasBluetooth=hasBluetooth;
    }
    public Boolean getHasBluetooth()
    {
        return hasBluetooth;
    }
    public void setOsType(Character osType)
    {
        this.osType=osType;
    }
    public Character getOsType()
    {
        return osType;
    }
    public void setProductCode(Long productCode)
    {
        this.productCode=productCode;
    }
    public Long getProductCode()
    {
        return  productCode;
    }
    @Override
    public String toString()
    {

        return "computer[ storage size= " + storageSize + ",SerialNumber = " + serialNumber + ",processor speed= "+processorSpeed+",price = " + price + ",processorType = " + processorType + ",isLaptop = " + isLaptop + "," +
                "brandName = " + brandName + ",WarrantyYears = " + warrantyYears + ",product code =" + productCode + ",screen size =" + screenSize + ",weight= " + weight+ "," +
                "hasBluetooth = " + hasBluetooth + ",os type= " + osType + " ]";

    }
    @Override
    public int hashCode() {
        int primenumber = 13;
        int result = 1;
        result = primenumber * result + storageSize;
        result = primenumber * result + warrantyYears;

        result = primenumber * result + ((brandName == null) ? null : brandName.hashCode());

        return result;


    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(this instanceof Object)) {
            return false;
        }
        ComputerDto computerDto = (ComputerDto) obj;
        return this.price == computerDto.price && (this.brandName == null ? computerDto.brandName == null : this.brandName.equals(computerDto.brandName));
    }
}
