package controller;

import model.Book;
import model.LibraryResource;
import service.Storage;

import java.util.List;
import java.util.Scanner;

public class StorageController {
    private final Storage storage;
    public StorageController(Storage storage){
        this.storage = storage;
    }

    public List<LibraryResource> searchByName(String author){
    return storage.search(author);
    }
    public List<LibraryResource> searchByStatus(boolean status){
        return storage.search(status);
    }
    public List<LibraryResource> searchByID(int id){
        return storage.search(id);
    }
    public List<LibraryResource> deleteByID(int id){return storage.deleteLibResByID(id);}
    public List<LibraryResource> addDVD(String author, boolean availabilityStatus){
        return storage.addDVD(author, availabilityStatus);}
    public List<LibraryResource> addBook(String author, boolean availabilityStatus){
        return storage.addBook(author, availabilityStatus);}


    public void dialog(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("search <id/author/avail>\nadd DVD/Book\ndelete");
        while (true){
            var str = scanner.nextLine();
            switch (str){
                case "search id":
                    int str1 = scanner.nextInt();
                    System.out.println(searchByID(str1));
                    break;
                case "search author":
                    String str2 = scanner.nextLine();
                    System.out.println(searchByName(str2));
                    break;
                case "search avail":
                    boolean str3 = scanner.nextBoolean();
                    System.out.println(searchByStatus(str3));
                    break;
                case "delete":
                    int str4 = scanner.nextInt();
                    System.out.println(deleteByID(str4));
                    break;
                case "add DVD":
                    String str5 = scanner.nextLine();
                    boolean str6 = scanner.nextBoolean();
                    System.out.println(addDVD(str5, str6));
                    break;
                case "add Book":
                    String str7 = scanner.nextLine();
                    boolean str8 = scanner.nextBoolean();
                    System.out.println(addBook(str7, str8));
                    break;
                default:
                    System.out.println("Unknown command.");
            }
        }
    }
}
