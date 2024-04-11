package io;

import services.FishingReelService;
import services.FishingRodService;

public class App {

    private FishingReelService reelService = new FishingReelService(); // (1)
    private FishingRodService rodService = new FishingRodService();

    public static void main(String... args){
        App application = new App(); // (2)
        application.init();  // (3)
    }

    public void init(){
        // (4)
        // application logic here
        // call methods to take user input and interface with services
        Console.mainMenu();
        Console.printWelcome(); //
    }
}