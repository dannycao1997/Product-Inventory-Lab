package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FishingRodTest {
    private FishingRod fishingRod;

    @Test
    public void setIdTest(){
        int expected = 99;

        fishingRod = new FishingRod();
        fishingRod.setId(expected);

        Assertions.assertEquals(expected, fishingRod.getId());
    }
    @Test
    public void setNameTest(){
        String expected = "5000 Series Titanium Shark Reel";

        fishingRod = new FishingRod();
        fishingRod.setName(expected);

        Assertions.assertEquals(expected, fishingRod.getName());
    }

    @Test
    public void setBrandTest(){
        String expected = "Danny's Fishing Company";

        fishingRod = new FishingRod();
        fishingRod.setBrand(expected);

        Assertions.assertEquals(expected, fishingRod.getBrand());
    }

    @Test
    public void setSportTest(){
        String expected = "Fishing";

        fishingRod = new FishingRod();
        fishingRod.setSport(expected);

        Assertions.assertEquals(expected, fishingRod.getSport());
    }

    @Test
    public void setQtyTest(){
        int expected = 500;

        fishingRod = new FishingRod();
        fishingRod.setQty(expected);

        Assertions.assertEquals(expected, fishingRod.getQty());
    }

    @Test
    public void setPriceTest(){
        float expected = 200.00f;

        fishingRod = new FishingRod();
        fishingRod.setPrice(expected);

        Assertions.assertEquals(expected, fishingRod.getPrice());
    }

    @Test
    public void constructorTest(){

        int expectedId = 99;
        String expectedName  = "Carbon Fiber Surf Rod";
        String expectedBrand = "Danny's Fishing Company";
        String expectedSport = "Fishing";
        int expectedQty = 5000;
        float expectedPrice = 150.00f;

        FishingRod fishingRod = new FishingRod(expectedId, expectedName, expectedBrand, expectedSport, expectedQty, expectedPrice);

        Assertions.assertEquals(expectedId, fishingRod.getId());
        Assertions.assertEquals(expectedName, fishingRod.getName());
        Assertions.assertEquals(expectedBrand, fishingRod.getBrand());
        Assertions.assertEquals(expectedSport, fishingRod.getSport());
        Assertions.assertEquals(expectedQty, fishingRod.getQty());
        Assertions.assertEquals(expectedPrice, fishingRod.getPrice());

    }
}