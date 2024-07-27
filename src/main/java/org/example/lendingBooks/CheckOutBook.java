package org.example.lendingBooks;

import org.example.book.Book;
import org.example.patron.Patron;

public class CheckOutBook {

    Book book;
    Patron patron;
    String Date;

    public CheckOutBook(Book book, Patron patron, String date) {
        this.book = book;
        this.patron = patron;
        Date = date;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Patron getPatron() {
        return patron;
    }

    public void setPatron(Patron patron) {
        this.patron = patron;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }


}
