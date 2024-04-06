package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FishingRodTest {
    private FishingRod fishingRod;
    @Test
    public void setNameTest(){
        //given (1)
        String expected = "5000 Series Titanium Shark Reel";

        //when (2)
        fishingRod = new FishingRod();
        fishingRod.setName(expected);

        //then (3)
        Assertions.assertEquals(expected, fishingRod.getName());
    }

    @Test // (1)
    public void constructorTest(){

        // (2)
        int expectedID = 99;
        String expectedName  = "Carbon Fiber Surf Rod";
        String expectedBrand = "Danny's Fishing Company";
        String expectedSport = "Fishing";
        int expectedQty = 5000;
        float expectedPrice = 150.00f;

        // (3)
        FishingRod fishingRod = new FishingRod(expectedID, expectedName, expectedBrand, expectedSport, expectedQty, expectedPrice);

        // (4)
        Assertions.assertEquals(expectedID, fishingRod.getID());
        Assertions.assertEquals(expectedName, fishingRod.getName());
        Assertions.assertEquals(expectedBrand, fishingRod.getBrand());
        Assertions.assertEquals(expectedSport, fishingRod.getSport());
        Assertions.assertEquals(expectedQty, fishingRod.getQty());
        Assertions.assertEquals(expectedPrice, fishingRod.getPrice());

    }
}