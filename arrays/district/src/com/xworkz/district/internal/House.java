package com.xworkz.district.internal;

public class House {
    public  String firstHouse;
    public  String secondHouse;
    public  String thirdHouse;
    public String fourthHouse;
    public House(String firstHouse, String secondHouse, String thirdHouse, String fourthHouse){
        this.firstHouse=firstHouse;
        this.secondHouse=secondHouse;
        this.thirdHouse=thirdHouse;
        this.fourthHouse=firstHouse;
    }
    public void displayHouse(){
        System.out.println("first home :"+firstHouse);
        System.out.println("second home:"+secondHouse);
        System.out.println("third home:"+thirdHouse);
        System.out.println("fourth home:"+fourthHouse);
    }

}
