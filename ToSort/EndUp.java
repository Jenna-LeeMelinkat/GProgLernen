package ToSort;

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
class EndUp {

    public static String endUp(String s) {
        int sLength = s.length();
        if (sLength > 3) {
            String firstPart = s.substring(0,sLength - 3);
            String secondPart = s.substring(sLength - 3,sLength);
            String secondPartUpperCase = secondPart.toUpperCase();
            return firstPart + secondPartUpperCase;
        } else {
            return s.toUpperCase();
        }
    }

    public static void main(String[] args) {
        String result = endUp("Hello");
        System.out.println(result); // => "HeLLO"
        System.out.println(endUp("Hi there")); // => "Hi thERE"
        System.out.println(endUp("hi")); // => "HI"
    }
}