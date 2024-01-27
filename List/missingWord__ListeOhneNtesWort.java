package List;
import java.util.List;
        import java.util.ArrayList;
        import java.util.Arrays;

/**
 * ## `missingWord()`
 *
 * Entwickeln Sie bitte eine Methode `missingWord()`, die aus einer
 * Zeichenkette eine Liste von Worten, allerdings ohne das n-te Wort, erzeugt.
 * Ein Wort ist durch ein oder mehrere Leerzeichen von anderen Worten
 * getrennt.
 *
 * __Achtung:__
 * Das *n*-te Wort muss nicht existieren.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
class missingWord__ListeOhneNtesWort {

    public static List<String> missingWord(String s, int n) {
        List<String> wordsList = new ArrayList<>(Arrays.asList(s.split("\\s+")));
        if (s.isEmpty() || s.isBlank() || s == null) {
            return wordsList;
        }

        for (int i = 0; i < wordsList.size(); i++) {
            if (wordsList.get(i).trim().isEmpty()) {
                wordsList.remove(i);
                i--;
            }
        }

        if (n >= 0 && n < wordsList.size()) {
            wordsList.remove(n);
        }

        return wordsList;
    }

    public static void main(String[] args) {
        List<String> words = missingWord("Dies ist nur ein Beispiel", 2);
        System.out.println(words); // => [Dies, ist, ein, Beispiel]
        System.out.println(missingWord(" ich nicht ", 1));  // => [ich]

        System.out.println(missingWord(" nicht ich", 0));  // => [ich]
        System.out.println(missingWord("Hello World", 2));  // => [Hello, World]
        System.out.println(missingWord("Hello World", -1)); // => [Hello, World]
    }
}