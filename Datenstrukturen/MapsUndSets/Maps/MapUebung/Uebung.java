package MapsUndSets.Maps.MapUebung;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Uebung {

    public static void main(String[] args) {
        Map<String, String> hauptstaedte = new HashMap<>();
        hauptstaedte.put("Baden-Württemberg", "Stuttgart");
        hauptstaedte.put("Bayern", "München");
        hauptstaedte.put("Berlin", "Berlin");
        hauptstaedte.put("Brandenburg", "Potsdam");
        hauptstaedte.put("Bremen", "Bremen");
        hauptstaedte.put("Hamburg", "Hamburg");
        hauptstaedte.put("Hessen", "Wiesbaden");
        hauptstaedte.put("Mecklenburg-Vorpommern", "Schwerin");
        hauptstaedte.put("Niedersachsen", "Hannover");
        hauptstaedte.put("Nordrhein-Westfalen", "Düsseldorf");
        hauptstaedte.put("Rheinland-Pfalz", "Mainz");
        hauptstaedte.put("Saarland", "Saarbrücken");
        hauptstaedte.put("Sachsen", "Dresden");
        hauptstaedte.put("Sachsen-Anhalt", "Magdeburg");
        hauptstaedte.put("Schleswig-Holstein", "Kiel");
        hauptstaedte.put("Thüringen", "Erfurt");
        hauptstaedte.put("Mallorca", "Palma de Mallorca");

        System.out.println("Hauptstädte:");
        System.out.println(hauptstaedte);

        // Bundesland Liste
        ArrayList<String> bundeslaender = new ArrayList<>(hauptstaedte.keySet());

        System.out.println("\nBundesländer:");
        System.out.println(bundeslaender);

        // Hauptstadt Liste
        ArrayList<String> hauptstaedteListe = new ArrayList<>(hauptstaedte.values());

        System.out.println("\nHauptstädte:");
        System.out.println(hauptstaedteListe);

        // Bestimmte Hauptstadt ausgeben
        Scanner s = new Scanner(System.in);
        System.out.println("\nBitte geben Sie ein Bundesland ein: ");

        String gewaehlt_bundesland = s.nextLine();

        String passende_hauptstadt;
        if (hauptstaedte.get(gewaehlt_bundesland) == null) {
            passende_hauptstadt = "nicht vorhanden.";
        } else {
            passende_hauptstadt = hauptstaedte.get(gewaehlt_bundesland);
        }

        System.out.println("\nDie Hauptstadt von " + gewaehlt_bundesland + " ist " + passende_hauptstadt);

    }
}