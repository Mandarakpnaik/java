package com.xworkz.exception.internal;

import com.xworkz.exception.events.InvalidNumberException;

public class ProblemsInvalid {
public void issue(int age) throws InvalidNumberException {
    if(age >=30){
        System.out.println("valid age :"+age);
    }else {
        throw new InvalidNumberException("invalid age "+age);
    }
}
}
