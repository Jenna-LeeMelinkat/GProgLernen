package Aufgaben.Klausur;

import java.util.List;
import java.util.Arrays;

/**
 * 100
 * Aufgabe 1
 *
 * Gegeben sei eine Liste von Integerwerten.
 * Betrachten wir das äußerste linke und das äußerste rechte Vorkommen eines Wertes in einer solchen List.
 * Unter einer "Spanne" sei die Anzahl der Elemente zwischen diesen beiden Werten zu verstehen.
 * Ein einzelner Wert hat eine Spanne von 1.
 * Entwickeln Sie nun bitte eine Methode `spanne()`, die die größte Spanne zurück gibt, die in einer Liste vorkommt.
 * (Effizienz des Algorithmus ist keine Priorität.)
 *
 * Aufruf-Beispiele finden Sie in der `main()`-Methode.
 *
 */
public class Main {

    public static int spanne(List<Integer> liste) {
        int spanne = 0;
        int laenge = liste.size();

        for (int i = 0; i < laenge; i++) {

            int links = liste.indexOf(liste.get(i));
            int rechts = liste.lastIndexOf(liste.get(i));

            spanne = rechts - links + 1;
        }
        return spanne;
    }

    public static void main(String[] args) {
        List<Integer> werte = Arrays.asList(1, 2, 1, 1, 3);
        int span = spanne(werte);
        System.out.println(span);
        // => 4

        werte = Arrays.asList(1, 4, 2, 1, 4, 1, 4);
        System.out.println(spanne(werte));
        // => 6

        werte = Arrays.asList(1, 4, 2, 1, 4, 4, 4);
        System.out.println(spanne(werte));
        // => 6
    }
}