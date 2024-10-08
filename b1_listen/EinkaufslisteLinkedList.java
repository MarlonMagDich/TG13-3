package b1_listen;

import java.util.LinkedList;
import java.util.Scanner;

public class EinkaufslisteLinkedList {
    public static void main(String[] args) {

        LinkedList<String> einkaufsliste = new LinkedList<>();

        einkaufsliste.add("Milch");
        einkaufsliste.add("Butter");
        einkaufsliste.add("Brot");

        Scanner scanner = new Scanner(System.in);
        String eingabe;

        do {

            System.out.println("----------------------------");
            System.out.println("Einkaufsliste: " + einkaufsliste);
            System.out.println("----------------------------");
            System.out.println("Möchten sie noch etwas hinzufügen? H, E, N");
            eingabe = scanner.nextLine();
            if (eingabe.equals("H")) {
                System.out.println("Was möchten sie hinzufügen? Abbrechen mit Stop");
                String produkt = scanner.nextLine();
                if (produkt.equals("Stop")) {
                    System.out.println("Abgebrochen");
                    continue;
                }
                einkaufsliste.add(produkt);
            }
            if (eingabe.equals("E")) {
                System.out.println("Was möchten sie entfernen? Abbrechen mit Stop");
                String produkt = scanner.nextLine();
                if (produkt.equals("Stop")) {
                    System.out.println("Abgebrochen");
                    continue;
                }
                einkaufsliste.remove(produkt);
            }

        } while (!eingabe.equals("N"));

    }
}
