package controller;

import model.LibraryResource;

import java.util.List;

public interface StorageControllerInterface {
    List<LibraryResource> searchByName(String author);

    List<LibraryResource> searchByStatus(boolean status);

    List<LibraryResource> searchByID(Integer id);

    List<LibraryResource> deleteByID(int id);

    List<LibraryResource> addDVD(String author, boolean availabilityStatus);

    List<LibraryResource> addBook(String author, boolean availabilityStatus);

    void dialog();
}
