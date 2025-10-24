package com.xworkz.mobile.external;

import com.xworkz.mobile.internal.GalleryApp;
import com.xworkz.mobile.internal.Mobile;
import com.xworkz.mobile.internal.MusicApp;
import com.xworkz.mobile.internal.NetMirrorApp;

public class MobileRunner {
    public static void main(String [] ref)
    {
        GalleryApp gallery=new GalleryApp(1650,45.4f);
        MusicApp music=new MusicApp(4678124l,true);
        NetMirrorApp netMirror = new NetMirrorApp(3201,"NetMirror Pro");

        Mobile mobile =new Mobile("Sumsung",39899.990,gallery,music,netMirror);
        mobile.displayMobilePhoneDetails();
    }
}
