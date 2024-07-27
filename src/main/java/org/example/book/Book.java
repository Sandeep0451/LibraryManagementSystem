package org.example.book;

import org.example.section.Section;

public class Book {

    String nameOfBook;
    public static String author;
    String yearOfPublish;
    String ISBN;
    TypeOfBook type;



    public Book(String author, String nameOfBook, String yearOfPublish, String ISBN, TypeOfBook type) {
        this.author = author;
        this.nameOfBook = nameOfBook;
        this.yearOfPublish = yearOfPublish;
        this.ISBN = ISBN;
        this.type = type;
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

    public boolean isBookByName(String AuthorName){
       if(Book.this.nameOfBook.equals(AuthorName)){
           System.out.println(AuthorName+"Present in ");
       }else{
           System.out.println(AuthorName+"Present not in ");
       }
        return true;
    }
}
