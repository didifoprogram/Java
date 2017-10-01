package com.dfmzone;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Instrument> instrumentArrayList = new ArrayList<>();

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {

        if(spec instanceof GuitarSpec) {
            instrumentArrayList.add(new Guitar(serialNumber,price, spec));
        } else if (spec instanceof MandolinSpec) {
            instrumentArrayList.add(new Mandolin(serialNumber,price, spec));
        }
    }

    public Instrument getInstrument(String serialNumber) {
        for (Instrument g : instrumentArrayList) {
            if (g.getSerialNumber().equals(serialNumber)) {
                return g;
            }
        }
        return null;
    }

//    public List<Guitar> search(GuitarSpec guitarSpec) {
//        ArrayList<Guitar> guitarsFound = new ArrayList<>();
//
//        for (Guitar g : instrumentArrayList) {
//            if (g.getGuitarSpec().getType().equals(guitarSpec.getType()) &&
//                    g.getGuitarSpec().getBuilder().equals(guitarSpec.getBuilder())
//                    && g.getGuitarSpec().getModel().equals(guitarSpec.getModel())) {
//                guitarsFound.add(g);
//            }
//        }
//        return guitarsFound;
//    }

    public List<Instrument> search(InstrumentSpec instrumentSpec) {
        List<Instrument> foundInstruments = new ArrayList<>();

        for (Instrument g : instrumentArrayList) {
            if (instrumentSpec.equals(g.getInstrumentSpec())) {
                foundInstruments.add(g);
            }
        }
        return foundInstruments;
    }
}
