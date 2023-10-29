/**
 * @see LibraryResource
 * @author Nikita
 * @since 1.0
 * */
class Book extends LibraryResource{
    @Override
    public String read(){
        return "read Book";
    }

    public Book(){
        id = 0;
        author = "Unknown";
        availabilityStatus = false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", availabilityStatus=" + availabilityStatus +
                '}';
    }
}