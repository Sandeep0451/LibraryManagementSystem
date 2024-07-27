package org.example.LibrarySystem;

import org.example.book.Book;
import org.example.patron.Patron;

import java.util.List;

public interface Library {

    void addBook(Book book);
    void removeBook(String isbn);
    void updateBook(Book book);

    void addPatron(Patron patron);
    void updatePatron(Patron patron);

    boolean checkInBook(String isbn,String patronId);
    void checkOutBook(String isbn, String patronId);

    List<Book> searchByTitle(String title);
    List<Book> searchByAuthor(String author);
    Book searchByISBN(String isbn);

    List<String> getAvailableBooks();
    List<Book> getBorrowedBooks();

}
