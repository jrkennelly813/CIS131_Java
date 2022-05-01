/*
* Program       : Book.java
* Purpose       : Initiates a Book Object using the publication class extension
* Programmer    : Justin Kennelly
* Date          : 08/01/2021
*/

import java.util.*;

public class Book extends Publication {

    private String isbn;
    private String libConNum;
    private String author;
    private int numPages;


    public Book(String newTitle, String newPublisher, String string, String newSubject, String newIsbn, String newLibConNum, String newAuthor, int newnumPages) {

        // Extension Attributes of Publication Class
        super(newTitle, newPublisher, string, newSubject);
        isbn = newIsbn;
        libConNum = newLibConNum;
        author = newAuthor;
        numPages = newnumPages;
    }

//Getters and Setters for Variables
    public void setIsbn(String newIsbn) {
        isbn = newIsbn;
    }

    public void setLccn(String newLibConNum) {
        libConNum = newLibConNum;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public void setPageCount(int newnumPages) {
        numPages = newnumPages;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getLccn() {
        return libConNum;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return numPages;
    }

// Output string for book information
    @Override
    public String toString() {
        return super.toString() + " Book (Isbn: " + isbn + " LCCN: " + libConNum + " Author: " + author + " PageCount: " + numPages + ")";
    }
}
