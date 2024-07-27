package org.example.patron;

import org.example.book.Book;

import java.util.List;

public class Patron {

    private String name;
    private String patronId;
    private List<Book> books;

    public Patron(String name, String libraryId,  List<Book> books) {
        this.name = name;
        this.patronId = libraryId;

        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronId() {
        return patronId;
    }

    public void setPatronId(String patronId) {
        this.patronId = patronId;
    }


    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void borrowBook(Book book){
        if(book!=null && book.isBookAvailable()){
            books.add(book);
            book.setBookAvailable(false);
        }
    }

    public void returnBook(Book book){
        if(book!=null && !book.isBookAvailable()){
           books.remove(book);
           book.setBookAvailable(true);
        }
    }

    @Override
    public String toString() {
        return "Patron{" +
                "name='" + name + '\'' +
                ", id='" + patronId + '\'' +
                ", borrowedBooks=" + books +
                '}';
    }
}
