package List;

import java.util.List;
        import java.util.ArrayList;


/**
 * ## Liste von Blöcken aus Zeichenketten extrahieren
 *
 * Unter einem Block verstehen wir eine Folge gleicher Zeichen, z.B. “aaaa”.
 * Blöcke mit mehr als einem Zeichen, können kompakt dargestellt werden,
 * indem nur das Zeichen und die Wiederholung angegeben wird
 * (die Kompaktschreibweise für “aaaa” wäre “a4”).
 * Blöcke der Länge 1 werden nicht in Kompaktschreibweise notiert
 * (“a” wird also nie zu “a1”).
 *
 * Entwickeln Sie nun bitte eine Methode `compacts()`,
 * die aus einer beliebigen Zeichenkette eine Liste von Blöcken in
 * Kompaktschreibweise erzeugt.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
class blöckeAusZeichenketten__ListeMitCount {

    public static List<String> compacts(String s) {
        List<String> liste = new ArrayList<>();
        if (s.isEmpty()) {
            return liste;
        }
        char[] letters = s.toCharArray();
        int count = 1;
        for (int i = 1; i < letters.length; i++) {
            if (i < letters.length && letters[i] == letters[i - 1]) {
                count++;
            } else {
                if (count > 1) {
                    liste.add(String.valueOf(letters[i - 1]) + count);
                } else {
                    liste.add(String.valueOf(letters[i - 1]));
                }
                count = 1;
            }

        }
        if (count > 1) {
            liste.add(String.valueOf(letters[letters.length - 1]) + count);
        } else {
            liste.add(String.valueOf(letters[letters.length - 1]));
        }

        return liste;
    }



    public static void main(String[] args) {
        List<String> blocks = compacts("Hello");
        System.out.println(blocks); // => ["H", "e", "l2", "o"]
        System.out.println(compacts("Oooorder")); // => ["O", "o3", "r", "d", "e", "r"]
        System.out.println(compacts("C3PO")); // => ["C", "3", "P", "O"]
        System.out.println(compacts("...")); // => [".3"]
        System.out.println(compacts("")); // => []
    }
}