import enumerator.Builder;
import enumerator.Type;
import enumerator.Wood;
import model.Guitar;
import model.GuitarSpec;
import model.Inventory;

import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);
        List matchingGuitars = inventory.search(whatErinLikes);

        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Object matchingGuitar : matchingGuitars) {
                Guitar guitar = (Guitar) matchingGuitar;
                GuitarSpec spec = guitar.getSpec();
                System.out.println("  We have a " + spec.getBuilder() + " " +
                        spec.getModel() + " " + spec.getType() + " guitar:\n    " +
                        spec.getBackWood() + " back and sides,\n    " +
                        spec.getTopWood() + " top.\n  You can have it for only $" +
                        guitar.getPrice() + "!\n  ----");
            }
        } else {
            System.out.println("Sorry Erin, we have nothing for you.");
        }

    }

    private static void initializeInventory(Inventory inventory) {
        // Add guitars to the inventory...
        GuitarSpec spec = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);
        inventory.addGuitar("V95693", 1499.95, spec);

        GuitarSpec spec2 = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER,12);
        inventory.addGuitar("V9512", 1549.95, spec2);
    }

}
