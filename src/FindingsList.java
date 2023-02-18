import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingsList {
    public FindingsList() throws InterruptedException {



        Thread.sleep(500);

        System.out.println("Welcome Back Commander");

        ArrayList<String> rocks = new ArrayList<>();

        System.out.println("Rock Samples downloading");

        Thread.sleep(500);

        rocks.add("Igneous");
        rocks.add("Sedimentary");
        rocks.add("Metamorphic");
        rocks.add("Sodium Chloride");
        System.out.println(rocks);
        System.out.println("Error " + rocks.get(rocks.size() - 1 ) + " is not a rock.");

        System.out.println("Deleting foreign object from sample");

        rocks.remove(3);
        Thread.sleep(500);
        System.out.println("Sample download complete");

        System.out.println(rocks + "Stored");

        Thread.sleep(1000);

        HashMap<String, String> fossils = new HashMap<>();

        System.out.println("Downloading Fossil samples");

        fossils.put("Bird", "This fossil has wings implying it was capable of flight.");
        fossils.put("Fish", "This fossil is vaguely fish shaped implying that there once was water here.");
        fossils.put("Tooth", "The tooth is from an unknown species but judging by its shape it was carnivorous");
        System.out.println("Download Complete");
            Thread.sleep(3000);

        System.out.println("Which fossil data would you like to see?");

        Scanner input = new Scanner(System.in);

        String fossilData = input.nextLine();

        if (fossilData.equalsIgnoreCase("Bird")){
            System.out.println("Fossil 1: " + fossils.get("Bird"));
        }else if (fossilData.equalsIgnoreCase("Fish")){
            System.out.println("Fossil 2: " + fossils.get("Fish"));
        }else if (fossilData.equalsIgnoreCase("Tooth")) {
            System.out.println("Fossil 3: " + fossils.get("Tooth"));
        }

        Thread.sleep(700);

        HashSet<String> specialSupplies = new HashSet<>();

        specialSupplies.add("Radio");
        specialSupplies.add("Extra Oxygen Tank");
        specialSupplies.add("Knife");
        specialSupplies.add("Med Kit");

        System.out.println("Supplies before expedition: " + specialSupplies);

        specialSupplies.remove( "Extra Oxygen Tank");

        System.out.println("Supplies after return: " + specialSupplies);

    input.close();
    }
}
