package service;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class Storage {
    private Shelf<LibraryResource> firstShelf;

    private final ExecutorService executorService = Executors.newSingleThreadExecutor();
    private final Optional<List<LibraryResource>> getByName(){
        var future = executorService.submit(
                ()->firstShelf.getLibraryResources().stream().filter(
                        p->p.getAuthor().equals("name")).toList());
        executorService.shutdown();
        while (future.state()== Future.State.RUNNING){

        }
        if(future.state()==Future.State.SUCCESS){
//            return future.resultNow();
        }else{
//            return
        }
        //TODO: интерфейсы service и controller + в кучной реализации сделать потоки
        return null;
    }

    public Storage(){
        firstShelf = new Shelf<>(new ArrayList<>(List.of(
                new DVD(100, "Aus", true),
                new Book(101, "Aos", false),
                new Book(102, "Ais", true))));
    }

     public List<LibraryResource> search(String name) {
         List<LibraryResource> helpList = new ArrayList<>();
         //TODO: сделать ну как тут
         //return firstShelf.getLibraryResources().stream().filter(p->p.getAuthor().equals(name)).toList();
         //executorService.submit();
         for (var u : firstShelf.getLibraryResources()) {
            if (u.getAuthor().equals(name)){
                helpList.add(u);
            }
        }
         return helpList;
     }

     public List<LibraryResource> search(boolean status) {
         List<LibraryResource> helpList = new ArrayList<>();
         for (var u : firstShelf.getLibraryResources()) {
            if (u.isAvailabilityStatus() == status) {
                helpList.add(u);
            }
        }
        return helpList;
     }

     public List<LibraryResource> search(int id) {
         List<LibraryResource> helpList = new ArrayList<>();
         for (var u : firstShelf.getLibraryResources()) {
            if (u.getId() == id) {
                helpList.add(u);
            }
        }
        return helpList;
     }

    public List<LibraryResource> addDVD(String author, boolean availabilityStatus){
        System.out.println(1);
        int id = firstShelf.getLibraryResources().get(firstShelf.getLibraryResources().size()-1).getId()+1;
        System.out.println(2);
        LibraryResource d = new Book(id, author, availabilityStatus);
        System.out.println(3);
        firstShelf.add(d);
        System.out.println(4);
        return firstShelf.getLibraryResources();
    }

    public List<LibraryResource> addBook(String author, boolean availabilityStatus){
        int id = firstShelf.getLibraryResources().get(firstShelf.getLibraryResources().size()-1).getId()+1;
        firstShelf.getLibraryResources().add(new DVD(id, author, availabilityStatus));
        return firstShelf.getLibraryResources();
    }
    public List<LibraryResource> deleteLibResByID(int id){
        for (var u : firstShelf.getLibraryResources()) {
            if (u.getId() == id) {
                firstShelf.getLibraryResources().remove(u);
            }
        }
        return firstShelf.getLibraryResources();
    }

}
