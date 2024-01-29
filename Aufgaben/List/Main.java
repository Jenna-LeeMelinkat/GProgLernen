package Aufgaben.List;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * ## `sortWords()`
 *
 * Entwickeln Sie bitte eine Methode `sortWords()`, die aus einer
 * Zeichenkette eine Liste von alphabetisch sortierten Worten erzeugt.
 * Ein Wort ist durch ein oder mehrere Leerzeichen von anderen Worten
 * getrennt.
 *
 * Treten Worte mehrfach in der Zeichenkette auf, sollen diese nur
 * einmal in der Liste alphabetisch sortierter Wörter auftreten.
 * Worte sind Case-sensitiv zu handhaben.
 *
 * __Hinweis:__
 * Denken Sie über den Einsatz einer TreeMap nach.
 * Eine TreeMap erhält das Ordnungskriterium eines Schlüssels.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */

public class Main {

    public static List<String> sortWords(String s) {
        List<String> ergebnis = new ArrayList<>();

        // Wörter extrahieren und eindeutige Wörter identifizieren
        String[] words = s.split("\\s+");
        for (String word : words) {
            if (!word.isEmpty() && !word.isBlank() && !ergebnis.contains(word)) {
                ergebnis.add(word);
            }

        }

        // Alphabetisches Sortieren der eindeutigen Wörter
        for (int i = 0; i < ergebnis.size() - 1; i++) {
            for (int j = i + 1; j < ergebnis.size(); j++) {
                if (ergebnis.get(i).compareTo(ergebnis.get(j)) > 0) {
                    String temp = ergebnis.get(i);
                    ergebnis.set(i, ergebnis.get(j));
                    ergebnis.set(j, temp);
                }
            }
        }

        return ergebnis;
    }
    /*


    public static List<String> sortWords(String input) {
        Map<String, Integer> map = new TreeMap<>();

        String[] wordsArray = input.split("\\s+");

        for (String s : wordsArray) {
            if (!s.isEmpty() && !s.isBlank()) {
                map.put(s, 0);
            }
        }

        List<String> sortedWordsList = new ArrayList<>(map.keySet());
        Collections.sort(sortedWordsList);

        return sortedWordsList;
    }

     */


    public static void main(String[] args) {
        List<String> words = sortWords("Dies ist nur ein Beispiel");
        System.out.println(words); // => [Beispiel, Dies, ein, ist, nur]
        System.out.println(sortWords("Abc Abc Abc"));  // => [Abc]
        System.out.println(sortWords("abc Abc"));  // => [Abc, abc]
    }
}