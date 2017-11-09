
package library;

/**
 * A class to describe the book's view. 
 * 
 * @author Paul Farcas
 * @version 1.01 
 * @since Oct 2017
 */

public class BookView {
    public void printBookAuthors(String title, Author[] authors, double price, int quantity, Description description, long ISBN) {
        System.out.println("The book title is " + title + ",the authors are:");
        for(int i=0; i < authors.length; i++) {
            System.out.println("\t" + authors[i].printAuthor());
        }
        System.out.println("The book's price is " + price + " and we have " + quantity + " books.");
        System.out.println("The book's reg. nb. is " + Description.getBookRegistrationNumber() + ".");
        System.out.println("The book's year is " + description.getYear() + description.getDescription() + ", written in " + description.getLanguage()
                + " and published by " + description.getPublisher() + ".");
        System.out.println("The ISBN nb. is " + ISBN + ".");
    }
}
