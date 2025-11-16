package com.xworkz.exception.events;

public class InvalidNumberException extends RuntimeException{
    public InvalidNumberException(String s)
    {
        System.out.println("In valid number");
    }
}
