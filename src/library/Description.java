/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Paul
 */

class Description {
    
    Description(int year, String description, Languages lang, String publisher) {
        this.year = year;
        this.description = description;
        this.lang = lang;
        this.publisher = publisher;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getLang() {
        String language = "";
        switch(lang) {
            case ENGLISH : language = "english";
                            break;
            case FRENCH : language = "french";
                            break;
            case GERMAN : language = "german";
                            break;
            case SPANISH : language = "spanish";
                            break;
            case ROMANIAN : language = "romanian";
                            break;
            case OTHER : language = "other";
        }
        return language;
    }
    
    public String getPublisher() {
        return publisher;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public static long getBookRegistrationNumber() {
        return bookRegistrationNumber++;
    }
    
    @Override
    public String toString() {
        return "Book Registration Number - " + bookRegistrationNumber + "\nyear - " + year + "\ndescription - " + description
                + "\nlangue - " + lang + "\npublisher - " + publisher;
    }
    
    private static long bookRegistrationNumber = 1111111;
    private int year;
    private String description;
    private Languages lang;
    private String publisher;
}
