package org.example.patron;

import org.example.book.Book;

import java.util.List;

public class Patron {

    String name;
    String libraryId;
    String email;
    String location;
    List<Book> books;

    public Patron(String name, String libraryId, String email, String location, List<Book> books) {
        this.name = name;
        this.libraryId = libraryId;
        this.email = email;
        this.location = location;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
