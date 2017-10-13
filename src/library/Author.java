
package library;

/**
 *
 * @author Paul
 */
public class Author {
    
    public Author() {
        System.out.println("You have to set a name and a gender for this author.");
    }
    
    public Author(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String printAuthor() {
        return name + ", by gender a " + gender + ".";
    }
    
    @Override
    public String toString() {
        return name + ", gender - " + gender + ".";
    }
    
    private String name;
    private String gender;
}
