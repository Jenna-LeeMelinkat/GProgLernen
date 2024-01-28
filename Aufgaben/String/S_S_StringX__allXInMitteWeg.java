package Aufgaben.String;

/**
 * ## Verflixtes Zeichenketten formatieren mit `stringX()`
 *
 * Entwickeln Sie nun bitte eine Methode `stringX()`, die
 * alle 'x' aus einer Zeichenkette entfernt, es sei denn sie stehen am Anfang oder
 * am Ende der Zeichenkette.
 *
 * Aufruf Beispiele finden Sie in der `main()`-Methode.
 *
 * Hinweise:
 *
 * - Denken Sie über den Einsatz folgender Aufgaben.String-Methoden nach.
 *   Die Wirkungsweise finden Sie im Handout der Unit 02 oder unter diesem
 *   [API Link](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html).
 * - `substring()`
 * - `replaceAll()`
 *
 */
class S_S_StringX__allXInMitteWeg {

    public static String stringX(String s) {
        if (s == null || s.isEmpty() || s.isBlank()) {
            return s;
        }

        int length = s.length();
        if (length <= 2) {
            return s;
        } else {
            String mitte = s.substring(1, length - 1);
            mitte = mitte.replaceAll("x", "");

            String first = s.substring(0, 1);
            String end = s.substring(length - 1);

            return first + mitte + end;
        }
    }

    public static void main(String[] args) {
        String result = stringX("xxHix");
        System.out.println(result); // => xHix

        System.out.println(stringX("abxxxcd")); // => abcd
        System.out.println(stringX("xabxxxcdx")); // => xabcdx
    }
}