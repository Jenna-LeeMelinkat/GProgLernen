package Aufgaben.List;

import java.util.List;
import java.util.ArrayList;

/**
 * ## Blöcke in Zeichenketten bestimmen.
 *
 * Entwickeln Sie nun bitte eine Methode `blocks()`,
 * um in einem Aufgaben.String alle Blöcke gleicher aufeinander folgender Zeichen
 * zu bestimmen.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
class S_L_BlöckeAusZeichenketten__List {

    public static List<String> blocks(String s) {
        List<String> ergebnis = new ArrayList<>();
        if (s.isEmpty()) {

            return ergebnis;
        }

        char block1 = s.charAt(0);
        int blockIndex = 0;

        for (int i = 1; i < s.length(); i++) {
            char aktuellesZeichen = s.charAt(i);

            if (aktuellesZeichen != block1) {
                if (i - blockIndex > 1) { // Nur Blöcke mit mindestens 2 aufeinanderfolgenden Zeichen
                    ergebnis.add(s.substring(blockIndex, i));
                }
                blockIndex = i;
                block1 = aktuellesZeichen;
            }
        }

        if (s.charAt(s.length() - 1) == block1 && s.length() - blockIndex > 1) {
            ergebnis.add(s.substring(blockIndex));
        }

        return ergebnis;
    }


    public static void main(String[] args) {
        List<String> blocks = blocks("Hello faaantastic world");
        System.out.println(blocks); // => ["ll", "aaa"]
        System.out.println(blocks("aaabccdeeeefaaa")); // => ["aaa", "cc", "eeee", "aaa"]
        System.out.println(blocks("This is an example")); // => []
        System.out.println(blocks("Another  example ...")); // => ["  ", "..."]
        System.out.println(blocks("")); // => []
    }
}