package org.example.LibrarySystem;

import org.example.section.Section;

import java.util.ArrayList;
import java.util.List;

public class Library {

    String libraryName;
    String libraryAddress;
    int totalSections;
    List<Section> sections;


    public Library(String libraryName, String libraryAddress, int totalSections) {
        this.libraryName = libraryName;
        this.libraryAddress = libraryAddress;
        this.totalSections = totalSections;
        this.sections = new ArrayList<>();

    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryAddress() {
        return libraryAddress;
    }

    public void setLibraryAddress(String libraryAddress) {
        this.libraryAddress = libraryAddress;
    }

    public int getTotalSections() {
        return totalSections;
    }

    public void setTotalSections(int totalSections) {
        this.totalSections = totalSections;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }


    public boolean addTypeOfSection(Section section) {
        System.out.println("Added Section "+section);
        return sections.add(section);
    }

    public boolean removeSection(Section section) {
        return sections.remove(section);
    }

    public boolean searchBookByAuthor(List<Section> sections,String authorName){
        for(Section section : sections){
            section.getBook();
        }
        return true;

    }


}
