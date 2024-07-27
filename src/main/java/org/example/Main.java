package org.example;

import org.example.LibrarySystem.Library;
import org.example.book.Book;
import org.example.section.Section;

import java.util.List;

import static org.example.book.TypeOfBook.COMIC;
import static org.example.book.TypeOfBook.FICTION;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Library myLibrarySystem = new Library("MyBookLibrary","SomeWhereOnEarth", 2);

        Section FictionBooks = new Section("Fiction");
        Section ComicBooks = new Section("Comics");

        myLibrarySystem.addTypeOfSection(FictionBooks);
        myLibrarySystem.addTypeOfSection(ComicBooks);

        Book fictionBook1 = new Book("FictionAuthor1","FictionbookOne", "2020", "456789", FICTION);
        Book fictionBook2 = new Book("FictionAuthor2","FictionbookTwo", "2021", "456788", FICTION);
        Book fictionBook3 = new Book("FictionAuthor3","FictionbookThree", "2010", "456788", FICTION);
        Book fictionBook4 = new Book("FictionAuthor4","FictionbookFour", "2100", "456787", FICTION);

        Book comic1 = new Book("ComicAuthor1","ComicbookOne", "2020", "456777", COMIC);
        Book comic2 = new Book("ComicAuthor2","Comicbookwo", "2001", "456776", COMIC);
        Book comic3 = new Book("ComicAuthor3","ComicbookThree", "2002", "456775", COMIC);
        Book comic4 = new Book("ComicAuthor4","ComicbookFour", "2103", "456774", COMIC);


        FictionBooks.addBook(fictionBook1,FictionBooks.getSectionName());
        FictionBooks.addBook(fictionBook2,FictionBooks.getSectionName());
        FictionBooks.addBook(fictionBook3,FictionBooks.getSectionName());
        FictionBooks.addBook(fictionBook4,FictionBooks.getSectionName());

        ComicBooks.addBook(comic1,ComicBooks.getSectionName());
        ComicBooks.addBook(comic2,ComicBooks.getSectionName());
        ComicBooks.addBook(comic3,ComicBooks.getSectionName());
        ComicBooks.addBook(comic4,ComicBooks.getSectionName());


        FictionBooks.isBookAvailableByName("FictionAuthor1");
        String q = fictionBook2.getNameOfBook();
        System.out.println(FictionBooks.getBook().contains(fictionBook1)+" "+q);

    }
}