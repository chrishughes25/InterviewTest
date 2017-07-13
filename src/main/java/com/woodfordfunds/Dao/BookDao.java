package com.woodfordfunds.Dao;

import com.woodfordfunds.model.Book;

import java.util.List;

public interface BookDao {
    Book getBook(String isbn);

    List<Book> getBooks();

}
