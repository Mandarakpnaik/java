package com.xworkz.phone.external;

import com.xworkz.phone.internal.FeaturePhone;
import com.xworkz.phone.internal.SmartPhone;

public class PhoneRunner {
    public static void main(String[] args) {
        FeaturePhone featurePhone = new FeaturePhone();
        featurePhone.displayFeaturePhone();
        featurePhone.displayPhone();

        SmartPhone phone = new SmartPhone();
        phone.displayPhone();
        phone.displaySmart();
    }
}
