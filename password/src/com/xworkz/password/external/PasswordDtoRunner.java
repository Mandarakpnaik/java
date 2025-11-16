package com.xworkz.password.external;

import com.xworkz.password.dto.PasswordDto;

public class PasswordDtoRunner {
    public static void main(String[] args) {
        PasswordDto passwordDto=new PasswordDto("Jaanu@123","Jaanu");
        PasswordDto passwordDto1=new PasswordDto("Janu@123","Janu");

        System.out.println(passwordDto.toString());

        System.out.println("Password is correct==="+passwordDto.equals(passwordDto1));

    }
}
