
package library;

/**
 *
 * @author Paul
 */
public class Book {
    
    Book() {
        System.out.println("You have to set a name, an author, a price and a quantity for this book.");
        System.out.println("Push");
    }
    
    Book(String title, Author author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }
    
    Book(String title, Author[] authors, double price, int quantity) {
        this.title = title;
        this.authors = authors;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public Author getAuthor() {
        return author;
    }
    
    public Author getAuthor(int i) {
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
    
    public void printBook() {
        System.out.println("The book title is " + title + ", the author is " + author.printAuthor());
        System.out.println("The book price is " + price + " and we have " + quantity + " books.");
    }
    
    public void printBookAuthors() {
        System.out.println("The book title is " + title + ",the authors are:");
        for(int i=0; i < authors.length; i++) {
            System.out.println("\t" + authors[i].printAuthor());
        }
        System.out.println("The book price is " + price + " and we have " + quantity + " books.");
    }
    
    @Override
    public String toString() {
        //for(int i=0; i < authors.length; i++) {
            return "Title - " + title + "\nauthor - " + authors + "\nprice - " + price + "\nquantity - " + quantity + ".";
        //}
    }
    
    private String title;
    private Author[] authors;
    private Author author;
    private double price;
    private int quantity;
}
