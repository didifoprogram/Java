package com.dfmzone;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        initializeInventory(inventory);

        System.out.println(inventory.getGuitar("000"));

//        System.out.println("Found => " + inventory.search(new Guitar("000", "Stratocaster", Type.ELECTRIC,
//                Builder.FENDER, Wood.ALDER, Wood.ALDER, 1200.00)));

        searchAndPrintGuitars(new Guitar("000", "Stratocaster", Type.ELECTRIC,
                Builder.FENDER, Wood.ALDER, Wood.ALDER, 1200.00),inventory);
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("000", 1200.00, "Stratocaster", Builder.FENDER, Wood.ALDER,
                Wood.ALDER, Type.ELECTRIC);
        inventory.addGuitar("123", 1299.00, "Stratocaster", Builder.FENDER, Wood.ALDER,
                Wood.ALDER, Type.ELECTRIC);
    }

    private static void searchAndPrintGuitars(Guitar guitar, Inventory inventory) {
        List<Guitar> guitarList = inventory.search(guitar);

        if(!guitarList.isEmpty()) {
            for (Guitar g : guitarList) {
                System.out.println("\nFound a " + g.getBuilder() + " " + g.getModel() + " " + g.getType() +
                        " only $" + g.getPrice() + " serial number(" + g.getSerialNumber() + ")");
            }
        }
    }
}
