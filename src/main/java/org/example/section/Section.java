package org.example.section;

import org.example.book.Book;

import java.util.ArrayList;
import java.util.List;

public class Section {


    String SectionName;
    List<Book> book;
    boolean isBookAvailable;

    public Section(String sectionName) {
        SectionName = sectionName;
        this.book = new ArrayList<>();
    }

    public String getSectionName() {
        return SectionName;
    }

    public void setSectionName(String sectionName) {
        SectionName = sectionName;
    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    public boolean getBookAvailable() {
        return isBookAvailable;
    }

    public void setBookAvailable(boolean bookAvailable) {
        isBookAvailable = bookAvailable;
    }


    public boolean addBook(Book books,String SectionName){
        System.out.println("Add "+books.getAuthor()+" under section "+SectionName+" "+books.getAuthor());
        return book.add(books);

    }

    public boolean removeBook(Book books){
        return book.remove(books);
    }

    public boolean updateBook(Book book){
        this.isBookAvailable = true;

        return true;
    }


    public boolean isBookAvailableByName(String AuthorName){

            if(Section.this.book){
                System.out.println(AuthorName+"Present in "+Section.this.SectionName);
                return true;
            }else{
                System.out.println(AuthorName+"Not Present in "+Section.this.SectionName+" "+getBook());
                String e="";
                List<Book> q= getBook();
                ;
                for(int i= 0;i<q.size();i++){

                }
            }
        return false;
    }



}
