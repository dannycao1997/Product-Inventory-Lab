package services;

import models.FishingReel;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FishingReelServiceTest {
    @Test
    public void createTest() {

        String expectedName = "Reel Deal";
        String expectedBrand = "Danny's Fishing Company";
        String expectedSport = "Fishing";
        int expectedQty = 1000;
        float expectedPrice = 100.00f;

        FishingReelService fishingReelService = new FishingReelService();
        FishingReel testFishingReel = fishingReelService.create(expectedName, expectedBrand, expectedSport, expectedQty, expectedPrice);

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
    public void findFishingReelTest() {
        FishingReelService fishingReelService = new FishingReelService();
        FishingReel testFishingReel = fishingReelService.create("Reel Deal", "Danny's Fishing Company", "Fishing", 1000, 100.00f);
        Object expected = null;
        Object expected2 = testFishingReel;

        Object actual = fishingReelService.findFishingReel(2);
        Object actual2 = fishingReelService.findFishingReel(1);

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    public void findAllTest() {
        FishingReelService fishingReelService = new FishingReelService();
        FishingReel testFishingReel = fishingReelService.create("Reel Deal", "Danny's Fishing Company", "Fishing", 1000, 100.00f);
        FishingReel testFishingReel2 = fishingReelService.create("Reelly Kewl Reel", "Dick's Sporting Goods", "Fishing", 100, 50.00f);


        FishingReel[] expected = {testFishingReel, testFishingReel2};

        FishingReel[] actual = fishingReelService.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void deleteReelTest() {
        FishingReelService fishingReelService = new FishingReelService();
        FishingReel testFishingReel = fishingReelService.create("Reel Deal", "Danny's Fishing Company", "Fishing", 1000, 100.00f);
        FishingReel testFishingReel2 = fishingReelService.create("Reelly Kewl Reel", "Dick's Sporting Goods", "Fishing", 100, 50.00f);

        Boolean expected = true;
        Boolean expected2 = false;

        Boolean actual = fishingReelService.delete(1);
        Boolean actual2 = fishingReelService.delete(5);

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected2, actual2);
    }
}