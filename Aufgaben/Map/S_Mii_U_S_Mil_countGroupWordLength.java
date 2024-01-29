package Aufgaben.Map;

import java.util.*;

public class S_Mii_U_S_Mil_countGroupWordLength {

    // Was geht rein?
    // Was kommt raus?
    // Wie heißt die Logik?
    // [ggf. Guard Conditions]
    // (1) Aggregatvariable
    // [ggf. Preprocessing]
    // [ggf. Hilfsvariable]
    // (3) Data Loop
    //     (4) Logik
    // [ggf. Postprocessing]
    // (2) Return Aggregat
    public static Map<Integer, Integer> countWordLengths(String inhalt) {
        // Erstelle eine TreeMap, um die Längen der Wörter zu zählen
        Map<Integer, Integer> gezaehlt = new TreeMap<>();

        // Teile den Inhalt in Wörter auf und durchlaufe jedes Wort
        for (String wort : inhalt.split(" +")) {
            // Bestimme die Länge des aktuellen Wortes
            int schluessel = wort.length();

            // Aktualisiere den Zähler für die Länge des Wortes
            // Wenn der Schlüssel bereits vorhanden ist, erhöhe den Zähler um 1, ansonsten setze den Zähler auf 1
            gezaehlt.put(schluessel, gezaehlt.getOrDefault(schluessel, 0) + 1);
        }

        // Gib die Map zurück, die die Längen der Wörter mit ihrer Häufigkeit zählt
        return gezaehlt;
    }

    public static Map<Integer, List<String>> groupByWordLengths(String s) {
        // Erstelle eine TreeMap, um die Längen der Wörter zu gruppieren
        Map<Integer, List<String>> gmap = new TreeMap<>();

        // Teile den Eingabestring in Wörter auf
        String[] words = s.split(" +");

        // Durchlaufe jedes Wort im Array
        for (String word : words) {
            // Überprüfe, ob die Länge des Wortes bereits als Schlüssel in der Map existiert
            if (!gmap.containsKey(word.length())) {
                // Wenn nicht, füge einen neuen Schlüssel mit der Länge des Wortes hinzu
                // und initialisiere die Werteliste als eine leere ArrayList
                gmap.put(word.length(), new ArrayList<>());
            }

            // Füge das aktuelle Wort zur Liste der Wörter mit der entsprechenden Länge hinzu
            gmap.get(word.length()).add(word);
        }

        // Gib die Map zurück, die die Wörter nach ihrer Länge gruppiert
        return gmap;
    }

    /**
     * Zählen Sie bitte die Häufigkeiten von Wortlängen in einem Satz.
     */
    public static void main(String[] args) {
        Map<Integer, Integer> lengths = countWordLengths("Dies ist nur so ein Beispiel");
        System.out.println(lengths);
        // => { 2=1, 3=3, 4=1, 8=1 }

        // Counting Pattern finden Sie in Unit 03, Seite 48 (Folie 96)

        Map<Integer, List<String>> grouped = groupByWordLengths("Dies ist nur so ein Beispiel");
        System.out.println(grouped);
        // => Counting: { 2=1, 3=3, 4=1, 8=1 }
        // => Grouping: { 2=[so], 3=[ist, nur, ein], 4=[Dies], 8=[Beispiel] }

        // Grouping Pattern finden Sie in Unit 03, Seite 49 (Folie 97)
    }
}