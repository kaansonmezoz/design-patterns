package com.kaansonmezoz.design.patterns.examples.builder;

import com.kaansonmezoz.design.patterns.examples.House;

public class HouseBuilder {
    private House house;

    public HouseBuilder(){
        house = new House();
    }

    public HouseBuilder areaInSquareMeters(int areaInSquareMeters){
        house.setAreaInSquareMeters(areaInSquareMeters);
        return this;
    }

    public HouseBuilder hasGarage(boolean hasGarage){
        house.setHasGarage(hasGarage);
        return this;
    }

    public HouseBuilder hasGarden(boolean hasGarden){
        house.setHasGarden(hasGarden);
        return this;
    }

    public HouseBuilder hasSwimmingPool(boolean hasSwimmingPool){
        house.setHasSwimmingPool(hasSwimmingPool);
        return this;
    }

    public HouseBuilder wallPaintInRGB(String wallPaintInRGB){
        house.setWallPaintInRGB(wallPaintInRGB);
        return this;
    }

    public HouseBuilder age(int age){
        house.setAge(age);
        return this;
    }

    public HouseBuilder price(int price){
        house.setPrice(price);
        return this;
    }

    public House build(){
        House buildedHouse = house;
        house = new House();
        return buildedHouse;
    }
}
