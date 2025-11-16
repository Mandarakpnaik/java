package com.xworkz.exception.internal;

import com.xworkz.exception.events.InvalidAgeException;

public class ProblemAge {
    public void problem(int age) throws InvalidAgeException{
        if(age >=40){
            System.out.println("Valid age"+age);

        }else {
           throw new InvalidAgeException("invalid age"+age);

        }

    }
}
