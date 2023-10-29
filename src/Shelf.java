import java.util.List;

public class Shelf <T extends LibraryResource>{

    List <T> libraryResources;

    Shelf(List<T> books) {
        this.libraryResources = books;
    }
    Shelf (){

    }
    /**
     * @param shelf Список с DVD/Book
     * */
    public void load (List<T> shelf){
        setLibraryResources(shelf);
    }

    @Override
    public String toString() {
        return "Shelf{" +
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
     * @param libraryResources Список с DVD/Book
     * */
    public void setLibraryResources(List<T> libraryResources) {
        this.libraryResources = libraryResources;
    }
}
