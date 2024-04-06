package models;

public class FishingReel {
    private int id;
    private String name;
    private String brand;
    private String sport;
    private int size;
    private int qty;
    private float price;

    public FishingReel() {
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
