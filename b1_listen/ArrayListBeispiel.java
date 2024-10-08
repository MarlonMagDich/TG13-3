package b1_listen;

import java.util.ArrayList;

public class ArrayListBeispiel {
    public static void main(String[] args) {
        ArrayList<Integer> messwerte = new ArrayList<>();

        messwerte.add(10);
        messwerte.add(20);
        messwerte.add(30);
        messwerte.add(-40);
        
        System.out.println(messwerte);


        //For-Each-Schleife zum Durchlaufen der Elemente
        for (int messwert : messwerte) {
            System.out.println("Messwert: " + messwert);
        }

        //Zugriff auf das erste Element
        Integer i1 = messwerte.get(0);
        System.out.println("Erster Messwert: " + i1);


        //Entfernen eines Elements anhand des Wertes
        messwerte.remove(Integer.valueOf(30));
        System.out.println(messwerte);

        //Prüfen, ob ein Element enthalten ist
        if(messwerte.contains(20)) {
            System.out.println("20 ist enthalten");
        }

        //Zahlen sortieren
        messwerte.sort(null);
        System.out.println(messwerte);

        
    }
}