package com.xworkz.tickets.internal;

import com.xworkz.tickets.event.*;

public class Tickets {
    public int checkAge(int age) {
        if (age>50) {
            try {
                throw new CheckAgeException();
            } catch (CheckAgeException checkAgeException) {
                checkAgeException.printStackTrace();
                System.out.println("valid Age :"+age);
            }
        }else {
            System.out.println("invalid age  :"+age);
        }
        return age;
    }
    public String checkName(String name){
        if(name =="Sushma"){
            try {
                throw new CheckNameException();
            }catch (CheckNameException checkNameException){
                checkNameException.printStackTrace();
                System.out.println("valid name :"+name);
            }
        }else {
            System.out.println("invalid name :"+name);
        }
        return name;
    }
    public int checkTicket(int age) {
        if (age>15) {
            try {
                throw new CheckTicketException();
            } catch (CheckTicketException checkTicketException) {
                checkTicketException.printStackTrace();
                System.out.println("valid Age :"+age);
            }
        }else {
            System.out.println("invalid age :"+age);
        }
        return age;
    }
    public int seatBook(int price) {
        if (price>100) {
            try {
                throw new SeatBookException();
            } catch (SeatBookException seatBookException) {
                seatBookException.printStackTrace();
                System.out.println("valid price :"+price);
            }
        }else {
            System.out.println("invalid price :"+price);
        }
        return price;
    }
    public void seatCancel(String name) {
        if (name=="Arun") {
            try {
                throw new SeatCancelException();
            } catch (SeatCancelException seatCancelException) {
                seatCancelException.printStackTrace();
                System.out.println("valid name"+name);
            }
        }else {
            System.out.println("invalid name"+name);
        }


    }


}
