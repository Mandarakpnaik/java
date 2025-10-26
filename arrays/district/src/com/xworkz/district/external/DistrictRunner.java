package com.xworkz.district.external;

import com.xworkz.district.internal.District;
import com.xworkz.district.internal.House;
import com.xworkz.district.internal.Village;

public class DistrictRunner {
    public static void main(String[] args) {
        District distric = new District();
        House[] housenumber1 = {new House("Y", "X", "A", "B")};
        House[] housenumber2 = {new House("P", "Z", "r", "m")};
        House[] housenumber3 = {new House("C", "N", "K", "E")};
        House[] housenumber4 = {new House("D", "U", "V", "W")};

        Village firstVillage = new Village("ramagiri", 22, housenumber1);
        Village secondVillage = new Village("cchithradurga", 2000, housenumber2);
        Village thirdvillage = new Village("holkere", 300, housenumber3);
        Village fourthvillage = new Village("bangalore", 100000, housenumber4);
        Village[] villages = {firstVillage, secondVillage, thirdvillage, fourthvillage};
        distric.displayDistrict(villages);
    }


}
