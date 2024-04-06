package services;

import models.FishingRod;

import java.util.ArrayList;

public class FishingRodService {
    private static int nextID = 1; // (1)
    private ArrayList<FishingRod> inventory = new ArrayList<>(); // (2)

    // (1)
    public FishingRod create(String name, String brand, String sport, int quantity, float price) {

        // (2)
        FishingRod createdFishingRod = new FishingRod(nextId++, name, brand, sport, quantity, price);

        // (3)
        inventory.add(createdFishingRod);

        // (4)
        return createdFishingRod;
    }


}
