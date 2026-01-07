package com.codegnan.dao;

import java.util.List;

import com.codegnan.dto.Book;

public interface BookDao {
    void addBook(Book book);
    Book getBookById(int id);
    List<Book> getAllBooks();
    void deleteBook(int id);
}
