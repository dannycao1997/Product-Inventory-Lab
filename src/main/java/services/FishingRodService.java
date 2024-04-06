package services;

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
}
