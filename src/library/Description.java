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
        noID ++;
        this.year = year;
        this.description = description;
    }
    
    public long getNoID() {
        return noID;
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
    
    
    
    @Override
    public String toString() {
        return "noId - " + noID + "\nyear - " + year + "\ndescription - " + description;
    }
    
    private static long noID = 1111111;
    private int year;
    private String description;
}
