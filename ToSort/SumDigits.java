package ToSort;

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
 * - Die Java-Methode `int Integer.parseInt(String)` konvertiert eine 
 *   Zeichenkette in einen `int`-Wert (z.B. "101" -> 101).
 */
public class SumDigits {

    public static int sumDigits(String str) {
        int sum = 0;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int sum = sumDigits("aa1bc2d3");
        System.out.println(sum); // => 6
        System.out.println(sumDigits("aa11b33")); // => 8        
        System.out.println(sumDigits("Chocolate")); // => 0
    }
}