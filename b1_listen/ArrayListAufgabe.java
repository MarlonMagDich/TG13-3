package b1_listen;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAufgabe {
    public static void main(String[] args) {
        // Arraylist mit 5 Namen erstellen
        // Namen hinzufügen
        // Namen ausgeben
        // Namen hintereinander ausgeben
        // Ersten Namen ausgeben
        // Namen entfernen
        // Namen enthalten?

        ArrayList<String> namen = new ArrayList<>();
        namen.add("Hans");
        namen.add("Peter");
        namen.add("Klaus");
        namen.add("Karl");
        namen.add("David");

        System.out.println(namen);

        for (String name : namen) {
            System.out.println(name);
        }

        String ersterName = namen.get(0);
        System.out.println("Erster Name: " + ersterName);

        System.out.println(namen);

        if (namen.contains("Peter")) {
            System.out.println("Peter ist enthalten");
        }

        // Namen entfernen
        namen.remove("Peter");
        System.out.println(namen);

        // Namen sortieren
        namen.sort(null);
        System.out.println(namen);

    }
}
