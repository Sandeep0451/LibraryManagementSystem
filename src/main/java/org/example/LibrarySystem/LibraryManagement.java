package org.example.LibrarySystem;

import org.example.book.Book;
import org.example.patron.Patron;

import java.util.*;
import java.util.stream.Collectors;

public class LibraryManagement implements Library {

    private Map<String , Book> books;
    private Map<String, Patron> patrons;

    public LibraryManagement() {
        this.books = new HashMap<>();
        this.patrons = new HashMap<>();
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
        System.out.println("Added Book with title to Library is:"+book.getNameOfBook());

    }

    @Override
    public void removeBook(String isbn) {
        books.remove(isbn);
        System.out.println("Removed Book with ISBN from Library is:"+isbn);
    }

    @Override
    public void updateBook(Book book){
        books.put(book.getISBN(),book);
        System.out.println("Updated Book with title in Library is:"+book.getNameOfBook());
    }

    @Override
    public void addPatron(Patron patron) {
        patrons.put(patron.getPatronId(),patron);
        System.out.println("Added Patron with name in Library is:"+patron.getName());
    }

    @Override
    public void updatePatron(Patron patron) {
        patrons.put(patron.getPatronId(), patron);
        System.out.println("Updated Patron with name in Library is:"+patron.getName());
    }

    @Override
    public boolean checkInBook(String isbn, String patronId) {
        Book book = books.get(isbn);
        Patron patron = patrons.get(patronId);

        if (book != null && patron != null ) {
            book.setBookAvailable(true);
            patron.returnBook(book);
            System.out.println("Returned book :"+book.getNameOfBook()+" From Parton "+patronId);
            return true;
        }
        return false;
    }

    @Override
    public void checkOutBook(String isbn, String patronId) {
        Book book = books.get(isbn);
        Patron patron = patrons.get(patronId);

        if (book != null && patron != null) {
            book.setBookAvailable(false);
            patron.borrowBook(book);
            System.out.println("Parton "+patronId+" Borrowed book :"+book.getISBN());

        }else if(book==null){
            System.out.println("Book not available");
        }else {
            System.out.println("Patron not available");
        }
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

        return  books.values().stream()
                .filter(book -> book.getAuthor().toLowerCase().contains(author.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public Book searchByISBN(String isbn) {

        return  books.get(isbn);
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
