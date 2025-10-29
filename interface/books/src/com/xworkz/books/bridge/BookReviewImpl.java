package com.xworkz.books.bridge;

import com.xworkz.books.internal.*;

public class BookReviewImpl implements BookReview{
    public BookCategory category(BookCategory bookCategory) {
        System.out.println("Book category :"+bookCategory.categoryCode+ ","+ "library id:"+bookCategory.libraryId);
        return bookCategory;
    }

    @Override
    public boolean details(BookDetails bookDetails) {
        if(bookDetails.isAvailable)
        {
            System.out.println("book is available :"+bookDetails.isAvailable+ ","+ "Book id:"+bookDetails.bookId);
            return true;
        }else{
            return false;
        }

    }

    @Override
    public BookInfo info(BookInfo bookInfo) {
        System.out.println("Book info :"+bookInfo.authorName+ ","+ "book discount:"+bookInfo.discount);
        return bookInfo;
    }

    @Override
    public boolean store(BookStore bookStore) {
        if(bookStore.isOpen)
        {
            System.out.println("book store :"+bookStore.isOpen+ ","+ ":"+bookStore.annualIncome);
            return true;
        }else {
            return false;
        }

    }

    @Override
    public BookSales sales(BookSales bookSales) {
        System.out.println("Book sales :"+bookSales.profitEarned+ ","+ ":"+bookSales.totalBooksSold);
        return bookSales;
    }
}
