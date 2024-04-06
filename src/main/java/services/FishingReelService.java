package services;

import models.FishingReel;
import models.FishingRod;

import java.util.ArrayList;

public class FishingReelService {
    private static Integer nextId = 1;
    private ArrayList<FishingReel> inventory = new ArrayList<>();
    public FishingReel create(String name, String brand, String sport, int Qty, float price) {
        FishingReel createdFishingReel = new FishingReel(nextId++, name, brand, sport, Qty, price);
        inventory.add(createdFishingReel);
        return createdFishingReel;
    }

    public FishingReel findFishingReel(int id) {
        for(FishingReel fishreel : inventory){
            if (fishreel.getId() == id){
                return fishreel;
            }
        }
        return null;
    }

    public FishingReel[] findAll() {
        return inventory.toArray(new FishingReel[0]);
    }

    public boolean delete(Integer id) {
        for (FishingReel fishreel : inventory){
            if (fishreel.getId() == id){
                inventory.remove(fishreel);
                return true;
            }
        }
        return false;
    }
}
