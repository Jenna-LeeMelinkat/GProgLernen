package ZweiKlassen.TupleListen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ## Combinations
 * Entwickeln Sie nun bitte eine Methode `combine()`,
 * die aus zwei Listen von Zeichenketten, alle paarweisen
 * Kombinationen als Liste von `ZweiKlassen.TupleListen.Tuple`n erzeugt.
 *
 * Auch die Klasse `ZweiKlassen.TupleListen.Tuple` inkl. Konstruktor und `toString()`-
 *`Methode ist durch Sie zu entwickeln.
 *
 * Aufrufbeispiele zur Erzeugung von `ZweiKlassen.TupleListen.Tuple`n und
 * `combine()` finden Sie in der `main()`-Methode.
 * - Achten Sie auf eine sinnvolle Handhabung von `null` Referenzen.
 *
 */

public class MainTuple_____ListXListe {

    public static List<Tuple> combine(List<String> liste1, List<String> liste2) {
        List<Tuple> ergebnis = new ArrayList<>();
        if (liste1 == null || liste2 == null) {
            return ergebnis;
        }
        for (String s1 : liste1) {
            for (String s2 : liste2) {
                Tuple t = new Tuple(s1, s2);
                ergebnis.add(t);
            }
        }


        return ergebnis;
    }

    public static void main(String[] args) {
        // ZweiKlassen.TupleListen.Tuple Erzeugung
        Tuple t = new Tuple("Hello", "World");
        Tuple r = new Tuple("Hallo", "Welt");

        // Combine-Beispiele
        List<String> l1 = Arrays.asList("A", "B", "C");
        List<String> l2 = Arrays.asList("X", "Y");
        List<Tuple> combinations = combine(l1, l2);
        System.out.println(combinations); // = [(A, X), (A, Y), (B, X), (B, Y), (C, X), (C, Y)]
        System.out.println(combine(l1, null)); //[]
    }
}
