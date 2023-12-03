package model;

/**
 * @see LibraryResource
 * @author Nikita
 * @since 1.0
 * */
public class Book extends LibraryResource{
    @Override
    public String read(){
        return "read model.Book";
    }

    public Book(){
        id = 0;
        author = "Unknown";
        availabilityStatus = false;
    }

    /**
     * @param id id
     * @param author автор
     * @param availabilityStatus статус долж.
     * */
    public Book(int id, String author, boolean availabilityStatus){
        this.id = id;
        this.author = author;
        this.availabilityStatus = availabilityStatus;
    }

    @Override
    public String toString() {
        return "model.Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", availabilityStatus=" + availabilityStatus +
                '}';
    }
}