package List;

import java.util.List;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
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

public class SortWords__Map__StringZuSortierteListe {


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


    public static void main(String[] args) {
        List<String> words = sortWords("Dies ist nur ein Beispiel");
        System.out.println(words); // => [Beispiel, Dies, ein, ist, nur]
        System.out.println(sortWords("Abc Abc Abc"));  // => [Abc]
        System.out.println(sortWords("abc Abc"));  // => [Abc, abc]
    }
}