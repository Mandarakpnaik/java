package com.xworkz.bikes.bridge;

import com.xworkz.bikes.internal.*;

public interface Name {
    BikesInfo bikeName(BikesInfo bikesInfo);

    BikesDetails name(BikesDetails bikesDetails);
    BikesShowroom showroom(BikesShowroom bikesShowroom);

    TotalBikes total(TotalBikes totalBikes);
    TotalBikeDetails details(TotalBikeDetails totalBikeDetails);
}
