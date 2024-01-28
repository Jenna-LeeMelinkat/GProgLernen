package Aufgaben.booleans;

/**
 * ## Letzte Ziffer
 *
 * Entwickeln Sie nun bitte eine Methode `lastDigit()`, die
 * für zwei Zahlen (Dezimalnotation) prüft, ob diese dieselbe letzte Ziffer haben.
 *
 * Aufruf Beispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Der Modulo Operator % ist sicher hilfreich (siehe Unit 2, arithmetische Aufgaben.Operatoren)
 * - Einen Betrag können Sie mittels `Math.abs()` bestimmen.
 *
 */
class II_B_LastDigit__letzteZifferGleich {

    public static Boolean lastDigit(int a, int b) {
        int lastA = Math.abs(a % 10);
        int lastB = Math.abs(b % 10);

        return lastA == lastB;

    }
    public static void main(String[] args) {
        boolean result = lastDigit(21, 12);
        System.out.println(result); // => false
        System.out.println(lastDigit(121, 2001)); // => true
    }
}