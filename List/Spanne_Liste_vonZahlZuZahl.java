package List;

import java.util.List;
import java.util.Arrays;

/*
spanne()

Gegeben sei eine Liste von Integerwerten.
Betrachten wir das äußerste linke und das äußerste rechte Vorkommen
eines Wertes in einer solchen Liste.
Unter einer "Spanne" sei die Anzahl der Elemente zwischen diesen beiden Werten zu versthen
Ein einzelner Wert hat eine Spanne von 1
Entwickeln Sie nun bitte eine Methode spanne(),
die die größte Spanne zurück gibt, die in einer Liste vorkommt.
(Die Effiziens des Algorythmus ist kein Bewertungskriterium)
 */

public class Spanne_Liste_vonZahlZuZahl {

    // Methode zur Berechnung der größten Spanne
    public static int spanne(List<Integer> werte) {
        int spanne = 0; // Initialisiere die größte Spanne mit 0

        // Iteriere durch die Liste der Werte
        for(int i = 0; i < werte.size(); i++) {
            int aktuelleZahl = werte.get(i); // Erhalte die aktuelle Zahl aus der Liste

            int links = werte.indexOf(aktuelleZahl); // Index des ersten Vorkommens der Zahl
            int rechts = werte.lastIndexOf(aktuelleZahl); // Index des letzten Vorkommens der Zahl

            // Berechne die Spanne für die aktuelle Zahl
            int aktuelleSpanne = rechts - links + 1;

            // Überprüfe, ob die aktuelle Spanne größer als die bisher größte Spanne ist
            if(aktuelleSpanne > spanne) {
                spanne = aktuelleSpanne; // Aktualisiere die größte Spanne
            }
        }

        // Gib die größte Spanne zurück
        return spanne;
    }

    public static void main(String[] args) {
        List<Integer> werte = Arrays.asList(1,2,1,1,3);
        int span = spanne(werte); // Berechne die größte Spanne
        System.out.println(span); // Gib die größte Spanne aus
        // => 4
    }

}
