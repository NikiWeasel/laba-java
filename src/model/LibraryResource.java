package model;

/**
 * @see Object
 * @author Nikita
 * @since 1.0
 * */
public abstract class LibraryResource{
    protected Integer id;
    protected String author;
    protected Boolean availabilityStatus = true;

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
    public abstract String read();

    /**
     * @return  ID ресурса
     * */
    public Integer getId() {
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
    public Boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    /**
     * @param id_ ID ресурса
     * */
    public void setId(Integer id_) {
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
    public void setAvailabilityStatus(Boolean availabilityStatus_) {
        availabilityStatus = availabilityStatus_;
    }
}
