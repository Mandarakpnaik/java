package com.xworkz.things.internal;

import com.xworkz.things.events.*;

public class Things {
    public void checkProduct(String name){
        if (name=="Soap"){
            try {
                throw new InvalidProductException();
            }catch (InvalidProductException invalidProductException){
                invalidProductException.printStackTrace();
                System.out.println("valid product");
            }
        }else {
            System.out.println("invalid product");
        }
    }
    public void checkExpire(int year){
        if (year<2026){
            try{
                throw new ProductExpiredException();
            }catch (ProductExpiredException productExpiredException){
                productExpiredException.printStackTrace();
                System.out.println("not expire");
            }
        }else {
            System.out.println("expire");
        }

    }
    public void checkFound(String product){
        if (product=="ToothPaste"){
            try {
                throw new ProductNotFoundException();
            }catch (ProductNotFoundException productNotFoundException){
                productNotFoundException.printStackTrace();
                System.out.println("found");
            }
        }else{
            System.out.println("not found");
        }
    }
    public void checkStock(int total){
        if (total<100){
            try {
                throw new ProductOutOfStockException();
            }catch (ProductOutOfStockException productOutOfStockException){
                productOutOfStockException.printStackTrace();
                System.out.println("stock full");
            }
        }
        else {
            System.out.println("out of stock");
        }
    }
    public void checkPrice(int price){
        if (price<200){
            try {
                throw new ProductPriceException();
            }catch (ProductPriceException productPriceException){
                productPriceException.printStackTrace();
                System.out.println("correct price");
            }
        }else {
            System.out.println("not a price");
        }
    }
}
