import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Librarian alo = new Librarian();
        Librarian alo1 = new Librarian("ff", "","2018-05-05", 3);
        Client aa = new Client();
        Object obj = new Object();
        System.out.println(alo1.toString());
        System.out.println(alo1.getName());

        Shelf<LibraryResource> firstShelf = new Shelf<LibraryResource>();
        firstShelf.load(List.of(new DVD(), new Book()));

        System.out.println(firstShelf.getLibraryResources());


        //        System.out.println(alo.equals(firstShelf.toString()));
    }
}