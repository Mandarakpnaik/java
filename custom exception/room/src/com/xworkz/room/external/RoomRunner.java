package com.xworkz.room.external;

import com.xworkz.room.internal.Room;

public class RoomRunner {
    public static void main(String[] args) {
        Room room=new Room();
//        room.roomNameCheck("SingleBedroom");
        room.roomNameCheck("ro");
//        room.roomPrice(8000);
        room.roomPrice(3000);
//        room.roomNotFound(2);
        room.roomNotFound(1);
//        room.roomCapacity(4);
        room.roomCapacity(8);
//        room.roomNumber(12);
        room.roomNumber(8);

    }
}
