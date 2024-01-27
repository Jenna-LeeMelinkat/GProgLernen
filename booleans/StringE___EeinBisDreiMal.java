package booleans;

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
class StringE___EeinBisDreiMal {

    public static Boolean stringE(String s) {
        s = s.toLowerCase();
        int laenge = s.length();

        int sOhneE = s.replaceAll("e", "").length();

        int differenz = laenge - sOhneE;

        return differenz >= 1 && differenz <= 3;
    }

    public static void main(String[] args) {
        boolean result = stringE("Earth");
        System.out.println(result); // => true

        System.out.println(stringE("Nonsense")); // => true
        System.out.println(stringE("This is nuts")); // => false
        System.out.println(stringE("This example contains nonsense")); // => false
    }
}