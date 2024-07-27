package org.example.book;

import java.util.Map;

public class Book {

    private String nameOfBook;
    private String author;
    private String yearOfPublish;
    private String ISBN;
    private boolean isBookAvailable ;


    public Book(String author, String nameOfBook, String yearOfPublish, String ISBN, boolean isBookAvailable) {
        this.author = author;
        this.nameOfBook = nameOfBook;
        this.yearOfPublish = yearOfPublish;
        this.ISBN = ISBN;
        this.isBookAvailable = false;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(String yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isBookAvailable() {
        return isBookAvailable;
    }

    public void setBookAvailable(boolean bookAvailable) {
        isBookAvailable = bookAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + nameOfBook + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + ISBN + '\'' +
                ", publicationYear=" + yearOfPublish +
                ", isAvailable=" + isBookAvailable +
                '}';
    }
}
