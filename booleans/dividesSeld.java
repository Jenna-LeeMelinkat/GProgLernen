package booleans;
/**
 * ## Selbstteilende Zahlen
 *
 * Entwickeln Sie nun bitte eine Methode `dividesSelf()`, die prüft,
 * ob eine Zahl selbstteilend ist. Eine Zahl ist selbstteilend, wenn
 * alle ihre Stellen die Zahl ganzzahlig teilt.
 *
 * Da durch den Wert 0 bekanntlich nicht geteilt werden kann, können alle
 * Zahlen mit einer Nullziffer (Dezimalnotation) nicht sich selbstteilend
 * sein.
 *
 * z.B.: 128 = 128 % 1 == 0 && 128 % 2 == 0 && 128 % 8 == 0
 *
 * Entwickeln Sie zusätzlich eine Methode `countDividesSelf()` die
 * angibt, wieviele sich selbstteilende Zahlen es ab 0 bis zu einer oberen
 * Schranke gibt.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Die Methodensignaturen sind Ihnen nicht mehr vorgegeben. Leiten Sie diese
 *   aus der Aufgabenstellung bitte selber ab.
 * - Mittels % 10 können Sie den Wert der letzten Ziffer bestimmen.
 * - Mittels / 10 können Sie eine Zahl um eine Stelle nach rechts "rausschieben".
 *
 */
class dividesSeld {

    public static boolean dividesSelf(int zahl) {
        int originalNumber = zahl;

        while (zahl > 0) {
            int lastDigit = zahl % 10;
            if (lastDigit == 0 || originalNumber % lastDigit != 0) {
                return false;
            }
            zahl = zahl / 10;
        }
        return true;
    }

    public static int countDividesSelf(int zahl) {
        int count = -1;

        for (int i = 0; i <= zahl; i++) {
            if (dividesSelf(i)) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

        boolean result = dividesSelf(128);
        System.out.println(result); // => true
        System.out.println(dividesSelf(12)); // => true
        System.out.println(dividesSelf(102)); // => false

        int n = countDividesSelf(10);
        System.out.println(n); // => 9
        System.out.println(countDividesSelf(100)); // => 23
        System.out.println(countDividesSelf(1000)); // => 79
    }
}