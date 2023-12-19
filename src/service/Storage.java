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

public class Storage implements StorageInterface {
    private Shelf<LibraryResource> firstShelf;
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();

    //TODO springtool dev tool, spring web, config..., thymeleaf, //for db: spring data j2, h2 database

    public Storage(){
        firstShelf = new Shelf<>(new ArrayList<>(List.of(
                new DVD(100, "Aus", true),
                new Book(101, "Aos", false),
                new Book(102, "Ais", true))));
    }

     @Override
     public List<LibraryResource> search(String name) {
//         List<LibraryResource> helpList = new ArrayList<>();
         //TODO: сделать ну как тут
         var future = executorService.submit(()->firstShelf.getLibraryResources()
                 .stream().filter(x->x.getAuthor().equals(name)).toList());
         if (future.state()==Future.State.SUCCESS){
             return future.resultNow();
         }else{
             var sh = new ArrayList<LibraryResource>();
             return sh;
         }
     }

     @Override
     public List<LibraryResource> search(Boolean status) {
         var future = executorService.submit(()->firstShelf.getLibraryResources()
                 .stream().filter(x->x.isAvailabilityStatus().equals(status)).toList());
         if (future.state()==Future.State.SUCCESS){
             return future.resultNow();
         }else{
             var sh = new ArrayList<LibraryResource>();
             return sh;
         }
     }

     @Override
     public List<LibraryResource> search(Integer id) {
         var future = executorService.submit(()->firstShelf.getLibraryResources()
                 .stream().filter(x->x.getId().equals(id)).toList());
         if (future.state()==Future.State.SUCCESS){
             return future.resultNow();
         }else{
             var sh = new ArrayList<LibraryResource>();
             return sh;
         }

     }

    @Override
    public List<LibraryResource> addDVD(String author, Boolean availabilityStatus){
        System.out.println(1);
        int id = firstShelf.getLibraryResources().get(firstShelf.getLibraryResources().size()-1).getId()+1;
        System.out.println(2);
        LibraryResource d = new Book(id, author, availabilityStatus);
        System.out.println(3);
        firstShelf.add(d);
        System.out.println(4);
        return firstShelf.getLibraryResources();
    }

    @Override
    public List<LibraryResource> addBook(String author, Boolean availabilityStatus){
        int id = firstShelf.getLibraryResources().get(firstShelf.getLibraryResources().size()-1).getId()+1;
        firstShelf.getLibraryResources().add(new DVD(id, author, availabilityStatus));
        return firstShelf.getLibraryResources();
    }
    @Override
    public List<LibraryResource> deleteLibResByID(int id){
        var future = executorService.submit(()->firstShelf.getLibraryResources()
                .stream().filter(x->x.getId().equals(id)).findAny());
        if (future.state()==Future.State.SUCCESS){
            firstShelf.getLibraryResources().remove(future.resultNow());
        }
        return firstShelf.getLibraryResources();
    }

}
