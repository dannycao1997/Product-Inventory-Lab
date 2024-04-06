package services;

import models.FishingReel;
import models.FishingRod;

import java.util.ArrayList;

public class FishingRodService {
    private static Integer nextId = 1;
    private ArrayList<FishingRod> inventory = new ArrayList<>();

    // (1)
    public FishingRod create(int id, String name, String brand, String sport, int Qty, float price) {
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

    public FishingRod[] findAll() {
        FishingRod[] rodarray = new FishingRod[inventory.size()];
        return inventory.toArray(rodarray);
    }

    public boolean delete(Integer id) {
        for (FishingRod fishrod : inventory){
            if (id.equals(fishrod.getId())){
                inventory.remove(fishrod);
                return true;
            }
        }
        return false;
    }
}
