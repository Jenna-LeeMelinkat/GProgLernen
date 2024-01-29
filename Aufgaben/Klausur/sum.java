package Aufgaben.Klausur;

import java.util.List;
import java.util.Arrays;

/**
 * Aufgabe 3: Summe zweier Teillisten
 *
 * Entwickeln Sie nun bitte eine Methode namens `balance()`, die
 * den Index einer Liste von Integer-Werten bestimmt, der einen ersten
 * sogenannten Balancepunkt bestimmt.
 *
 * Ein Balancepunkt sei der Index, der die Liste so in zwei Teillisten aufteilt,
 * dass die Summe der Teillisten links und rechts vom Balancepunkt gleich sind.
 *
 * Beispiel: Gegeben sei die Liste [1, 2, 3, 4, 2]. Dann kann die Liste in
 * zwei Listen [1, 2, 3] und [4, 2] aufgeteilt werden, so dass die Summe
 * der Teilliste [1, 2, 3] und die Summe der Teilliste [4, 2] jeweils 6 ergibt.
 * Der Balancepunkt wäre somit der Index 3, den an diesem Index muss die Liste
 * geteilt werden, um zwei Teillisten mit der gewünschten Eigenschaft zu erhalten!
 *
 * - Sollte es keinen Balancepunkt geben, soll -1 zurückgegeben werden.
 * - Gibt es mehrere Balancepunkte, soll der mit dem kleinsten Index zurückgegeben werden.
 *
 * Weitere Aufrufbeispiele finden sich in der `main()`-Methode.
 *
 * Hinweis: Ihnen sind die Hilfsmethoden `split()` und `sum()` gegeben, die
 * Sie natürlich für Ihre Lösung nutzen dürfen. Versuchen Sie das Problem unter
 * Nutzung dieser beider Methoden geschickt zu dekomponieren.
 *
 */
class sum {

    public static int balance(List<Integer> liste) {
        int summe = 0;
        int laenge = liste.size();

        for (int zahl : liste) {
            summe += zahl;
        }

        int lsum = 0;

        for (int i = 0; i < laenge; i++) {
            lsum += liste.get(i);
            int rsum = summe - lsum;

            if (lsum == rsum) {
                return i + 1;
            }
        }
        return -1;

    }


    public static List<Integer> split(List<Integer> values, int n, boolean first) {
        if (n < 0) return null;
        if (n > values.size()) return null;
        return first ? values.subList(0, n) : values.subList(n, values.size());
    }

    public static int sum(List<Integer> values) {
        int s = 0;
        for (int v : values) s += v;
        return s;
    }

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, -1, 3, 2);
        int balanceIndex = balance(values);
        System.out.println(balanceIndex);
        // => 4 (denn sum([1, 2, 3, -1]) = sum([3, 2])

        System.out.println(balance(Arrays.asList(5, 4)));
        // => -1 (denn man kann [5, 4] nicht so aufteilen, dass die Summe zweier Teillisten gleich sind)

        System.out.println(balance(Arrays.asList(3, 2, 1)));
        // => 1 (denn sum([3] == sum([2, 1]))
    }
}
