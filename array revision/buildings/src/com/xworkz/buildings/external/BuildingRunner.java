package com.xworkz.buildings.external;

import com.xworkz.buildings.internal.Buildings;
import com.xworkz.buildings.internal.Floors;
import com.xworkz.buildings.internal.Rooms;

public class BuildingRunner {

        public static void main(String[] args) {
            Buildings building = new Buildings();
            Rooms[] roomsFloors1 = {new Rooms("Fan", "Light", "lamp", "bed")};
            Rooms[] roomsFloors2 = {new Rooms("cot", "Ac", "Bottel", "Pen")};
            Rooms[] roomsFloors3 = {new Rooms("Cup", "vase", "flower", "table")};
            Rooms[] roomsFloors4 = {new Rooms("book", "bedspread", "phote", "charger")};
            Rooms[] roomsFloors5 = {new Rooms("phone", "Laptop", "tab", "textbook")};
            Rooms[] roomsFloors6 = {new Rooms("window", "water", "fruties", "knief")};
            Rooms[] roomsFloors7 = {new Rooms("frame", "dress", "dore", "box")};
            Rooms[] roomsFloors8 = {new Rooms("Fan", "remote", "tv", "wires")};
            Rooms[] roomsFloors9 = {new Rooms("bulb", "coile", "switchs", "keysbunches")};
            Rooms[] roomsFloors10 = {new Rooms("doll", "heater", "socks", "keys")};

            Floors firstFloor = new Floors("rama", 1, 'A', roomsFloors1);
            Floors secondFloor = new Floors("ravana", 2, 'B', roomsFloors2);
            Floors thirdFloor = new Floors("sitha", 3, 'A', roomsFloors3);
            Floors fourthFloor = new Floors("shivaji", 4, 'A', roomsFloors4);
            Floors fifthFloor = new Floors("ganaga", 5, 'B', roomsFloors5);
            Floors sixthFloor = new Floors("thunga", 6, 'C', roomsFloors6);
            Floors seventhFloor = new Floors("yamuna", 7, 'B', roomsFloors7);
            Floors eightFloor = new Floors("kaviere", 8, 'A', roomsFloors8);
            Floors ninethFloor = new Floors("sagara", 9, 'B', roomsFloors9);
            Floors tenthFloor = new Floors("rama", 10, 'A', roomsFloors10);

            Floors[] floors = {firstFloor, secondFloor, thirdFloor, fourthFloor, fifthFloor, sixthFloor, seventhFloor, eightFloor, ninethFloor, tenthFloor};
            building.displayBuildings(floors);

        }
    }
