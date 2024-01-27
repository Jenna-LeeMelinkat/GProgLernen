package String.Build;

/**
 * ## `missingChar()``
 *
 * Entwickeln Sie bitte eine Methode `missingChar()`, die aus einer
 * Zeichenkette eine neue Zeichenkette erzeugt, in der das n-te Zeichen fehlt.
 *
 *
 * __Achtung:__
 * Der Wert von *n* muss nicht in der ursprünglichen Zeichenkette liegen.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
class MissingChar__SOhneNteC {

    public static String missingChar(String s, int n) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i != n) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = missingChar("Hello", 3);
        System.out.println(s); // => Helo
        System.out.println(missingChar("Hello", 1));  // => Hllo
        System.out.println(missingChar("Hello", 4));  // => Hell
        System.out.println(missingChar("Hello", -1)); // => Hello
        System.out.println(missingChar("Hello", 10)); // => Hello
    }
}