package Aufgaben.List;
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
class SI_L_missingWord__ListeOhneNtesWort {

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

    /*
        public static Aufgaben.Arrais.List<Aufgaben.String> missingWord(Aufgaben.String s, int n){
        Aufgaben.Arrais.List<Aufgaben.String> missingWord = new ArrayList<>();

        if (s == null || s.isEmpty() || s.isBlank()) {
            return missingWord;
        }


        Aufgaben.String[] words = s.split("\\s+");
        if (n < 0 || n >= words.length) {
            return missingWord;
        }

        for (int i = 0; i < words.length; i++) {
            if (i != n) {
                missingWord.add(words[i]);
            }
        }

        return missingWord;
    }
     */
    public static void main(String[] args) {
        List<String> words = missingWord("Dies ist nur ein Beispiel", 2);
        System.out.println(words); // => [Dies, ist, ein, Beispiel]
        System.out.println(missingWord(" ich nicht ", 1));  // => [ich]

        System.out.println(missingWord(" nicht ich", 0));  // => [ich]
        System.out.println(missingWord("Hello World", 2));  // => [Hello, World]
        System.out.println(missingWord("Hello World", -1)); // => [Hello, World]
    }
}