package Aufgaben.String.C;

/**
 * ## Summiere alle Ziffern in einer Zeichenkette
 *
 * Entwickeln Sie bitte eine Methode `sumDigits()`, die in einer
 * beliebigen Zeichenkette alle Ziffern (0 - 9) numerisch addiert.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Die Java-Methode `boolean Character.isDigit(char)` prüft, 
 *   ob ein Zeichen eine Ziffer ('0', '1', .. '9') ist.
 * - Die Java-Methode `int Integer.parseInt(Aufgaben.String)` konvertiert eine
 *   Zeichenkette in einen `int`-Wert (z.B. "101" -> 101).
 */
public class S_I_SumDigits___CzuIntUndAddieren {

    public static Integer sumDigits(String s) {
        int ergebnis = 0;

        char[] cA = s.toCharArray();

        for (char c : cA) {
            if (Character.isDigit(c)) {
                ergebnis += Character.getNumericValue(c);
            }
        }

        return ergebnis;
    }

    public static void main(String[] args) {
        int sum = sumDigits("aa1bc2d3");
        System.out.println(sum); // => 6
        System.out.println(sumDigits("aa11b33")); // => 8        
        System.out.println(sumDigits("Chocolate")); // => 0
    }
}