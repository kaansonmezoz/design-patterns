package com.kaansonmezoz.design.patterns.examples;

import com.kaansonmezoz.design.patterns.examples.builder.HouseBuilder;

public class House {
    private int areaInSquareMeters;
    private boolean hasGarage;
    private boolean hasGarden;
    private boolean hasSwimmingPool;
    private String wallPaintInRGB;
    private int age;
    private int price;

    public House(HouseBuilder builder){
        areaInSquareMeters = builder.getAreaInSquareMeters();
        hasGarage = builder.getHasGarage();
        hasGarden = builder.getHasGarden();
        hasSwimmingPool = builder.getHasSwimmingPool();
        wallPaintInRGB = builder.getWallPaintInRGB();
        age = builder.getAge();
        price = builder.getPrice();
    }

    public void setAreaInSquareMeters(int areaInSquareMeters) {
        this.areaInSquareMeters = areaInSquareMeters;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public void setWallPaintInRGB(String wallPaintInRGB) {
        this.wallPaintInRGB = wallPaintInRGB;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
