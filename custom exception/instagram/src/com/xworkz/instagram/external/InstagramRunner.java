package com.xworkz.instagram.external;

import com.xworkz.instagram.internal.Instagram;

public class InstagramRunner {
    public static void main(String[] args) {
        Instagram instagram=new Instagram();
//        instagram.checkAge(40);
        instagram.checkAge(23);
//        instagram.checkName("Jaanu");
        instagram.checkName("mandara");
//        instagram.numberOutOfUsers(7000);
        instagram.numberOutOfUsers(500);
//        instagram.passwordCheck("Mandara@123");
        instagram.passwordCheck("janavi@34");
//        instagram.email(".com");
        instagram.email("@");
    }
}
