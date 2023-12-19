package service;

import model.LibraryResource;

import java.util.List;
import java.util.Optional;

public interface StorageInterface {
//    Optional<List<LibraryResource>> getByName();

    List<LibraryResource> search(String name);

    List<LibraryResource> search(Boolean status);

    List<LibraryResource> search(Integer id);

    List<LibraryResource> addDVD(String author, Boolean availabilityStatus);

    List<LibraryResource> addBook(String author, Boolean availabilityStatus);

    List<LibraryResource> deleteLibResByID(int id);
}
