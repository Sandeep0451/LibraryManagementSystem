package org.example;


import org.example.LibrarySystem.Library;
import org.example.LibrarySystem.LibraryManagement;
import org.example.book.Book;
import org.example.patron.Patron;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Library library = new LibraryManagement();

        Book book1 = new Book("AuthorOne", "BookOne", "2011", "11211");
        Book book2 = new Book("AuthorTwo", "BookTwo", "2002", "22522");
        Book book3 = new Book("AuthorThree", "BookThree", "2002", "11213");
        Book book4 = new Book("AuthorFour", "BookFour", "2002", "11214");
        Book book5 = new Book("AuthorFive", "BookFive", "2002", "11215");
        Book book6 = new Book("AuthorSix", "BookSix", "2002", "11216");
        Book book7 = new Book("AuthorSeven", "BookSeven", "2002", "11217");
        Book book8 = new Book("AuthorEight", "BookEight", "2002", "11218");
        Book book9 = new Book("AuthorNine", "BookNine", "2002", "11219");
        Book book10 = new Book("AuthorTen", "BookTen", "2002", "11220");
        Book book11 = new Book("AuthorEleven", "BookEleven", "2002", "11221");
        Book book12 = new Book("AuthorTwelve", "BookTwelve", "2002", "11222");
        Book book13 = new Book("AuthorThirteen", "BookThirteen", "2002", "11223");
        Book book14 = new Book("AuthorFourteen", "BookFourteen", "2002", "11224");
        Book book15 = new Book("AuthorFifteen", "BookFifteen", "2002", "11225");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);
        library.addBook(book11);
        library.addBook(book12);
        library.addBook(book13);
        library.addBook(book14);
        library.addBook(book15);


        Patron patron1 = new Patron("PatronOne", "PAT001");
        Patron patron2 = new Patron("PatronTwo", "PAT002");
        Patron patron3 = new Patron("PatronThree", "PAT003");
        Patron patron4 = new Patron("PatronFour", "PAT004");
        Patron patron5 = new Patron("PatronFive", "PAT005");
        Patron patron6 = new Patron("PatronSix", "PAT006");
        Patron patron7 = new Patron("PatronSeven", "PAT007");
        Patron patron8 = new Patron("PatronEight", "PAT008");
        Patron patron9 = new Patron("PatronNine", "PAT009");
        Patron patron10 = new Patron("PatronTen", "PAT010");
        Patron patron11 = new Patron("PatronEleven", "PAT011");
        Patron patron12 = new Patron("PatronTwelve", "PAT012");
        Patron patron13 = new Patron("PatronThirteen", "PAT013");
        Patron patron14 = new Patron("PatronFourteen", "PAT014");
        Patron patron15 = new Patron("PatronFifteen", "PAT015");


        library.addPatron(patron1);
        library.addPatron(patron2);
        library.addPatron(patron3);
        library.addPatron(patron4);
        library.addPatron(patron5);
        library.addPatron(patron6);
        library.addPatron(patron7);
        library.addPatron(patron8);
        library.addPatron(patron9);
        library.addPatron(patron10);
        library.addPatron(patron11);
        library.addPatron(patron12);
        library.addPatron(patron13);
        library.addPatron(patron14);
        library.addPatron(patron15);


        library.checkOutBook("11211","PAT002");
        library.checkOutBook("11214","PAT002");
        library.checkOutBook("11223","PAT002");
        library.checkOutBook("11225","PAT007");
        library.checkOutBook("11215","PAT007");

        System.out.println(library.getAvailableBooks());

        library.checkInBook("11211","PAT002");
        library.checkInBook("11225","PAT007");
        library.checkInBook("11215","PAT007");

        System.out.println(library.getAvailableBooks());

        System.out.println(library.searchByAuthor("AuthorTen"));
        System.out.println(library.searchByAuthor("AuthorFifteen"));

        System.out.println(library.searchByISBN("11222"));
        System.out.println(library.searchByISBN("11223"));

    }
}