package model;

/**
 * @see LibraryResource
 * @author Nikita
 * @since 1.0
 * */
public class DVD extends LibraryResource{
    @Override
    public String read(){
        return "read model.DVD";
    }


    public DVD(){
        id = -1;
        author = "Unknown";
        availabilityStatus = false;
    }

    /**
     * @param id id
     * @param author автор
     * @param availabilityStatus статус долж.
     * */
    public DVD(int id, String author, boolean availabilityStatus){
        this.id = id;
        this.author = author;
        this.availabilityStatus = availabilityStatus;
    }

    @Override
    public String toString() {
        return "model.DVD{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", availabilityStatus=" + availabilityStatus +
                '}';
    }
}


