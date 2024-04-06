package services;

import models.FishingReel;
import models.FishingRod;

import java.util.ArrayList;

public class FishingReelService {
    private static int nextId = 1; // (1)
    private ArrayList<FishingReel> inventory = new ArrayList<>(); // (2)

    // (1)
    public FishingReel create(String name, String brand, String sport, int Qty, float price) {
        FishingReel createdFishingReel = new FishingReel(nextId++, name, brand, sport, Qty, price);
        inventory.add(createdFishingReel);
        return createdFishingReel;
    }
    //read
    public FishingReel findFishingReel(int id) {
        for(FishingReel fishreel : inventory){
            if (id == fishreel.getId()){
                return fishreel;
            }
        }
        return null;
    }

    //read all
    public FishingReel[] findAll() {
        return inventory.toArray(new FishingReel[inventory.size()]);
    }

    //delete
    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
    }
}
