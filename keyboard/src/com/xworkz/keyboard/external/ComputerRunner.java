package com.xworkz.keyboard.external;

import com.xworkz.keyboard.dto.ComputerDto;

public class ComputerRunner {
    public static void main(String[] args) {
        ComputerDto computerDto = new ComputerDto(512,12345678,3.2f,75000.345,'I',true,"dell",2,88899999l,15.5f,1.8,true,'W');
        System.out.println(computerDto.toString());

        ComputerDto computerDto1=new ComputerDto(400,99900078,2.2f,85000.345,'I',true,"HP",4,33399999l,13.5f,1.3,true,'W');
        ComputerDto computerDto2 = new ComputerDto(400,99900078,2.2f,85000.345,'I',true,"HP",4,33399999l,13.5f,1.3,true,'W');
        ComputerDto computerDto3=new ComputerDto(600,12345678,3.2f,75000.345,'I',true,"dell",2,88899999l,15.5f,1.8,true,'W');

        System.out.println(computerDto1.hashCode());
        System.out.println(computerDto2.hashCode());
        System.out.println(computerDto3.hashCode());

        Object name = null;
        System.out.println(computerDto3.equals(computerDto1) && name == null);

    }
}
