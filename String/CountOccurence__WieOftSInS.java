package String;

/**
 * ## Vorkommen von Zeichenketten zählen
 *
 * Schreiben Sie nun eine Methode `countOccurences()` die zählt, wie häufig eine Zeichenkette *a* in einer 
 * anderen Zeichenkette *b* vorkommt. Sich überlagernde Zeichenketten sind erlaubt. 
 * D.h. "xx" ist als zweimal in "xxx" vorhanden zu zählen.
 * Leere Zeichenketten sind nicht zu zählen.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Beachten Sie, dass leere Zeichenketten schnell eine Endlosschleife erzeugen können.
 * - Liefert VPL eine Out-of-Memory Fehlermeldung ist dies vermutlich auf eine 
 *   Endlosschleife zurückzuführen.
 * - Die String-Methoden `indexOf()` oder `startsWith()` könnten hilfreich sein.
 *
 */
class CountOccurence__WieOftSInS {

    public static int countOccurences(String needle, String content) {
        if (needle.isEmpty() || content.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = content.indexOf(needle, index)) != -1) {
            // indexOf liefert -1, wenn die Zeichenkette nicht gefunden wird.
            count++;
            // Index für die nächste Suche um eins erhöhen, um sich überlappende Vorkommen zu berücksichtigen.
            index++;
        }

        return count;
    }

    /*
        public static Integer countOccurences(String a, String s) {
        if (s == null || s.isEmpty() || s.isBlank()) {
            return 0;
        }

        int count = 0;
        int differenz = s.length() - a.length();

        for (int i = 0; i <= differenz; i++) {
            if (s.substring(i, i + a.length()).equals(a)) {
                count++;
            }
        }

        return count;
    }
     */
    public static void main(String[] args) {
        System.out.println(countOccurences("Hello", "Hello World")); // => 1
        System.out.println(countOccurences("abc", "abc abc abc")); // => 3
        System.out.println(countOccurences("xx", "xxx")); // => 2
    }
}