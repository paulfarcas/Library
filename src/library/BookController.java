
package library;

/**
 * A class to describe a book's controller. 
 * 
 * @author Paul Farcas
 * @version 1.01 
 * @since Oct 2017
 */

public class BookController {
    
    BookController(Book bookModel, BookView bookView) {
        this.bookModel = bookModel;
        this.bookView = bookView;
    }
    
    public String getBookTitle() {
        return bookModel.getTitle();
    }
    
    public void setBookTitle(String title) {
        bookModel.setTitle(title);
    }
    
    public Author[] getBookAuthor() {
        return bookModel.getAuthor();
    }
    
    public void setBookAuthors(int i) {
        bookModel.setAuthor(i);
    }
    
    public double getBookPrice() {
        return bookModel.getPrice();
    }
    
    public void setBookPrice(double price) {
        bookModel.setPrice(price);
    }
    
    public int getBookQuantity() {
        return bookModel.getQuantity();
    }
    
    public void setBookQuantity(int quantity) {
        bookModel.setQuantity(quantity);
    }
    
    public long getBookISBN() {
        return bookModel.getISBN();
    }
    
    public void setBookISBN(long ISBNnumber) {
        bookModel.setISBN(ISBNnumber);
    }
    
    public int getBookYear() {
        return bookModel.description.getYear();
    }
    
    public void setBookYear(int year) {
        bookModel.description.setYear(year);
    }
    
    public String getBookDescription() {
        return bookModel.description.getDescription();
    }
    
    public void setBookDescription(String description) {
        bookModel.description.setDescription(description);
    }
    
    public String getBookLanguage() {
        return bookModel.description.getLanguage();
    }
    
    public String getBookPublisher() {
        return bookModel.description.getPublisher();
    }
    
    public void setBookPublisher(String publisher) {
        bookModel.description.setPublisher(publisher);
    }
    
    public String getBookAuthorName() {
        return bookModel.getAuthorName();
    } 
    
    public void setBookAuthorName(String name) {
        bookModel.setAuthorName(name);
    }
    
    public String getBookAuthorGender() {
        return bookModel.getAuthorGender();
    }
    
    public void setBookAuthorGender(String gender) {
        bookModel.setAuthorGender(gender);
    }
    
    public void updateBook() {
        bookView.printBookAuthors(bookModel.getTitle(), bookModel.getAuthor(), bookModel.getPrice(), bookModel.getQuantity(), bookModel.description, bookModel.getISBN());
    }
    
    private Book bookModel;
    private BookView bookView;
    //private Description bookDescription;
}