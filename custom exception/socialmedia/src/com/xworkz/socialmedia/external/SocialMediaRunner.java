package com.xworkz.socialmedia.external;

import com.xworkz.socialmedia.internal.SocialMedia;

public class SocialMediaRunner {
    public static void main(String[] args) {
        SocialMedia socialMedia=new SocialMedia();
        socialMedia.checkAge(200);
//      socialMedia.checkAge(20);
        socialMedia.numberOutOfRange(60000);
//      socialMedia.numberOutOfRange(4000);
        socialMedia.nameCheck("Mandara");
//        socialMedia.nameCheck("mmm");
        socialMedia.passwordCheck("jaanu@123");
//        socialMedia.passwordCheck("mmm");

         socialMedia.email(".com");
//         socialMedia.email("co");


    }
}
