package com.xworkz.district.internal;

public class Village {
    public String villageName;
    public int numberOfHouse;
    public House []house;
    public Village(String villageName,int numberOfHouse,House[]house){
        this.villageName=villageName;
        this.numberOfHouse=numberOfHouse;
        this.house=house;

    }
    public void displayVillage(){
        System.out.println("village name:"+villageName);
        System.out.println(" no of house :"+numberOfHouse);
        System.out.println("house :"+house);

        displayHouses();


    }
    public void displayHouses(){
        for(House houses:house){
            houses.displayHouse();
        }
    }

}
