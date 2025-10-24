package com.xworkz.house.internal;

public class House {
    public String houseName;
    public double housePrice;
    public Rooms windows;

    public House(String houseName,double housePrice,Rooms windows)
    {
        this.houseName=houseName;
        this.housePrice=housePrice;
        this.windows=windows;
    }
    public void displayHouseDetailes()
    {
        System.out.println("House name :"+houseName+ "," +"House price :"+housePrice);
        System.out.println("Number of rooms :"+windows.noOfRooms+","+ "House is good condition :"+windows.isGoodCondition);
    }
}
