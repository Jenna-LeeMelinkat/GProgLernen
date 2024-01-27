package List;


import java.util.List;
        import java.util.Arrays;
        import java.util.Map;
        import java.util.HashMap;



/**
 * ## Listen von Zeichenketten mittels `wordAppend()`verarbeiten
 *
 * Entwickeln Sie nun bitte eine Methode `wordAppend()`.
 * Diese soll eine Liste von Strings durchlaufen, um einen Ausgabestring
 * zu erzeugen. Gehen Sie dabei wie folgt vor:
 *
 * Immer wenn ein String zum 2., 4., 6., usw. mal in der Liste auftaucht,
 * soll der String an den Ausgabestring gehängt werden. Wenn kein String doppelt
 * vorkommt, soll die leere Zeichenkette zurückgegeben werden.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweis:__
 *
 * - Denken Sie über den Einsatz einer geeigneten Datenstruktur
 *   (`Collection`) nach.
 *
 */
class wordAppend___Liste_SZumXtenMal {

    public static String wordAppend(List<String> strings) {
        String ergebnis = "";
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String currentWord : strings) {
            int count = wordCountMap.getOrDefault(currentWord, 0);
            wordCountMap.put(currentWord, count + 1);

            if (count % 2 == 1) {
                ergebnis += currentWord;
            }
        }

        return ergebnis;
    }


    public static void main(String[] args) {
        List<String> example = Arrays.asList("a", "b", "a");
        String result = wordAppend(example);
        System.out.println(result); // -> "a"
        System.out.println(wordAppend(
                Arrays.asList("a", "b", "a", "c", "a", "d", "a")
        )); // -> "aa"
        System.out.println(wordAppend(Arrays.asList("a", "", "a"))); // -> "a"
    }


}

