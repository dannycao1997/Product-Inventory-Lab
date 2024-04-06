package services;


import models.FishingRod;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FishingRodServiceTest {
    @Test
    public void createTest() {

        // (1)
        String expectedName = "Best Fishing Rod Ever";
        String expectedBrand = "Danny's Fishing Company";
        String expectedSport = "fishing";
        int expectedQty = 300;
        float expectedPrice = 150.00f;

        // (2)
        FishingRodService fishingRodService = new FishingRodService();
        FishingRod testFishingRod = FishingReelService.create(expectedName, expectedBrand, expectedSport, expectedQty, expectedPrice);

        // (3)
        int actualId = fishingRodService.getId();
        String actualName = fishingRodService.getName();
        String actualBrand = fishingRodService.getBrand();
        String actualSport = fishingRodService.getSport();
        int actualQty = fishingRodService.getQty();
        float actualPrice = fishingRodService.getPrice();

        // (4)
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSport, actualSport);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }
}
