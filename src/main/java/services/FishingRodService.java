package services;

import models.FishingReel;
import models.FishingRod;

import java.util.ArrayList;

public class FishingRodService {
    private static Integer nextId = 1;
    private ArrayList<FishingRod> inventory = new ArrayList<>();
    public FishingRod create(String name, String brand, String sport, int Qty, float price) {
        FishingRod createdFishingRod = new FishingRod(nextId++, name, brand, sport, Qty, price);
        inventory.add(createdFishingRod);
        return createdFishingRod;
    }

    public FishingRod findFishingRod(int id) {
        for(FishingRod fishrod : inventory){
            if (fishrod.getId() == id){
                return fishrod;
            }
        }
        return null;
    }

    public FishingRod[] findAll() {
        return inventory.toArray(new FishingRod[0]);
    }

    public boolean delete(Integer id) {
        for (FishingRod fishrod : inventory){
            if (fishrod.getId() == id){
                inventory.remove(fishrod);
                return true;
            }
        }
        return false;
    }
}
