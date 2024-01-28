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
    public static Map<Integer, Integer> countWordLengths(String content) {
        Map<Integer, Integer> counted = new TreeMap<>();
        for (String word : content.split(" +")) {
            int key = word.length();
            counted.put(key, counted.getOrDefault(key, 0) + 1);
        }
        return counted;
    }

    public static Map<Integer, List<String>> groupByWordLengths(String content) {
        Map<Integer, List<String>> grouped = new TreeMap<>();
        String[] words = content.split(" +");
        for (String word : words) {
            if (!grouped.containsKey(word.length())) grouped.put(word.length(), new ArrayList<>());
            grouped.get(word.length()).add(word);
            // System.out.println(word + " => " + grouped); // Um schrittweisen Aufbau auszugeben
        }

        // Oder Variante: Erst keys anlegen, dann einfügen
        // grouped = new TreeMap<>();
        // for (Aufgaben.String word : words) grouped.put(word.length(), new ArrayList<>());
        // for (Aufgaben.String word : words) grouped.get(word.length()).add(word);
        return grouped;
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