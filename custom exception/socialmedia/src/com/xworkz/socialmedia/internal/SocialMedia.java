package com.xworkz.socialmedia.internal;

import com.xworkz.socialmedia.event.*;

public class SocialMedia {
    public int checkAge(int age) {
        if (age>30) {
            try {
                throw new CheckAgeException();
            } catch (CheckAgeException checkAgeException) {
            checkAgeException.printStackTrace();
                System.out.println("valid Age ");
            }
        }else {
            System.out.println("invalid age");
        }
  return age;
    }
    public long numberOutOfRange(int number){
        if(number>5000){
            try {
                throw new NumberOutOfRangeException();
            }catch (NumberOutOfRangeException numberOutOfRangeException){
                numberOutOfRangeException.printStackTrace();
                System.out.println("valid number");
            }
        }else {
            System.out.println("invalid number");
        }
        return number;
    }
    public String nameCheck(String name){
        if(name =="Mandara"){
            try {
                throw new NameCheckException();
            }catch (NameCheckException nameCheckException){
                nameCheckException.printStackTrace();
                System.out.println("valid name");
            }
        }else {
            System.out.println("invalid name");
        }
        return name;
    }
    public void passwordCheck(String password) {
        if (password =="jaanu@123") {
            try {
                throw new PasswordCheckException();
            } catch (PasswordCheckException passwordCheckException) {
                passwordCheckException.printStackTrace();
                System.out.println("valid password");
            }
        } else {
            System.out.println("invalid password");
        }

    }
    public void email(String name){
        if(name.contains(".com")) {
            try {
                throw new EmailCheckException();
            } catch (EmailCheckException e) {
                e.printStackTrace();
                System.out.println("valid email");
            }
        }else {
            System.out.println("invalid emali");

        }
    }

}
