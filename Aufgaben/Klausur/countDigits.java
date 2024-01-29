package Aufgaben.Klausur;

import java.util.Map;
import java.util.HashMap;

/**
 * 73
 * Aufgabe 2
 *
 * Bitte entwickeln Sie nun eine Methode `countDigits()`, die die Häufigkeit
 * von Dezimalzeichen (Digits, '0'-'9') in einer Zeichenketten zählt.
 *
 * Weitere Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweis__:
 *
 * - Mittels der Methode `boolean Character.isDigit(char)` können Sie prüfen,
 *   ob ein Zeichen (char) ein Dezimalzeichen '0'-'9' (Digit) ist.
 *
 */
class countDigits {

    public static Map<Character, Integer> countDigits(String s) {
        Map<Character, Integer> map = new HashMap<>();

        if (s.isEmpty() || s.isBlank()) {
            return map;
        }

        int count = 0;
        String[] words = s.split("\\s+");
        for (String word : words) {
            char[] cA = s.toCharArray();
            for (char c : cA) {
                if (!Character.isDigit(c)) {
                    count = 0;
                } else {
                    count = map.getOrDefault(c, 1);
                    map.put(c, count);
                }
            }
        }


        return map;
    }


    public static void main(String[] args) {
        Map<Character, Integer> m = countDigits("Die Antwort ist 42");
        System.out.println(m); // => { 2=1, 4=1 }

        System.out.println(countDigits("Amerika wurde 1492 entdeckt"));
        // => { 1=1, 2=1, 4=1, 9=1 }

        System.out.println(countDigits("Willkommen in 2024"));
        // => { 0=1, 2=2, 4=1 }
    }
}
