package String;

/**
 *
 * ## `middle()`
 *
 * Schreiben Sie bitte eine Methode `middle()`, die in einer Zeichenkette
 * die mittleren Zeichen zurückliefert. Die Anzahl der mittleren Zeichen ist
 * davon abhängig, ob die Zeichenkette eine gerade oder ungerade Anzahl an
 * Zeichen hat.
 *
 * Aufruf-Beispiele finden Sie in der `main()`-Methode.
 *
 */
public class Middle_String_Ausgabe_MittleresZeichen {

    public static String middle(String s) {
        int length = s.length();
        if (s.isEmpty() || s.isBlank()) {
            return "";
        }
        StringBuilder ergebnis = new StringBuilder();
        if (length % 2 == 0) {
            ergebnis.append(s.substring((length / 2) - 1, (length / 2) + 1));

        }
        if (length % 2 != 0) {
            ergebnis.append(s.charAt(length / 2));

        }
        return ergebnis.toString();

    }

    public static void main(String[] args) {
        String m = middle("Beispiel");
        System.out.println(m); // => sp

        System.out.println(middle("Abc")); // => b
        System.out.println(middle("Abcd")); // => bc
    }
}