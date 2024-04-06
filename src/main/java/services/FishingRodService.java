package services;

import models.FishingRod;

import java.util.ArrayList;

public class FishingRodService {
    private static int nextID = 1; // (1)
    private ArrayList<FishingRod> inventory = new ArrayList<>(); // (2)
}
