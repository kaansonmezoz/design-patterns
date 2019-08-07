package com.kaansonmezoz.design.patterns.examples.builder;

import com.kaansonmezoz.design.patterns.examples.House;

public class HouseBuilder {
    private int areaInSquareMeters = 120;
    private boolean hasGarage = true;
    private boolean hasGarden = false;
    private boolean hasSwimmingPool = false;
    private String wallPaintInRGB = "#000";
    private int age = 0;
    private int price = 120000;

    public HouseBuilder(){

    }

    public HouseBuilder areaInSquareMeters(int areaInSquareMeters){
        this.areaInSquareMeters = areaInSquareMeters;
        return this;
    }

    public HouseBuilder hasGarage(boolean hasGarage){
        this.hasGarage(hasGarage);
        return this;
    }

    public HouseBuilder hasGarden(boolean hasGarden){
        this.hasGarden = hasGarden;
        return this;
    }

    public HouseBuilder hasSwimmingPool(boolean hasSwimmingPool){
        this.hasSwimmingPool = hasSwimmingPool;
        return this;
    }

    public HouseBuilder wallPaintInRGB(String wallPaintInRGB){
        this.wallPaintInRGB = wallPaintInRGB;
        return this;
    }

    public HouseBuilder age(int age){
        this.age = age;
        return this;
    }

    public HouseBuilder price(int price){
        this.price = price;
        return this;
    }

    public House build(){
        return new House(this);
    }

    public int getAreaInSquareMeters() {
        return areaInSquareMeters;
    }

    public boolean getHasGarage() {
        return hasGarage;
    }

    public boolean getHasGarden() {
        return hasGarden;
    }

    public boolean getHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public String getWallPaintInRGB() {
        return wallPaintInRGB;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }
}
