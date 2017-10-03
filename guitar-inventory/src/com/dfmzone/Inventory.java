package com.dfmzone;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Instrument> instrumentArrayList = new ArrayList<>();

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec, InstrumentType instrumentType) {
        instrumentArrayList.add(new Instrument(serialNumber, price, spec, instrumentType));
    }

    public Instrument getInstrument(String serialNumber) {
        for (Instrument g : instrumentArrayList) {
            if (g.getSerialNumber().equals(serialNumber)) {
                return g;
            }
        }
        return null;
    }

    public List<Instrument> search(InstrumentSpec instrumentSpec) {
        List<Instrument> foundInstruments = new ArrayList<>();

        for (Instrument g : instrumentArrayList) {
            if (g.getInstrumentSpec().getProperties().values().containsAll(instrumentSpec.getProperties().values())) {
                foundInstruments.add(g);
            }
        }
        return new ArrayList<>(foundInstruments);
    }
}
