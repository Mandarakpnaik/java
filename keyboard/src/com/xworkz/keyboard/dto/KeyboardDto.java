package com.xworkz.keyboard.dto;

public class KeyboardDto {
    private int modelNumber;
    private long serialNumber;
    private float price;
    private double weight;
    private char keyType;
    private boolean isWireless;

    private String name;
    private Integer warrantyYears;
    private Float keyHeight;
    private Double responseTime;
    private Long productionCode;
    private Character layoutType;
    private  Boolean backlight;


    public KeyboardDto(int modelNumber,long serialNumber,float price,double weight,char keyType,boolean isWireless,
                       String name,Integer warrantyYears,Float keyHeight,Double responseTime,Long productionCode,Character layoutType,Boolean backlight) {
        this.serialNumber=serialNumber;
        this.modelNumber=modelNumber;
        this.price=price;
        this.weight=weight;
        this.keyType=keyType;
        this.isWireless=isWireless;
        this.name=name;
        this.warrantyYears=warrantyYears;
        this.keyHeight=keyHeight;
        this.responseTime=responseTime;
        this.productionCode=productionCode;
        this.layoutType=layoutType;
        this.backlight=backlight;

    }
    public void setModelNumber(int modelNumber){
        this.modelNumber=modelNumber;
    }
    public int getModelNumber()
    {
        return modelNumber;
    }
    public void setSerialNumber(long serialNumber)
    {
        this.serialNumber=serialNumber;
    }
    public long getSerialNumber()
    {
        return  serialNumber;
    }
    public void  setPrice(float price)
    {
        this.price=price;
    }
    public float getPrice()
    {
        return price;
    }
    public void setWeight(double weight)
    {
        this.weight=weight;
    }
    public double getWeight()
    {
        return weight;
    }
    public void setKeyType(char keyType)
    {
        this.keyType=keyType;
    }
    public char getKeyType()
    {
        return keyType;
    }
    public void setWireless(boolean isWireless)
    {
        this.isWireless=isWireless;
    }
    public boolean isWireless()
    {
        return isWireless;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setWarrantyYears(Integer warrantyYears)
    {
        this.warrantyYears=warrantyYears;
    }
    public Integer getWarrantyYears()
    {
        return warrantyYears;
    }
    public void setProductionCode(Long productionCode)
    {
        this.productionCode=productionCode;
    }
    public Long getProductionCode()
    {
        return productionCode;
    }

    public void setKeyHeight(Float keyHeight)
    {
        this.keyHeight=keyHeight;
    }
    public Float getKeyHeight()
    {
        return keyHeight;
    }
    public void setResponseTime(Double responseTime)
    {
        this.responseTime=responseTime;
    }
    public Double getResponseTime()
    {
        return responseTime;
    }
    public void setLayoutType(Character layoutType)
    {
        this.layoutType=layoutType;
    }
    public Character getLayoutType()
    {
        return layoutType;
    }
    public void setBacklight(Boolean backlight)
    {
        this.backlight=backlight;
    }
    public Boolean getBacklight()
    {
        return backlight;
    }



    @Override
    public String toString() {
        return "keyboard [modelNumber = "+modelNumber+",SerialNumber = "+serialNumber+",price = "+price+",weight = "+weight+",keyType = "+keyType+"," +
                " isWireless = "+isWireless+",name = "+name+",WarrantyYears = "+warrantyYears+",KeyHeight ="+keyHeight+",ResponseTime ="+responseTime+",Production Code = "+productionCode+"," +
                "Layout Type = "+layoutType+",Backlight = "+backlight+" ]";
    }

    @Override
    public int hashCode() {
        int primenumber = 31;
        int result = 1;
        result = primenumber * result + modelNumber;
        result = primenumber *result + warrantyYears;
        result = primenumber * result  + ((keyHeight == null) ? null : keyHeight.hashCode());
        result =primenumber * result + ((responseTime == null) ? null : responseTime.hashCode());
        result = primenumber * result + ((productionCode == null ) ? null : productionCode.hashCode());
        result = primenumber * result + ((layoutType == null )? null : layoutType.hashCode());
        result = primenumber * result + ((backlight == null) ? null : backlight.hashCode());
        result = primenumber * result + ((name == null) ? null : name.hashCode());

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
        KeyboardDto keyboardDto = (KeyboardDto) obj;
        return this.price == keyboardDto.price && (this.name == null ? keyboardDto.name == null : this.name.equals(keyboardDto.name));
    }


}
