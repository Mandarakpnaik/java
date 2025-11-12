package com.xworkz.keyboard.dto;

public class MouseDto {
   private int modelNumber;
   private   long serialNumber;
   private float price;
   private double weight;
   private char sensorType;
   private  boolean isWireless;

    private String brandName;
    private Integer warrantyYears;
    private Float scrollSpeed;
    private Double responseTime;
    private Boolean hasRGB;
    private Character sizeType;
    private Long productionCode;

    public MouseDto(int modelNumber, long serialNumber, float price, double weight, char sensorType, boolean isWireless,
                    String brandName, Integer warrantyYears, Float scrollSpeed, Double responseTime, Long productionCode, Character sizeType, Boolean hasRGB) {
        this.serialNumber = serialNumber;
        this.modelNumber = modelNumber;
        this.price = price;
        this.weight = weight;
        this.sensorType = sensorType;
        this.isWireless = isWireless;
        this.brandName = brandName;
        this.warrantyYears = warrantyYears;
        this.scrollSpeed = scrollSpeed;
        this.responseTime = responseTime;
        this.productionCode = productionCode;
        this.sizeType = sizeType;
        this.hasRGB = hasRGB;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setSensorType(char sensorType) {
        this.sensorType = sensorType;

    }

    public char getSensorType() {
        return sensorType;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setWarrantyYears(Integer warrantyYears) {
        this.warrantyYears = warrantyYears;
    }

    public Integer getWarrantyYears() {
        return warrantyYears;
    }

    public void setProductionCode(Long productionCode) {
        this.productionCode = productionCode;
    }

    public Long getProductionCode() {
        return productionCode;
    }

    public void setScrollSpeed(Float scrollSpeed) {
        this.scrollSpeed = scrollSpeed;
    }

    public Float getScrollSpeed() {
        return scrollSpeed;
    }

    public void setResponseTime(Double responseTime) {
        this.responseTime = responseTime;
    }

    public Double getResponseTime() {
        return responseTime;
    }

    public void setSizeType(Character sizeType) {
        this.sizeType = sizeType;
    }

    public Character getSizeType() {
        return sizeType;
    }

    public void setHasRGB(Boolean hasRGB) {
        this.hasRGB = hasRGB;
    }

    public Boolean getHasRGB() {
        return hasRGB;
    }

    @Override
    public String toString() {
        return "keyboard [modelNumber = " + modelNumber + ",SerialNumber = " + serialNumber + ",price = " + price + ",weight = " + weight + ",sensorType = " + sensorType + "," +
                " isWireless = " + isWireless + ",brandName = " + brandName + ",WarrantyYears = " + warrantyYears + ",scroll speed =" + scrollSpeed + ",ResponseTime =" + responseTime + ",Production Code = " + productionCode + "," +
                "size Type = " + sizeType + ",hasRGB = " + hasRGB + " ]";
    }

    public int hashCode() {
        int primenumber = 11;
        int result = 1;
        result = primenumber * result + modelNumber;
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
        MouseDto mouseDto = (MouseDto) obj;
        return this.price == mouseDto.price && (this.brandName == null ? mouseDto.brandName == null : this.brandName.equals(mouseDto.brandName));
    }
}
