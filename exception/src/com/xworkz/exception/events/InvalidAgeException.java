package com.xworkz.exception.events;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String s) {
        System.out.println("Invalid age");
    }
}
