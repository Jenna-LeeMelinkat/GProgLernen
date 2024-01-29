package Aufgaben.List;

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

public class K_Li_I_Spanne_Liste_vonZahlZuZahl {

    // Methode zur Berechnung der größten Spanne
    public static int spanne(List<Integer> liste) {
        int spanne = 0; // Initialisiere die größte Spanne mit 0

        for(int i = 0; i < liste.size(); i++) {
            int aktuelleZahl = liste.get(i);

            int links = liste.indexOf(aktuelleZahl);
            int rechts = liste.lastIndexOf(aktuelleZahl);


            int aktuelleSpanne = rechts - links + 1;


            if(aktuelleSpanne > spanne) {
                spanne = aktuelleSpanne;
            }
        }


        return spanne;
    }

    public static void main(String[] args) {
        List<Integer> werte = Arrays.asList(1,2,1,1,3);
        int span = spanne(werte); // Berechne die größte Spanne
        System.out.println(span); // Gib die größte Spanne aus
        // => 4
    }

}
