package model;

import java.util.List;

public class Shelf <T extends LibraryResource>{

    protected List <T> libraryResources;

    public Shelf(List<T> books) {
        this.libraryResources = books;
    }
    public Shelf (){

    }
    /**
     * @param shelf Список с model.DVD/model.Book
     * */
    public void load (List<T> shelf){
        setLibraryResources(shelf);
    }
    public void add(T entity){
        libraryResources.add(entity);
    };

//    public void add (T e){libraryResources.add(e);}

    @Override
    public String toString() {
        return "model.Shelf{" +
                "LibraryResources=" + libraryResources.toString() +
                '}';
    }

    /**
     * @return Поля ресурсов библеотеки
     * */
    public List<T> getLibraryResources() {
        return libraryResources;
    }

    /**
     * @param libraryResources Список с model.DVD/model.Book
     * */
    public void setLibraryResources(List<T> libraryResources) {
        this.libraryResources = libraryResources;
    }
}
