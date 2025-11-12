package com.xworkz.keyboard.external;

import com.xworkz.keyboard.dto.BookDto;

public class BookRunner {
    public static void main(String[] args) {

        BookDto bookDto=new BookDto(80,56789445,55.43f,1.2,'T',true,"james",2019,4.5f,1.34,true,'C',67896544l);

        System.out.println(bookDto.toString());
        BookDto bookDto1=new BookDto(50,789445,599.43f,1.2,'T',true,"james",2019,4.5f,1.34,true,'C',67896544l);
        BookDto bookDto2=new BookDto(40,56789445,55.43f,1.2,'T',true,"james",2019,4.5f,1.34,true,'C',67896544l);
        BookDto bookDto3=new BookDto(40,56789445,55.43f,1.2,'T',true,"james",2019,4.5f,1.34,true,'C',67896544l);

        System.out.println(bookDto1.hashCode());
        System.out.println(bookDto2.hashCode());
        System.out.println(bookDto3.hashCode());
        System.out.println(bookDto.hashCode());
        Object name = null;
        System.out.println(bookDto3.equals(bookDto2) && name == null);
    }
}
