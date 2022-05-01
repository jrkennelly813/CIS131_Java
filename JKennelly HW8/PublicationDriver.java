/*
* Program       : PublicationDriver.java
* Purpose       : Drivers the program for the publication class.
* Programmer    : Justin Kennelly
* Date          : 08/01/2021
*/

import java.util.*;

import java.util.ArrayList;

public class PublicationDriver {
public static void main(String[] args) {

    ArrayList<Publication> pubList = new ArrayList<>();

    Book b1 = new Book("Java Programming", "Great Publishing", "03/24/15", "Java Programming Language", "11111111", "22222222", "BestAuthor", 220);
    Book b2 = new Book("Rocket Ships", "Leopard", "01/14/2015", "Aerospace", "22222222", "33333333", "Author2", 405);
    Book b3 = new Book("Dr. Seuss", "Walt Disney", "01/01/2018", "Bedtime", "123789456", "456321984", " Mr. Seuss II", 101);
    
    Periodical p1 = new Periodical("News Times", "Pub Publishing", "10/28/2016", "Information", "weekly", "The Best News");
    Periodical p2 = new Periodical("Money Today", "Green Backs Publishing Co.", "03/16/1986", "Money", "monthly", "Scrooge McDuck");
    Periodical p3 = new Periodical("RaceCars", "Radiator Springs Publishing", "11/24/2002", "Automotive", "Bi-Weekly", "Ripper Magoo");

    pubList.add(b1);
    pubList.add(b2);
    pubList.add(b3);
    pubList.add(p1);
    pubList.add(p2);
    pubList.add(p3);

    for(Publication p : pubList) {
        System.out.println(p);
        }
    }
}