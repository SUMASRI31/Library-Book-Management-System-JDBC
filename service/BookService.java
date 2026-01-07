package com.codegnan.service;

import java.util.List;

import com.codegnan.dto.Book;

public interface BookService {
    void addBook(Book book);
    Book findBook(int id);
    List<Book> listBooks();
    void removeBook(int id);
}

