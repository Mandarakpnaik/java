package com.xworkz.teacher.internal;

public class Subject {
    public  String firstlangauege;
    public  String secondlangauege;
    public  String thirdlangauege;
    public String fourthlangauege;
    public Subject(String firstlangauege, String secondlangauege,String thirdlangauege,String fourthlangauege){
        this.firstlangauege=firstlangauege;
        this.secondlangauege=secondlangauege;
        this.thirdlangauege=thirdlangauege;
        this.fourthlangauege=fourthlangauege;
    }
    public void displaySubject(){
        System.out.println("first langauege :"+firstlangauege);
        System.out.println("second langauege:"+secondlangauege);
        System.out.println("third langauege:"+thirdlangauege);
        System.out.println("fourth langauege:"+fourthlangauege);
    }

}
