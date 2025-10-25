package com.xworkz.nurse.internal;

public class Nurse {
    public Nurse()
    {
        this("Anitha");
        System.out.println("This is Nurse class ");
    }
    public Nurse(String name)
    {
        this("Kavya",27);
        System.out.println(name);
    }
    public Nurse(String name,int age)
    {
        this("Harshitha",29,123456899l);
        System.out.println(name);
        System.out.println(age);

    }
    public Nurse(String name,int age,long nurseId)
    {
        this("Navya",35,5673457l,165.34f);
        System.out.println(name);
        System.out.println(age);
        System.out.println(nurseId);

    }
    public Nurse(String name,int age,long nurseId,float height)
    {
        this("Ramya",40,8901233l,160.34f,60.45);
        System.out.println(name);
        System.out.println(age);
        System.out.println(nurseId);
        System.out.println(height);
    }
    public Nurse(String name,int age,long nurseId,float height,double weight)
    {
        this("Navya",35,5673457l,165.34f,55.45,'F');
        System.out.println(name);
        System.out.println(age);
        System.out.println(nurseId);
        System.out.println(height);
        System.out.println(weight);
    }
    public Nurse(String name,int age,long nurseId,float height,double weight,char gender)
    {
        this("Harshitha",29,123456899l,156.54f,64.34,'F',true);
        System.out.println(name);
        System.out.println(age);
        System.out.println(nurseId);
        System.out.println(height);
        System.out.println(weight);
        System.out.println(gender);
    }
    public Nurse(String name,int age,long nurseId,float height,double weight,char gender,boolean isRegistered)
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(nurseId);
        System.out.println(height);
        System.out.println(weight);
        System.out.println(gender);
        System.out.println(isRegistered);
    }
}
