package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FishingReelTest {
    FishingReel fishingReel;
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
}
