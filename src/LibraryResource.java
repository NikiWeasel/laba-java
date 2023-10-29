/**
 * @see Object
 * @author Nikita
 * @since 1.0
 * */
abstract class LibraryResource{
    int id;
    String author;
    boolean availabilityStatus = true;

    @Override
    public String toString(){
        return this.id +" "+ this.author;
    }
    @Override
    public boolean equals(Object other){
        return other instanceof LibraryResource;
    }

    /**
     * @return  *Читает*
     * */
    public String read(){
        return "read yay";
    }

    /**
     * @return  ID ресурса
     * */
    public int getId() {
        return id;
    }

    /**
     * @return  Автор
     * */
    public String getAuthor() {
        return author;
    }

    /**
     * @return  Статус доступности
     * */
    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    /**
     * @param id_ ID ресурса
     * */
    public void setId(int id_) {
        id = id_;
    }
    /**
     * @param author_ Автор
     * */
    public void setAuthor(String author_) {
        author = author_;
    }

    /**
     * @param availabilityStatus_ Статус доступности
     * */
    public void setAvailabilityStatus(boolean availabilityStatus_) {
        availabilityStatus = availabilityStatus_;
    }
}
