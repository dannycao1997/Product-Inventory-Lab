package services;


import models.FishingRod;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FishingRodServiceTest {
    @Test
    public void createTest() {

        int expectedId = 22;
        String expectedName = "Best Fishing Rod Ever";
        String expectedBrand = "Danny's Fishing Company";
        String expectedSport = "fishing";
        int expectedQty = 300;
        float expectedPrice = 150.00f;

        FishingRodService fishingRodService = new FishingRodService();
        FishingRod testFishingRod = FishingRodService.create(expectedId, expectedName, expectedBrand, expectedSport, expectedQty, expectedPrice);

        int actualId = testFishingRod.getId();
        String actualName = testFishingRod.getName();
        String actualBrand = testFishingRod.getBrand();
        String actualSport = testFishingRod.getSport();
        int actualQty = testFishingRod.getQty();
        float actualPrice = testFishingRod.getPrice();

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSport, actualSport);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }
}
