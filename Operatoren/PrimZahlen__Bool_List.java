package Operatoren;

import java.util.List;
        import java.util.Arrays;
        import java.util.ArrayList;


/**
 * ## Primzahlen bestimmen
 *
 * Eine Primzahl ist eine natürliche Zahl > 1, die nur durch sich
 * selbst und 1 teilbar ist. Sie sollen nun Primzahlen
 * generieren und tabellarisch auf der Konsole ausgeben.
 *
 * Entwickeln Sie hierzu bitte die folgenden Methoden:
 *
 * - `isPrim()` prüft, ob eine gegebene Zahl eine Primzahl ist.
 * - `primsUntil()` erzeugt eine Liste aller aufsteigen sortierten Primzahlen
 *   bis zu einer oberen Schranke.
 * - `columnize()` erzeugt aus einer Liste eine Zeichenkette in dem jedes Element
 *   mit einem Tabulator `\t` getrennt wird. Jeder n.te Tabulator wird jedoch
 *   durch ein `\n` ersetzt (solche Zeichenketten erscheinen tabellarisch
 *   auf der Konsole).
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - https://de.wikipedia.org/wiki/Primzahl
 * - Kennen Sie noch die String Methode `trim()`?
 *
 */
class PrimZahlen__Bool_List {

    public static boolean isPrim(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> primsUntil(int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (isPrim(i)) {
                numbers.add(i);
            }
        }
        return numbers;
    }

    public static <T> String columnize(List<T> numbers, int n) {
        if (numbers.isEmpty() || n <= 0) {
            return "";
        }

        String ergebnis = "";
        int count = 0;

        for (T t : numbers) {
            ergebnis += t;
            if (++count % n == 0) {
                ergebnis += "\n";
            } else if (n == 1) {
                ergebnis += "\n";
            } else {
                ergebnis += "\t";
            }
        }
        return ergebnis.trim();
    }

    public static void main(String[] args) {
        boolean prim = isPrim(7);
        System.out.println(prim); // => true

        List<Integer> prims = primsUntil(20);
        System.out.println(prims); // => [2, 3, 5, 7, 11, 13, 17, 19]

        String output = columnize(prims, 3);
        System.out.println(output);
        // 2   3   5
        // 7   11  13
        // 17  19

        // Entspricht der Zeichenkette: "2\t3\t5\n7\t11\t13\n17\t19"
    }
}