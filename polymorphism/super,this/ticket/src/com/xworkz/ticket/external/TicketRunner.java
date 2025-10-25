package com.xworkz.ticket.external;

import com.xworkz.ticket.internal.TrainTicket;

public class TicketRunner {
    public static void main(String [] ref)
    {
        TrainTicket ticket = new TrainTicket("Mandara",300,451234568l,40.23f,350.234,'A',true);
        ticket.displayTrainTicket();

    }
}
