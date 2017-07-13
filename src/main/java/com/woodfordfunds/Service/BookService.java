package com.woodfordfunds.Service;


import com.woodfordfunds.Dao.BookDao;

public class BookService {
    private final BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

}
