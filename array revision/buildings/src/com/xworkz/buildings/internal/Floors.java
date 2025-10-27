package com.xworkz.buildings.internal;

public class Floors {
    
    public String floorName;
    public int floorNumber;
    public char qulityOfRoom;
    public Rooms[] rooms;

    public Floors(String floorName, int floorNumber, char qulityOfRoom, Rooms[] rooms) {
        this.floorName = floorName;
        this.floorNumber = floorNumber;
        this.qulityOfRoom = qulityOfRoom;
        this.rooms = rooms;
    }

    public void displayFloor() {
        System.out.println("Floor name:" + floorName);
        System.out.println("Floor number:" + floorNumber);
        System.out.println("qulity rooms:" + qulityOfRoom);


        displyRoom();

    }

    public void displyRoom() {
        for (Rooms room : rooms) {
            room.displyRooms();
        }
    }

    }
