package com.dfmzone;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Map<String, Object> properties = new HashMap<>();
        properties.put("model", "Stratocaster");
        properties.put("builder", Builder.FENDER);
        properties.put("backWood", Wood.ALDER);

        searchAndPrintGuitars(new InstrumentSpec(properties),
                inventory);
    }

    private static void initializeInventory(Inventory inventory) {
        Map<String, Object> prop = Map.ofEntries(Map.entry("instrumentType", InstrumentType.GUITAR), Map.entry("builder", Builder.FENDER),
                Map.entry("model", "Stratocaster"), Map.entry("type", Type.ELECTRIC), Map.entry("numOfStrings", 6),
                Map.entry("topWood", Wood.ALDER), Map.entry("backWood", Wood.ALDER));

        Map<String, Object> prop1 = Map.ofEntries(Map.entry("instrumentType", InstrumentType.MANDOLIN), Map.entry("builder", Builder.COLLINGS),
                 Map.entry("style", Style.F), Map.entry("type", Type.ACOUSTIC), Map.entry("numOfStrings", 4),
                Map.entry("topWood", Wood.ALDER), Map.entry("backWood", Wood.ALDER));

        inventory.addInstrument("111", 699.99, new InstrumentSpec(prop1), InstrumentType.MANDOLIN);
        inventory.addInstrument("000", 1200.00, new InstrumentSpec(prop), InstrumentType.GUITAR);
    }

    private static void searchAndPrintGuitars(InstrumentSpec spec, Inventory inventory) {
        List<Instrument> guitarList = inventory.search(spec);

        if (!guitarList.isEmpty()) {
            guitarList.forEach((g) -> System.out.println("\nFound a " + g.getInstrumentType() + " " + g.getInstrumentSpec().getProperty("builder") + " " +
                    g.getInstrumentSpec().getProperty("model") + " " + g.getInstrumentSpec().getProperty("type") + " For only" +
                    " $" + g.getPrice()));
        } else {
            System.out.println("\nInstrument with this specs not found.");
        }
    }
}
