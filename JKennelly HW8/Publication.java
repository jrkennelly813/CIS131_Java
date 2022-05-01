/*
* Program       : Publication.java
* Purpose       : Generic base abstract class for books and periodicals.
* Programmer    : Justin Kennelly
* Date          : 08/01/2021
*/

import java.util.*;

// Parent class for Books and Periodicals
public abstract class Publication {

    private String title;
    private String publisher;
    private String pubDate;
    private String subject;

// Intialize the variables
    public Publication(String newTitle, String newPublisher, String string, String newSubject) {
        title = newTitle;
        publisher = newPublisher;
        pubDate = string;
        subject = newSubject;
    }

//Getters and Setters for variables
    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public void setPublisher(String newPublisher) {
        publisher = newPublisher;
    }

    public void setPubDate(String newDate) {
        pubDate = newDate;
    }

    public void setSubject(String newSubject) {
        subject = newSubject;
    }
    
    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPubDate() {
        return pubDate;
    }

// Output string for publication information
    @Override
    public String toString() {
        return "Title: " + title + " Publisher: " + publisher + " Date: " + pubDate + " Subject: " + subject;
    }
}







