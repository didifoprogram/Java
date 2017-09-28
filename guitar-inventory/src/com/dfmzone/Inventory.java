package com.dfmzone;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Guitar> guitars = new ArrayList<>();

    public void addGuitar(String serialNumber, double price, String model, Builder builder, Wood topWood,
                          Wood backWood, Type type) {

        guitars.add(new Guitar(serialNumber, model, type, builder, backWood, topWood, price));
    }

    public Guitar getGuitar(String serialNumber) {
        for(Guitar g : guitars) {
            if (g.getSerialNumber().equals(serialNumber)) {
                return g;
            }
        }
        return null;
    }

    public List<Guitar> search(Guitar guitar) {
        ArrayList<Guitar> guitarsFound = new ArrayList<>();

        for (Guitar g : guitars) {
            if(g.getType().equals(guitar.getType()) && g.getBuilder().equals(guitar.getBuilder()) &&
            g.getModel().equals(guitar.getModel())) {
                guitarsFound.add(g);
            }
        }
        return guitarsFound;
    }
}
