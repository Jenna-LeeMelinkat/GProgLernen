package String;

/**
 * ## Zeichenketten formatieren mit `endUp()`
 *
 * Schreiben Sie eine Methode `endUp()`, die die letzten
 * drei Zeichen einer Zeichenkette groß schreibt.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Denken Sie über den Einsatz folgender String-Methoden nach.
 *   Die Wirkungsweise finden Sie im Handout der Unit 02 oder unter diesem
 *   [API Link](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html).
 * - `substring()`
 * - `toUpperCase()`
 * - `length()`
 * - Der Einsatz der Kontrollanweisung `if` kann hilfreich sein.
 *
 */
class EndUp__letzteZeichenGroß {

    public static String endUp(String s) {
        int laenge = s.length();
        if (laenge < 3) {
            if (s.isEmpty() || s.isBlank() || s == null) {
                return "";
            } else {
                return s.toUpperCase();
            }

        }
        String first = s.substring(0,laenge - 3);
        String end = s.substring(laenge - 3).toUpperCase();
        return first + end;
    }

    public static void main(String[] args) {
        String result = endUp("Hello");
        System.out.println(result); // => "HeLLO"
        System.out.println(endUp("Hi there")); // => "Hi thERE"
        System.out.println(endUp("hi")); // => "HI"
    }
}