package Aufgaben.Map;


import java.util.Map;
        import java.util.HashMap;


/**
 * ## Worthäufigkeit in Zeichenketten bestimmen
 *
 * Entwickeln Sie nun eine Methode `wordCount()`, die die absolute
 * Häufigkeit von Worten in einem Text mittels eines Mappings zählt.
 * Worte sind durch ein oder mehrere Whitespace Zeichen
 * (Leerzeichen, Tabulatoren, Linebreaks, etc.) voneinander getrennt.
 * Worte sollen case-insensitiv gezählt werden.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweis:__
 *
 * - In regulären Ausdrücken können Sie alle Whitespace Zeichen
 *   mit `"\\s"` selektieren.
 *
 */
class S_Msi_wordCount___Map_haeufigkeitSInS {

    public static Map<String, Integer> wordCount(String s) {
        Map<String, Integer> answer = new HashMap<>();
        String[] words = s.split("\\s+");

        if (s.isEmpty() || s.isBlank()) {
            return answer;
        }

        for (String word : words) {
            String lowercase = word.toLowerCase();

            if (!word.isEmpty()) {
                answer.put(lowercase, answer.getOrDefault(lowercase, 0) + 1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Map<String, Integer> result = wordCount("aa BB cC Aa Cc Bb aA AA");
        System.out.println(result); // => { "aa": 4, "bb": 2, "cc": 2 }
        System.out.println(wordCount("Ein kleines Beispiel"));
        // => { "ein": 1, "kleines": 1, "beispiel": 1 }
    }
}