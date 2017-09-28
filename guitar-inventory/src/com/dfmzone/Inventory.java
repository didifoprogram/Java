package com.dfmzone;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Guitar> guitars = new ArrayList<>();

    public void addGuitar(String serialNumber, double price, GuitarSpec guitarSpec) {

        guitars.add(new Guitar(serialNumber, price, guitarSpec));
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar g : guitars) {
            if (g.getSerialNumber().equals(serialNumber)) {
                return g;
            }
        }
        return null;
    }

//    public List<Guitar> search(GuitarSpec guitarSpec) {
//        ArrayList<Guitar> guitarsFound = new ArrayList<>();
//
//        for (Guitar g : guitars) {
//            if (g.getGuitarSpec().getType().equals(guitarSpec.getType()) &&
//                    g.getGuitarSpec().getBuilder().equals(guitarSpec.getBuilder())
//                    && g.getGuitarSpec().getModel().equals(guitarSpec.getModel())) {
//                guitarsFound.add(g);
//            }
//        }
//        return guitarsFound;
//    }

    public List<Guitar> search(GuitarSpec guitarSpec) {
        List<Guitar> foundGuitars = new ArrayList<>();

        for (Guitar g : guitars) {
            if (guitarSpec.equals(g.getGuitarSpec())) {
                foundGuitars.add(g);
            }
        }
        return foundGuitars;
    }
}
