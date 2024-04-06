package services;

import models.FishingReel;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FishingReelServiceTest {
    @Test
    public void createTest() {

        // (1)
        String expectedName = "Reel Deal";
        String expectedBrand = "Danny's Fishing Company";
        String expectedSport = "Fishing";
        int expectedQty = 1000;
        float expectedPrice = 100.00f;

        // (2)
        FishingReelService fishingReelService = new FishingReelService();
        FishingReel testFishingReel = FishingReelService.create(expectedName, expectedBrand, expectedSport, expectedQty, expectedPrice);

        // (3)
        int actualId = fishingReelService.getId();
        String actualName = fishingReelService.getName();
        String actualBrand = fishingReelService.getBrand();
        String actualSport = fishingReelService.getSport();
        int actualQty = fishingReelService.getQty();
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


