package com.xworkz.mobile.internal;

public class Mobile {
    public String brand;
    public double price;
    public GalleryApp gallery;
    public MusicApp music;
    public NetMirrorApp netMirror;

    public Mobile(String brand,double price,GalleryApp gallery,MusicApp music,NetMirrorApp netMirror)
    {
        this.brand=brand;
        this.netMirror=netMirror;
        this.gallery=gallery;
        this.music=music;
        this.price=price;
    }
    public void displayMobilePhoneDetails()
    {
        System.out.println("MobilePhone brand :"+brand+ ","+ "MobilePhone price :"+price);
        System.out.println("GalleryApp total photos :"+gallery.totalPhotos+ ","+"GalleryApp appSize :"+gallery. appSize);
        System.out.println("Music App downloads :"+music.downloads+ ","+ "MusicApp is Premium :"+music.isPremium);
        System.out.println("NetMirrorApp active Users:"+netMirror.activeUsers+ ","+ "NetMirrorApp name:"+netMirror.netMirrorName);
    }
}
