package com.xworkz.instagram.internal;

import com.xworkz.instagram.event.*;

public class Instagram {
    public int checkAge(int age) {
        if (age > 30) {
            try {
                throw new CheckAge();
            } catch (CheckAge checkAge) {
                checkAge.printStackTrace();
                System.out.println("valid Age  :" + age);
            }
        } else {
            System.out.println("invalid age :" + age);
        }
        return age;
    }

    public long numberOutOfUsers(int number) {
        if (number > 6000) {
            try {
                throw new NumberOfUsers();
            } catch (NumberOfUsers numberOfUsers) {
                numberOfUsers.printStackTrace();
                System.out.println("valid number :" + number);
            }
        } else {
            System.out.println("invalid number :" + number);
        }
        return number;
    }

    public String checkName(String name) {
        if (name == "Jaanu") {
            try {
                throw new CheckName();
            } catch (CheckName checkName) {
                checkName.printStackTrace();
                System.out.println("valid name :" + name);
            }
        } else {
            System.out.println("invalid name :" + name);
        }
        return name;
    }

    public void passwordCheck(String password) {
        if (password == "Mandara@123") {
            try {
                throw new PasswordCheck();
            } catch (PasswordCheck passwordCheck) {
                passwordCheck.printStackTrace();
                System.out.println("valid password :" + password);
            }
        } else {
            System.out.println("invalid password :" + password);
        }

    }
    public void email(String name){
        if(name.contains(".com")) {
            try {
                throw new EmailCheck();
            } catch (EmailCheck e) {
                e.printStackTrace();
                System.out.println("valid email ");
            }
        }else {
            System.out.println("invalid email");

        }
    }
}
