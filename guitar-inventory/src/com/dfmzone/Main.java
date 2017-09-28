package com.dfmzone;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        initializeInventory(inventory);

        System.out.println(inventory.getGuitar("000").getGuitarSpec());

//        System.out.println("Found => " + inventory.search(new Guitar("000", "Stratocaster", Type.ELECTRIC,
//                Builder.FENDER, Wood.ALDER, Wood.ALDER, 1200.00)));

        searchAndPrintGuitars(new GuitarSpec(Type.ELECTRIC, Builder.FENDER, Wood.ALDER, Wood.ALDER, "Stratocaster", 6),
                inventory);
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("000", 1200.00, new GuitarSpec(Type.ELECTRIC, Builder.FENDER, Wood.ALDER, Wood.ALDER, "Stratocaster", 6));
        inventory.addGuitar("123", 1299.00, new GuitarSpec(Type.ELECTRIC, Builder.FENDER, Wood.ALDER, Wood.ALDER, "Stratocaster", 6));
    }

    private static void searchAndPrintGuitars(GuitarSpec guitarSpec, Inventory inventory) {
        List<Guitar> guitarList = inventory.search(guitarSpec);

        if (!guitarList.isEmpty()) {
            for (Guitar g : guitarList) {
                System.out.println("\nFound a " + g.getGuitarSpec().getBuilder() + " " +
                        g.getGuitarSpec().getModel() + " " + g.getGuitarSpec().getType() +
                        " only $" + g.getPrice() + " serial number(" + g.getSerialNumber() + ")");
            }
        }
    }
}
