package com.xworkz.tickets.external;

import com.sun.javafx.iio.common.ImageLoaderImpl;
import com.xworkz.tickets.internal.Tickets;

public class TicketsRunner {
    public static void main(String[] args) {
        Tickets tickets=new Tickets();
//        tickets.checkAge(60);
          tickets.checkAge(30);
//        tickets.checkName("Sushma");
          tickets.checkName("naik");
//          tickets.checkTicket(20);
          tickets.checkTicket(10);
//          tickets.seatBook(150);
          tickets.seatBook(90);
//          tickets.seatCancel("Arun");
          tickets.seatCancel("MMM");
    }
}
