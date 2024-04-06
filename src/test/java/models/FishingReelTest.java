package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FishingReelTest {
    private FishingReel fishingReel;

    @Test
    public void setIdTest(){
        int expected = 26;

        fishingReel = new FishingReel();
        fishingReel.setId(expected);

        Assertions.assertEquals(expected, fishingReel.getId());
    }

    @Test
    public void setNameTest(){
        String expected = "5000 Series Titanium Shark Reel";

        fishingReel = new FishingReel();
        fishingReel.setName(expected);

        Assertions.assertEquals(expected, fishingReel.getName());
    }

    @Test
    public void setBrandTest(){
        String expected = "Danny's Fishing Company";

        fishingReel = new FishingReel();
        fishingReel.setBrand(expected);

        Assertions.assertEquals(expected, fishingReel.getBrand());
    }

    @Test
    public void setSportTest(){
        String expected = "Fishing";

        fishingReel = new FishingReel();
        fishingReel.setSport(expected);

        Assertions.assertEquals(expected, fishingReel.getSport());
    }

    @Test
    public void setQtyTest(){
        int expected = 1000;

        fishingReel = new FishingReel();
        fishingReel.setQty(expected);

        Assertions.assertEquals(expected, fishingReel.getQty());
    }

    @Test
    public void setPriceTest(){
        float expected = 200.00f;

        fishingReel = new FishingReel();
        fishingReel.setPrice(expected);

        Assertions.assertEquals(expected, fishingReel.getPrice());
    }


    @Test
    public void constructorTest(){

        int expectedId = 26;
        String expectedName  = "5000 Series Titanium Shark Reel";
        String expectedBrand = "Danny's Fishing Company";
        String expectedSport = "Fishing";
        int expectedQty = 1000;
        float expectedPrice = 200.00f;

        FishingReel fishingReel = new FishingReel(expectedId, expectedName, expectedBrand, expectedSport, expectedQty, expectedPrice);

        Assertions.assertEquals(expectedId, fishingReel.getId());
        Assertions.assertEquals(expectedName, fishingReel.getName());
        Assertions.assertEquals(expectedBrand, fishingReel.getBrand());
        Assertions.assertEquals(expectedSport, fishingReel.getSport());
        Assertions.assertEquals(expectedQty, fishingReel.getQty());
        Assertions.assertEquals(expectedPrice, fishingReel.getPrice());

    }
}
