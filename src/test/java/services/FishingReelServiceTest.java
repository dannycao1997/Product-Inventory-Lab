package services;

import models.FishingReel;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FishingReelServiceTest {
    @Test
    public void createTest() {

        // (1)
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (2)
        FishingReelService fishingReelService= new FishingReelService();
        FishingReel testFishingReel = FishingReelService.create(expectedName, expectedBrand, expectedSport, expectedQty, expectedPrice);

        // (3)
        int actualId = fishingReelService.getID();
        String actualName = fishingReelService.getName();
        String actualBrand = fishingReelService.getBrand();
        String actualSport = fishingReelService.getSport();
        int actualQty = fishingReelService.getQuantity();
        float actualPrice = fishingReelService.getPrice();

        // (4)
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSport, actualSport);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }
}


