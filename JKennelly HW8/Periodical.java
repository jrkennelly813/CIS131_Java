/*
* Program       : Periodical.java
* Purpose       : Intitiates a peridical object using an extension of publication class.
* Programmer    : Justin Kennelly
* Date          : 08/01/2021
*/

import java.util.*;

// Class for initializing periodical objects using publication abstract class as an extension
public class Periodical extends Publication {

    // Extra attributes for periodical objects
    private String publicationFrequency; 
    private String editor;
    
    //Peridoical constructor
    public Periodical(String newTitle, String newPublisher, String string, String newSubject, String frequency, String newEditor) {
        // Extended constructor attributes
        super(newTitle, newPublisher, string, newSubject);
        publicationFrequency = frequency;
        editor = newEditor;
    }

    // Getters and Setters for variables
    public void setPublicationFrequency(String frequency) {
        publicationFrequency = frequency;
    }

    public void setEditor(String newEditor) {
        editor = newEditor;
    }

    public String getPublicationFrequency() {
        return publicationFrequency;
    }

    public String getEditor() {
        return editor;
    }

// Output string for periodical information
    @Override
    public String toString() {
        return super.toString() + " Periodical (Frequency: " + publicationFrequency + " Editor: " + editor + ")";
    }
}