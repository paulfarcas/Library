
package library;

import java.util.Random;

/**
 * A class to describe a book. 
 * 
 * @author Paul Farcas
 * @version 1.01 
 * @since Oct 2017
 */

public class Book {
    
    Book() {
        System.out.println("You have to set a name, an author, a price and a quantity for this book.");
    }
    
    /*Book(String title, Author author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }*/
    
    Book(String title, Author[] authors, double price, int quantity, Description description) {
        this.title = title;
        this.authors = authors;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        booksTotal ++;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public Author[] getAuthor() {
        return authors;
    }
    
    public Author setAuthor(int i) {
        return this.authors[i];   
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public long getRandom(long min, long max) {
        Random random = new Random();
        return   random.nextLong() % (max - min) + max;
    }
    
    public long getISBN() {
        long eanNumber = 9780000000000L;
        long prefixNumber = (long)getRandom(911111111L, 999999999L);
        ISBNnumber = eanNumber + prefixNumber;
        return ISBNnumber;
    }
    
    public void setISBN(long ISBNnumber) {
        this.ISBNnumber = ISBNnumber;
    }
    
    public String getAuthorName() {
        return author.getName();
    }
    
    public void setAuthorName(String name) {
        author.setName(name);
    }
    
    public String getAuthorGender() {
        return author.getGender();
    }
    
    public void setAuthorGender(String gender) {
        author.setGender(gender);
    }
    
    public static void BooksTotalNumber() {
        if(booksTotal == 1) {
            System.out.println("There is " + booksTotal + " book in our library.");
        } else {
            System.out.println("There are " + booksTotal + " books in our library.");
        }
    }
    
    public void printBook() {
        System.out.println("The book title is " + title + ", the author is " + author.printAuthor());
        System.out.println("The book price is " + price + " and we have " + quantity + " books.");
    }
    
    public void printBookAuthors() {
        System.out.println("The book title is " + title + ",the authors are:");
        for(int i=0; i < authors.length; i++) {
            System.out.println("\t" + authors[i].printAuthor());
        }
        System.out.println("The book's price is " + price + " and we have " + quantity + " books.");
        System.out.println("The book's reg. nb. is " + Description.getBookRegistrationNumber() + ".");
        System.out.println("The book's year is " + description.getYear() + description.getDescription() + ", written in " + description.getLanguage()
                + " and published by " + description.getPublisher() + ".");
        System.out.println("The ISBN nb. is " + getISBN() + ".");
    }
    
    @Override
    public String toString() {
        //for(int i=0; i < authors.length; i++) {
            return "Title - " + title + "\nauthor - " + authors + "\nprice - " + price + "\nquantity - " + quantity + ".";
        //}
    }
    
    public static int booksTotal = 0;
    private String title;
    private Author[] authors;
    private Author author;
    private double price;
    private int quantity;
    Description description;
    private long ISBNnumber; 
}
