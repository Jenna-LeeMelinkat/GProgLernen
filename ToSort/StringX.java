package ToSort;

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
 * - Denken Sie über den Einsatz folgender String-Methoden nach.
 *   Die Wirkungsweise finden Sie im Handout der Unit 02 oder unter diesem
 *   [API Link](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html).
 * - `substring()`
 * - `replaceAll()`
 *
 */
class StringX {

    public static String stringX(String s) {
        int sLength = s.length();
        if (sLength > 2) {
            String sWithoutX = s.substring(1, sLength - 1).replaceAll("x", "");
            String result = s.substring(0, 1) + sWithoutX + s.substring(sLength - 1);
            return result;
        } else {
            return s;
        }
    }

    public static void main(String[] args) {
        String result = stringX("xxHix");
        System.out.println(result); // => xHix

        System.out.println(stringX("abxxxcd")); // => abcd
        System.out.println(stringX("xabxxxcdx")); // => xabcdx
    }
}