package com.xworkz.bikes.bridge;

import com.xworkz.bikes.internal.*;

public interface BikeDetail {
    BikesInfo bikeName(BikesInfo bikesInfo);

    BikesDetails name(BikesDetails bikesDetails);
    BikesShowroom showroom(BikesShowroom bikesShowroom);

    TotalBikes totals(TotalBikes totalBikes);
    TotalBikeDetails details(TotalBikeDetails totalBikeDetails);
}
