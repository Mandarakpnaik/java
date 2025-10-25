package com.xworkz.ticket.internal;

public class TrainTicket extends Ticket{
    public String passengerName;
    public int price;
    public long ticketId;
    public float distance;
    public double duration;
    public char classType;
    public boolean isConfirmed;

    public TrainTicket()
    {
        super();
        System.out.println("This is no-argument const");
    }
    public TrainTicket(String passengerName)
    {

        this();
        super.passengerName=passengerName;
        this.passengerName=passengerName;

    }
    public TrainTicket(String passengerName,int price)
    {

        super.price=price;
        super.passengerName=passengerName;
        this.passengerName=passengerName;
        this.price=price;
    }
    public TrainTicket(String passengerName,int price,long ticketId)
    {

        super.price=price;
        super.passengerName=passengerName;
        super.ticketId=ticketId;
        this.passengerName=passengerName;
        this.price=price;
        this.ticketId=ticketId;
    }
    public TrainTicket(String passengerName,int price,long ticketId,float distance)
    {

        super.price=price;
        super.passengerName=passengerName;
        super.ticketId=ticketId;
        super.distance=distance;
        this.passengerName=passengerName;
        this.price=price;
        this.ticketId=ticketId;
        this.distance=distance;
    }
    public TrainTicket(String passengerName,int price,long ticketId,float distance,double duration)
    {

        super.price=price;
        super.passengerName=passengerName;
        super.ticketId=ticketId;
        super.distance=distance;
        super.duration=duration;
        super.classType=classType;
        super.isConfirmed=isConfirmed;
        this.isConfirmed=isConfirmed;
        this.classType=classType;
        this.duration=duration;
        this.passengerName=passengerName;
        this.price=price;
        this.ticketId=ticketId;
        this.distance=distance;
    }
    public TrainTicket(String passengerName,int price,long ticketId,float distance,double duration,char classType,boolean isConfirmed)
    {

        super.price=price;
        super.passengerName=passengerName;
        super.ticketId=ticketId;
        super.distance=distance;
        super.duration=duration;
        this.duration=duration;
        this.passengerName=passengerName;
        this.price=price;
        this.ticketId=ticketId;
        this.distance=distance;
    }


    public void displayTrainTicket()
    {
        System.out.println("passenger Name :"+this.passengerName);
        System.out.println("Ticket price :"+this.price);
        System.out.println("Ticket id :"+this.ticketId);
        System.out.println("Distance :"+this.distance);
        System.out.println("Duration :"+this.duration);
        System.out.println("classType :"+this.classType);
        System.out.println("isConfirmed :"+this.isConfirmed);
        System.out.println(super.passengerName);
        System.out.println(super.price);
        System.out.println(super.ticketId);
        System.out.println(super.distance);
        System.out.println(super.duration);
        System.out.println(super.classType);
        System.out.println(super.isConfirmed);

    }
}
