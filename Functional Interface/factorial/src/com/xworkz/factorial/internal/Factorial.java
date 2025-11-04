package com.xworkz.factorial.internal;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        int fact = 1;
        for(int num =1; num<= number;num++)
        {
            fact = fact *num;
        }
        System.out.println("Factorial of "+ number + "is" + fact);
    }
}
