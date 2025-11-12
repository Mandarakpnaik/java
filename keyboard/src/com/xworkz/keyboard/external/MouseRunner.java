package com.xworkz.keyboard.external;

import com.xworkz.keyboard.dto.KeyboardDto;
import com.xworkz.keyboard.dto.MouseDto;

public class MouseRunner {
    public static void main(String[] args) {
        MouseDto mouseDto =new MouseDto(101,789064444,999.56f,0.23,'O',true,"Hp",3,2.1f,43.23,6766666l,'M',true);


        System.out.println(mouseDto.toString());

        MouseDto mouseDto1 = new MouseDto(201,788999,700.34f,234.12,'O',true,"Dell",2,1.24f,0.12,1233458l,'M',true);
        MouseDto mouseDto2 =new MouseDto(201,788999,700.34f,234.12,'O',true,"Dell",2,1.24f,0.12,1233458l,'M',true);
        MouseDto mouseDto3 =new MouseDto(890,4567814,250.34f,23.12,'M',false,"Logitexh",5,0.2f,0.123,389887l,'M',false);


        System.out.println(mouseDto1.hashCode());
        System.out.println(mouseDto2.hashCode());
        System.out.println(mouseDto3.hashCode());


        Object name = null;
        System.out.println(mouseDto1.equals(mouseDto3) && name == null);
    }
}
