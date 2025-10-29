package com.xworkz.bikes.external;

import com.xworkz.bikes.bridge.*;
import com.xworkz.bikes.internal.*;


public class BikesRunner {
    public static void main(String[] args) {
        Bikes bike = new BikesImpliments();
        BikesInfo bikesInfo= new BikesInfo(4590,"suzuki");
        bike.bikeName(bikesInfo);
        BikesDetails bikesDetails = new BikesDetails(true,"honda");
        bike.name(bikesDetails);
        BikesShowroom bikesShowroom=new BikesShowroom(45000,'p');
        bike.showroom(bikesShowroom);
        TotalBikes totalBikes = new TotalBikes("Tvs",50000);
        bike.total(totalBikes);
        TotalBikeDetails totalBikeDetails=new TotalBikeDetails(4500,"The bike cellor");
        bike.details(totalBikeDetails);

        System.out.println("---------------------------------------------------");

        BikeTotal total = new BikeTotalImpli();
        BikesInfo info= new BikesInfo(9809,"honda");
        total.bikeName(info);
        BikesDetails bikesDetail = new BikesDetails(true,"tvs");
        total.name(bikesDetail);
        BikesShowroom bikeShowroom=new BikesShowroom(7000,'p');
        total.showroom(bikeShowroom);
        TotalBikes totalBike = new TotalBikes("Tvs",6700);
        total.total(totalBike);
        TotalBikeDetails totalBikeDetail=new TotalBikeDetails(1500,"Velocity");
        total.details(totalBikeDetail);


        System.out.println("-------------------------------------------------------------");

        Name name = new NameImpli();
        BikesInfo bikeInformation= new BikesInfo(99809,"honda");
        name.bikeName(bikeInformation);
        BikesDetails bikesDetailsTotal = new BikesDetails(true,"Tvs Raider");
        name.name(bikesDetailsTotal);
        BikesShowroom bikeShowroomTotal=new BikesShowroom(7000,'p');
        name.showroom(bikeShowroomTotal);
        TotalBikes totals = new TotalBikes("Tvs",6700);
        name.total(totals);
        TotalBikeDetails totalDetail=new TotalBikeDetails(1500,"Cycle Center");
        name.details(totalDetail);

        System.out.println("----------------------------------------------------------");

        BikeInformation information = new BikeInformationImpli();
        BikesInfo bikes= new BikesInfo(100000,"royal enfield Classic 350");
        information.bikeName(bikes);
        BikesDetails DetailsTotal = new BikesDetails(true,"Bajaj pulsar");
        information.name(DetailsTotal);
        BikesShowroom showroomTotal=new BikesShowroom(500,'p');
        information.showroom(showroomTotal);
        TotalBikes totalsBikes = new TotalBikes("Hero",7700);
        information.totals(totalsBikes);
        TotalBikeDetails bikesNumber=new TotalBikeDetails(1500,"Wheel World");
        information.details(bikesNumber);

        System.out.println("--------------------------------------------------");
        BikeDetail detailsBike= new BikeDetailImpli();
        BikesInfo bikeNumber= new BikesInfo(15000,"suzuki");
        detailsBike.bikeName(bikeNumber);
        BikesDetails bikeDetails = new BikesDetails(true,"TVS apache RTR 160");
        detailsBike.name(bikeDetails);
        BikesShowroom showroom=new BikesShowroom(10000,'p');
        detailsBike.showroom(showroom);
        TotalBikes totalBikesInShowroom = new TotalBikes("TVS Raider 125",50000);
        detailsBike.totals(totalBikesInShowroom);
        TotalBikeDetails BikeDetails=new TotalBikeDetails(5500,"Bike hub");
        bike.details(BikeDetails);


    }
}
