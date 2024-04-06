package services;

import models.FishingReel;
import models.FishingRod;

import java.util.ArrayList;

public class FishingReelService {
    private static int nextID = 1; // (1)
    private ArrayList<FishingReel> inventory = new ArrayList<>(); // (2)

    // (1)
    public FishingReel create(String name, String brand, String sport, int quantity, float price) {

        // (2)
        FishingRod createdFishingReel = new FishingReel(nextId++, name, brand, sport, quantity, price);

        // (3)
        inventory.add(createdFishingReel);

        // (4)
        return createdFishingReel;
    }
}
