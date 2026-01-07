package com.codegnan.service;


import java.util.List;

import com.codegnan.dao.BookDao;
import com.codegnan.dao.BookDaoImpl;
import com.codegnan.dto.Book;

public class BookServiceImpl implements BookService {

    private BookDao dao = new BookDaoImpl();

    public void addBook(Book book) {
        dao.addBook(book);
    }

    public Book findBook(int id) {
        return dao.getBookById(id);
    }

    public List<Book> listBooks() {
        return dao.getAllBooks();
    }

    public void removeBook(int id) {
        dao.deleteBook(id);
    }
}
