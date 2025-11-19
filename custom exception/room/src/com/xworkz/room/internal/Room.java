package com.xworkz.room.internal;

import com.xworkz.room.event.*;

public class Room {
    public String roomNameCheck(String name){
        if(name =="SingleBedroom"){
            try {
                throw new CheckRoomName();
            }catch (CheckRoomName checkRoomName){
                checkRoomName.printStackTrace();
                System.out.println("valid Room name :"+name);
            }
        }else {
            System.out.println("invalid Room name :"+name);
        }
        return name;
    }

    public long roomNumber(int number){
        if(number>10){
            try {
                throw new CheckRoomNumber();
            }catch (CheckRoomNumber checkRoomNumber){
                checkRoomNumber.printStackTrace();
                System.out.println("valid room number "+number);
            }
        }else {
            System.out.println("invalid room number:"+number );
        }
        return number;
    }

    public int roomPrice(int price){
        if(price>5000){
            try {
                throw new CheckRoomPrice();
            }catch (CheckRoomPrice checkRoomPrice){
                checkRoomPrice.printStackTrace();
                System.out.println("valid room number "+price);
            }
        }else {
            System.out.println("invalid room number:"+price );
        }
        return price;
    }
    public int roomCapacity(int number){
        if(number<=4){
            try {
                throw new RoomCapacityCheck();
            }catch (RoomCapacityCheck roomCapacityCheck){
                roomCapacityCheck.printStackTrace();
                System.out.println("valid room number "+number);
            }
        }else {
            System.out.println("invalid room number:"+number );
        }
        return number;
    }
    public int roomNotFound(int number){
        if(number==2){
            try {
                throw new RoomNotFound();
            }catch (RoomNotFound roomNotFound){
                roomNotFound.printStackTrace();
                System.out.println("valid room number "+number);
            }
        }else {
            System.out.println("invalid room number:"+number );
        }
        return number;
    }



}
