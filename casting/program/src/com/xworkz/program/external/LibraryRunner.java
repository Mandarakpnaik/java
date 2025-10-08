package com.xworkz.program.external;

import com.xworkz.program.internal.Book;
import com.xworkz.program.internal.Library;

public class LibraryRunner {
    public static void main(String[] args) {
    Library libraryName = new Book();
    libraryName.libraryPrice();
    Book book = (Book)libraryName;
    book.bookPrice();

    }
}
