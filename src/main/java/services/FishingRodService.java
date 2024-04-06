package services;

import models.FishingReel;
import models.FishingRod;

import java.util.ArrayList;

public class FishingRodService {
    private static int nextId = 1; // (1)
    private ArrayList<FishingRod> inventory = new ArrayList<>(); // (2)

    // (1)
    public FishingRod create(String name, String brand, String sport, int Qty, float price) {
        FishingRod createdFishingRod = new FishingRod(nextId++, name, brand, sport, Qty, price);
        inventory.add(createdFishingRod);
        return createdFishingRod;
    }

    public FishingRod findFishingRod(int id) {
        for(FishingRod fishrod : inventory){
            if (id == fishrod.getId()){
                return fishrod;
            }
        }
        return null;
    }

    //read all
    public FishingRod[] findAll() {
        return inventory.toArray(new FishingRod[inventory.size()]);
    }

    //delete
    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
    }
}
