package com.xworkz.books.bridge;

import com.xworkz.books.internal.*;

public interface Publisher {
    BookCategory category(BookCategory bookCategory);
    boolean details(BookDetails bookDetails);
    BookInfo info(BookInfo bookInfo);
    boolean store(BookStore bookStore);
    BookSales sales(BookSales bookSales);
}
