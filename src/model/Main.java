package model;

import controller.StorageController;
import model.*;
import service.Storage;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        try{
            new StorageController(new Storage()).dialog();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}