package com.codegnan.controller;


import java.util.Scanner;

import com.codegnan.dto.Book;
import com.codegnan.service.BookService;
import com.codegnan.service.BookServiceImpl;

public class LibraryBookController {

    public static void main(String[] args) {
        BookService service = new BookServiceImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add Book  2.View Book  3.View All  4.Delete  5.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    service.addBook(new Book(title, author, price, "AVAILABLE"));
                    System.out.println("Book Added");
                    break;

                case 2:
                    System.out.print("Book ID: ");
                    int id = sc.nextInt();
                    Book b = service.findBook(id);
                    System.out.println(b != null ? b.getTitle() : "Book Not Found");
                    break;

                case 3:
                    for (Book book : service.listBooks()) {
                        System.out.println(book.getBookId() + " " + book.getTitle());
                    }
                    break;

                case 4:
                    System.out.print("Book ID: ");
                    service.removeBook(sc.nextInt());
                    System.out.println("Book Deleted");
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}
