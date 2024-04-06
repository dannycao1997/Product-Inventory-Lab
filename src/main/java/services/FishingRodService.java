package services;

import models.FishingReel;
import models.FishingRod;

import java.util.ArrayList;

public class FishingRodService {
    private static Integer nextId = 1;
    private static ArrayList<FishingRod> inventory = new ArrayList<>();
    public FishingRod create(String name, String brand, String sport, int Qty, float price) {
        FishingRod createdFishingRod = new FishingRod(nextId++, name, brand, sport, Qty, price);
        inventory.add(createdFishingRod);
        return createdFishingRod;
    }

    //read
    public FishingRod findFishingRod(int id) {
        // should take an int and return an object with that id, if exists
        for(FishingRod fishrod : inventory){
            if (fishrod.getId() == id){
                return fishrod;
            }
        }
        return null;
    }

    //read all
    public FishingRod[] findAll() {
        // should return a basic array copy of the ArrayList
        return inventory.toArray(new FishingRod[0]);
    }

    //delete
    public boolean delete(Integer id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
        for (FishingRod fishrod : inventory){
            if (fishrod.getId() == id){
                inventory.remove(fishrod);
                return true;
            }
        }
        return false;
    }
}
