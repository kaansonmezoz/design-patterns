package com.kaansonmezoz.design.patterns.examples.builderpattern;

import com.kaansonmezoz.design.patterns.examples.builderpattern.builder.HouseBuilder;

public class Main {
    public void main(String args[]){
        HouseBuilder builder = new HouseBuilder();

        House myHouse = builder.age(3)
                .areaInSquareMeters(150)
                .hasGarage(false)
                .hasGarden(false)
                .hasSwimmingPool(false)
                .price(100000)
                .build();
    }
}
