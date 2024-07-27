package org.example.LibrarySystem;

import org.example.book.Book;
import org.example.patron.Patron;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LibraryManagement implements Library {

    private Map<String , Book> books;
    private Map<String, Patron> patrons;

    public LibraryManagement(Map<String, Book> books, Map<String, Patron> patrons) {
        this.books = books;
        this.patrons = patrons;
    }

    public Map<String, Book> getBooks() {
        return books;
    }

    public void setBooks(Map<String, Book> books) {
        this.books = books;
    }

    public Map<String, Patron> getParton() {
        return patrons;
    }

    public void setParton(Map<String, Patron> parton) {
        this.patrons = parton;
    }

    @Override
    public void addBook(Book book){
        books.put(book.getISBN(),book);
    }

    @Override
    public void removeBook(String isbn) {
        books.remove(isbn);
    }

    @Override
    public void updateBook(Book book){
        books.put(book.getISBN(),book);
    }

    @Override
    public void addPatron(Patron patron) {
        patrons.put(patron.getPatronId(),patron);
    }

    @Override
    public void updatePatron(Patron patron) {
        patrons.put(patron.getPatronId(), patron);
    }

    @Override
    public boolean checkInBook(String isbn, String patronId) {
        Book book = books.get(isbn);
        Patron patron = patrons.get(patronId);

        if (book != null && patron != null && !book.isBookAvailable()) {
            book.setBookAvailable(true);
            patron.returnBook(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkOutBook(String isbn, String patronId) {
        Book book = books.get(isbn);
        Patron patron = patrons.get(patronId);

        if (book != null && patron != null && book.isBookAvailable()) {
            book.setBookAvailable(false);
            patron.borrowBook(book);
            return true;
        }
        return false;
    }

    @Override
    public List<Book> searchByTitle(String title) {
        List<Book> titleBooks = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getNameOfBook().equalsIgnoreCase(title)) {
                titleBooks.add(book);
               return titleBooks;
            }
        }
        return null;
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        List<Book> authorBooks = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                authorBooks.add(book);
                return authorBooks;
            }
        }
        return null;
    }

    @Override
    public Book searchByISBN(String isbn) {
        Book book;
        book = books.get(isbn);
        return book;
    }

    @Override
    public List<String> getAvailableBooks() {

        List<String> availableBooks = new ArrayList<>();
        for (Book book : books.values()) {
            availableBooks.add(book.getNameOfBook());
        }
        return availableBooks;
    }

    @Override
    public List<Book> getBorrowedBooks() {

        return books.values().stream()
                .filter(Book::isBookAvailable)
                .collect(Collectors.toList());
    }


}
