package com.xworkz.bikes.bridge;

import com.xworkz.bikes.internal.*;

public class BikeDetailImpli implements BikeDetail{
    public BikesInfo bikeName(com.xworkz.bikes.internal.BikesInfo bikesInfo) {
        System.out.println("this is sub class " +bikesInfo.price+bikesInfo.name );
        return bikesInfo;
    }

    @Override
    public BikesDetails name(BikesDetails bikesDetails) {
        System.out.println(bikesDetails.isGoodCondition+bikesDetails.name);
        return bikesDetails;
    }

    @Override
    public BikesShowroom showroom(BikesShowroom bikesShowroom) {
        System.out.println(bikesShowroom.totalBike + bikesShowroom.type);
        return bikesShowroom;
    }

    @Override
    public TotalBikes totals(TotalBikes totalBikes) {
        System.out.println(totalBikes.bikeName + totalBikes.totalBike);
        return totalBikes;
    }

    @Override
    public TotalBikeDetails details(TotalBikeDetails totalBikeDetails) {
        System.out.println(totalBikeDetails.numberOfBikes + totalBikeDetails.showroomName);
        return totalBikeDetails;
    }

}
