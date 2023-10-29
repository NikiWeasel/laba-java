/**
 * @see LibraryResource
 * @author Nikita
 * @since 1.0
 * */
class DVD extends LibraryResource{
    @Override
    public String read(){
        return "read DVD";
    }


    DVD(){
        id = -1;
        author = "Unknown";
        availabilityStatus = false;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", availabilityStatus=" + availabilityStatus +
                '}';
    }
}


