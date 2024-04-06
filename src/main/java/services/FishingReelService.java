package services;

import models.FishingReel;
import models.FishingRod;

import java.util.ArrayList;

public class FishingReelService {
    private static Integer nextId = 1;
    private static ArrayList<FishingReel> inventory = new ArrayList<>();
    public FishingReel create(String name, String brand, String sport, int Qty, float price) {
        FishingReel createdFishingReel = new FishingReel(nextId++, name, brand, sport, Qty, price);
        inventory.add(createdFishingReel);
        return createdFishingReel;
    }
    
    //read
    public FishingReel findFishingReel(int id) {
        // should take an int and return an object with that id, if exists
        for(FishingReel fishreel : inventory){
            if (fishreel.getId() == id){
                return fishreel;
            }
        }
        return null;
    }

    //read all
    public FishingReel[] findAll() {
        // should return a basic array copy of the ArrayList
        return inventory.toArray(new FishingReel[0]);
    }

    //delete
    public boolean delete(Integer id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
        for (FishingReel fishreel : inventory){
            if (fishreel.getId() == id){
                inventory.remove(fishreel);
                return true;
            }
        }
        return false;
    }
}
