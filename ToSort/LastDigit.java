package ToSort;

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
 * - Der Modulo Operator % ist sicher hilfreich (siehe Unit 2, arithmetische Operatoren)
 * - Einen Betrag können Sie mittels `Math.abs()` bestimmen.
 *
 */
class LastDigit {

    public static boolean lastDigit(int a, int b) {
        int lastDigitA = Math.abs(a % 10);
        int lastDigitB = Math.abs(b % 10);
        if (lastDigitA == lastDigitB) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        boolean result = lastDigit(21, 12);
        System.out.println(result); // => false
        System.out.println(lastDigit(121, 2001)); // => true
    }
}