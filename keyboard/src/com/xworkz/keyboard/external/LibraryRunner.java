package com.xworkz.keyboard.external;

import com.xworkz.keyboard.dto.LibraryDto;

public class LibraryRunner {
    public static void main(String[] args) {
        LibraryDto libraryDto=new LibraryDto(100000,1234567l,12.5f,2500.56,'A',true,"City central library",25,500.56f,2500000.456,true,'A',678904556l);
        System.out.println(libraryDto.toString());

        LibraryDto libraryDto1=new LibraryDto(100000,234567l,14.5f,3500.56,'A',true,"City central library",20,400.56f,1500000.456,true,'B',6904556l);
        LibraryDto libraryDto2=new LibraryDto(200000,1234567l,12.5f,2500.56,'A',true,"City central library",25,500.56f,2500000.456,true,'A',678904556l);
        LibraryDto libraryDto3=new LibraryDto(200000,1234567l,12.5f,2500.56,'A',true,"City central library",25,500.56f,2500000.456,true,'A',678904556l);

        System.out.println(libraryDto1.hashCode());
        System.out.println(libraryDto3.hashCode());
        System.out.println(libraryDto2.hashCode());
        System.out.println(libraryDto.hashCode());;

        Object name = null;
        System.out.println(libraryDto2.equals(libraryDto3) && name == null);
    }
}
