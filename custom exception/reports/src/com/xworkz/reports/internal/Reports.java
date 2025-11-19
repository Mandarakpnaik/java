package com.xworkz.reports.internal;

import com.xworkz.reports.event.*;

public class Reports {
    public int displayAmmount(int ammount){
        if(ammount<200){
            try {
                throw new CheckAmountException();
            }catch (CheckAmountException checkAmountException){
                checkAmountException.printStackTrace();
                System.out.println("ammount is wrong");
            }
        }else {
            System.out.println("ammount is rigt");
        }
        return ammount;
    }
    public int displayBook(int book){
        if(book<5) {
            try {
                throw new ChecknumberBookException();
            } catch (ChecknumberBookException checknumberBookException) {
                checknumberBookException.printStackTrace();
                System.out.println("number is not book");
            }
        }else{
            System.out.println("number of  book");
        }
        return book;
    }
    public float displayqulity(float qulity){
        if(qulity<5.8f){
            try {
                throw new CheckQulityPageException();
            }catch (CheckQulityPageException checkQulitypageExcpetion){
                checkQulitypageExcpetion.printStackTrace();
                System.out.println("is wrong");
            }

        }else {
            System.out.println("is right");
        }
        return qulity;
    }
    public int displayimage(int image){
        if(image<7){
            try {
                throw new CheckNumberImageException();
            }catch (CheckNumberImageException checkNumberImageExcpetion){
                checkNumberImageExcpetion.printStackTrace();
                System.out.println("number image is wright");
            }
        }else {
            System.out.println("is wrong");
        }
        return image;
    }
    public int displayPages(int pages) {
        if (pages <50) {
            try {
                throw new CheckNumberPagesException();
            } catch (CheckNumberPagesException checkNumberPagesException) {
                checkNumberPagesException.printStackTrace();
                System.out.println("number of wrong");
            }
        } else {
            System.out.println("is right");

        }
        return pages;
    }
}
