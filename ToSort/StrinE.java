package ToSort;

/**
 * ## Zeichen in Zeichenketten zählen
 *
 * Schreiben Sie eine Methode `stringE()`, die
 * prüft, ob eine beliebige Zeichenkette
 * mindestens ein aber maximal drei `'E'` beinhaltet.
 * Die Prüfung soll case-insensitiv erfolgen.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Sie haben bereits Vorkommen von Zeichen gezählt.
 * - Nutzen Sie den logischen `&&`-Operator (AND).
 * - Nutzen Sie die Vergleichsoperatoren `>` und `<=`.
 *
 */
class StrinE {

    public static boolean stringE(String s) {
        int sLength = s.length();
        String sWithoutE = s.toLowerCase().replaceAll("e","");
        int sMinusSWE = sLength - sWithoutE.length();
        if (sMinusSWE >= 1 && sMinusSWE <= 3) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean result = stringE("Earth");
        System.out.println(result); // => true

        System.out.println(stringE("Nonsense")); // => true
        System.out.println(stringE("This is nuts")); // => false
        System.out.println(stringE("This example contains nonsense")); // => false
    }
}