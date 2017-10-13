
package library;

/**
 *
 * @author Paul
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Author author = new Author("Paul", "masculine");
        Author otherAuthor = new Author();          // calls the constructor without arguments
        otherAuthor.setName("Ioana");
        otherAuthor.setGender("feminine");
        otherAuthor.printAuthor();
        Book book = new Book("HTML", author, 25.99, 10);
        book.printBook();
        
        Author[] authors = new Author[2];
        authors[0] = new Author("Peka", "masculine");
        authors[1] = new Author("Aqua", "feminine");
        Book bookWithAuthors = new Book("Java", authors, 55.95, 3);
        
            //System.out.println(book.getAuthor(i));
        bookWithAuthors.printBookAuthors();
    }
}
