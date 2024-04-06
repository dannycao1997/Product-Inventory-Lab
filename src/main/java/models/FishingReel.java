package models;

public class FishingReel {
    private int id;
    private String name;
    private String brand;
    private String sport;
    private int qty;
    private float price;

    public FishingReel(){
        this(26, "5000 Series Titanium Shark Reel", "Danny's Fishing Company", "Fishing", 1000, 200.00f);
    }
    public FishingReel(int id, String name, String brand, String sport, int qty, float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.sport = sport;
        this.qty = qty;
        this.price = price;
    }

    public int getID() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
