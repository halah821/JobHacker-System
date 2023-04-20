//Book class which represents a book and contains the following attributes:
//book title, author name, book ID, book version, and book   availability status.

import java.util.Random;
import java.util.UUID;

public class Book {
    private String title;
   private String author_name;
   private String id;
   private Double version;
   private Boolean isAvailable=true;


    public Book(String title, String author_name, Double version) {
        this.title = title;
        this.author_name = author_name;

        Random randomNumber = new Random();
        Integer random =randomNumber.nextInt(1000);
        this.id = random.toString();
        this.version = version;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public String getId() {
        return id;
    }

    public Double getVersion() {
        return version;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public void setId(String id) {
        this.id= id;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }


    public String getDetails(){
        return this.toString();
    }
}
