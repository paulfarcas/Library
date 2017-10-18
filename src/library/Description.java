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
    
    Description(int year, String description, Languages language, String publisher) {
        this.year = year;
        this.description = description;
        this.language = language;
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
    
    public String getLanguage() {
        String languages = "";
        switch(language) {
            case ENGLISH : languages = "english";
                            break;
            case FRENCH : languages = "french";
                            break;
            case GERMAN : languages = "german";
                            break;
            case SPANISH : languages = "spanish";
                            break;
            case ROMANIAN : languages = "romanian";
                            break;
            case OTHER : languages = "other";
        }
        return languages;
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
                + "\nlanguage - " + language + "\npublisher - " + publisher;
    }
    
    private static long bookRegistrationNumber = 1111111;
    private int year;
    private String description;
    private Languages language;
    private String publisher;
}
