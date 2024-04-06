package services;

import models.FishingReel;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FishingReelServiceTest {
    @Test
    public void createTest() {

        int expectedId = 26;
        String expectedName = "Reel Deal";
        String expectedBrand = "Danny's Fishing Company";
        String expectedSport = "Fishing";
        int expectedQty = 1000;
        float expectedPrice = 100.00f;

        FishingReelService fishingReelService = new FishingReelService();
        FishingReel testFishingReel = fishingReelService.create(expectedId, expectedName, expectedBrand, expectedSport, expectedQty, expectedPrice);

        int actualId = testFishingReel.getId();
        String actualName = testFishingReel.getName();
        String actualBrand = testFishingReel.getBrand();
        String actualSport = testFishingReel.getSport();
        int actualQty = testFishingReel.getQty();
        float actualPrice = testFishingReel.getPrice();

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSport, actualSport);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }
    @Test
    public void findFishingReelTest(){
    }

    @Test
    public void findAllReelTest(){
    }

    @Test
    public void deleteReelTest(){
    }
}


