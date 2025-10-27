package com.xworkz.school.internal;

public class Grade {
    public String firstgrade;
    public String secondgrade;
    public String thirdgrade;
    public  String fourthgrade;
    public Grade(String firstgrade, String secondgrade, String thirdgrade, String fourthgrade){
        this.firstgrade=firstgrade;
        this.secondgrade=secondgrade;
        this.thirdgrade=thirdgrade;
        this.fourthgrade=fourthgrade;
    }
    public void displayClass(){
        System.out.println("first class:"+fourthgrade);
        System.out.println("second clss :"+secondgrade);
        System.out.println("third class:"+thirdgrade);
        System.out.println("fourth class :"+fourthgrade);
    }

}
