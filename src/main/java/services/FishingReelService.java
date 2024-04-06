package services;

import models.FishingReel;
import models.FishingRod;

import java.util.ArrayList;

public class FishingReelService {
    private static int nextID = 1; // (1)
    private ArrayList<FishingReel> inventory = new ArrayList<>(); // (2)
}
