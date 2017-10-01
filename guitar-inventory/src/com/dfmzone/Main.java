package com.dfmzone;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        initializeInventory(inventory);

        System.out.println(inventory.getInstrument("000").getInstrumentSpec());

//        System.out.println("Found => " + inventory.search(new Guitar("000", "Stratocaster", Type.ELECTRIC,
//                Builder.FENDER, Wood.ALDER, Wood.ALDER, 1200.00)));

        searchAndPrintGuitars(new GuitarSpec(Type.ELECTRIC, Builder.FENDER, Wood.ALDER, Wood.ALDER, "Stratocaster", 6),
                inventory);
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addInstrument("000", 1200.00, new GuitarSpec(Type.ELECTRIC, Builder.FENDER, Wood.ALDER, Wood.ALDER, "Stratocaster", 6));
        inventory.addInstrument("123", 1299.00, new GuitarSpec(Type.ELECTRIC, Builder.FENDER, Wood.ALDER, Wood.ALDER, "Stratocaster", 6));
    }

    private static void searchAndPrintGuitars(InstrumentSpec spec, Inventory inventory) {
        List<Instrument> guitarList = inventory.search(spec);

        if (!guitarList.isEmpty()) {
            for (Instrument g : guitarList) {
                System.out.println("\nFound a " + g.getInstrumentSpec().getBuilder() + " " +
                        g.getInstrumentSpec().getModel() + " " + g.getInstrumentSpec().getType() + " For only" +
                        " $" + g.getPrice());
            }
        }
    }
}
