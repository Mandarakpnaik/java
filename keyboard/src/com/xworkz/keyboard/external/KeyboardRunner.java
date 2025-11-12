package com.xworkz.keyboard.external;

import com.xworkz.keyboard.dto.KeyboardDto;

public class KeyboardRunner {
    public static void main(String[] args) {
        KeyboardDto keyboardDto =new KeyboardDto(123,98767899,250.56f,345.23,'M',true,"Hp",3,2.1f,43.23,8967777l,'Q',true);


        System.out.println(keyboardDto.toString());

        KeyboardDto keyboardDto1 = new KeyboardDto(234,6788999,300.34f,234.12,'K',true,"Logitech",4,1.2f,2.12,896788l,'Q',true);
        KeyboardDto keyboardDto2 =new KeyboardDto(234,6788999,300.34f,234.12,'K',true,"Logitech",4,1.2f,2.12,896788l,'Q',true);
        KeyboardDto keyboardDto3 =new KeyboardDto(890,4567814,250.34f,23.12,'M',false,"Dell",5,0.2f,0.123,908789887l,'Q',false);


        System.out.println(keyboardDto1.hashCode());
        System.out.println(keyboardDto2.hashCode());
        System.out.println(keyboardDto3.hashCode());


        Object name = null;
        System.out.println(keyboardDto1.equals(keyboardDto2) && name == null);

    }
}
