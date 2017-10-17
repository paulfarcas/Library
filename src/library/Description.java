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
    
    Description(int year, String description) {
        this.year = year;
        this.description = description;
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
    
    public static long getBookRegistrationNumber() {
        return bookRegistrationNumber++;
    }
    
    @Override
    public String toString() {
        return "Book Registration Number - " + bookRegistrationNumber + "\nyear - " + year + "\ndescription - " + description;
    }
    
    private static long bookRegistrationNumber = 1111111;
    private int year;
    private String description;
}
