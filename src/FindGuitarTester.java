import enumerator.Builder;
import enumerator.Type;
import enumerator.Wood;
import model.Guitar;
import model.Inventory;

import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("", Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 0);
        List matchingGuitars = inventory.search(whatErinLikes);

        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Object matchingGuitar : matchingGuitars) {
                Guitar guitar = (Guitar) matchingGuitar;
                System.out.println("  We have a " + guitar.getBuilder() + " " +
                        guitar.getModel() + " " + guitar.getType() + " guitar:\n    " +
                        guitar.getBackWood() + " back and sides,\n    " +
                        guitar.getTopWood() + " top.\n  You can have it for only $" +
                        guitar.getPrice() + "!\n  ----");
            }
        } else {
            System.out.println("Sorry Erin, we have nothing for you.");
        }

    }

    private static void initializeInventory(Inventory inventory) {
        // Add guitars to the inventory...
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER,
                "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        inventory.addGuitar("V9512", 1549.95, Builder.FENDER,
                "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }

}
