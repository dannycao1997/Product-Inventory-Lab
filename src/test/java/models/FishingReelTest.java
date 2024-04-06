package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FishingReelTest {
    private FishingReel fishingReel;

    @Test
    public void setNameTest(){
        //given (1)
        String expected = "5000 Series Titanium Shark Reel";

        //when (2)
        fishingReel = new FishingReel();
        fishingReel.setName(expected);

        //then (3)
        Assertions.assertEquals(expected, fishingReel.getName());
    }

    @Test // (1)
    public void constructorTest(){

        // (2)
        int expectedID = 26;
        String expectedName  = "5000 Series Titanium Shark Reel";
        String expectedBrand = "Danny's Fishing Company";
        String expectedSport = "Fishing";
        int expectedQty = 1000;
        float expectedPrice = 200.00f;

        // (3)
        FishingReel fishingReel = new FishingReel(expectedID, expectedName, expectedBrand, expectedSport, expectedQty, expectedPrice);

        // (4)
        Assertions.assertEquals(expectedID, fishingReel.getID());
        Assertions.assertEquals(expectedName, fishingReel.getName());
        Assertions.assertEquals(expectedBrand, fishingReel.getBrand());
        Assertions.assertEquals(expectedSport, fishingReel.getSport());
        Assertions.assertEquals(expectedQty, fishingReel.getQty());
        Assertions.assertEquals(expectedPrice, fishingReel.getPrice());

    }
}
