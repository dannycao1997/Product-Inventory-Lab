package services;


import models.FishingReel;
import models.FishingRod;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FishingRodServiceTest {
    @Test
    public void createTest() {

        String expectedName = "Best Fishing Rod Ever";
        String expectedBrand = "Danny's Fishing Company";
        String expectedSport = "Fishing";
        int expectedQty = 300;
        float expectedPrice = 150.00f;

        FishingRodService fishingRodService = new FishingRodService();
        FishingRod testFishingRod = fishingRodService.create(expectedName, expectedBrand, expectedSport, expectedQty, expectedPrice);

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

    @Test
    public void findFishingReelTest() {
        FishingRodService fishingRodService = new FishingRodService();
        FishingRod testFishingRod = fishingRodService.create("Best Fishing Rod Ever", "Danny's Fishing Company", "Fishing", 300, 150.00f);

        Object expected = null;
        Object expected2 = testFishingRod;

        Object actual = fishingRodService.findFishingRod(2);
        Object actual2 = fishingRodService.findFishingRod(1);

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    public void findAllTest() {
        FishingRodService fishingRodService = new FishingRodService();
        FishingRod testFishingRod = fishingRodService.create("Best Fishing Rod Ever", "Danny's Fishing Company", "Fishing", 300, 150.00f);
        FishingRod testFishingRod2 = fishingRodService.create("WORST ROD EVER ", "NOT Danny's Fishing Company", "CRABBING", 10, 10.00f);


        FishingRod[] expected = {testFishingRod, testFishingRod2};

        FishingRod[] actual = fishingRodService.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void deleteRodTest() {
        FishingRodService fishingRodService = new FishingRodService();
        FishingRod testFishingRod = fishingRodService.create("Best Fishing Rod Ever", "Danny's Fishing Company", "Fishing", 300, 150.00f);
        FishingRod testFishingRod2 = fishingRodService.create("WORST ROD EVER", "NOT Danny's Fishing Company", "CRABBING", 10, 10.00f);

        Boolean expected = true;
        Boolean expected2 = false;

        Boolean actual = fishingRodService.delete(1);
        Boolean actual2 = fishingRodService.delete(5);

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected2, actual2);
    }
}
