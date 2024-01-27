package String.Build;

/**
 * ## Ein Passwort-Generator
 *
 * Schreiben Sie nun bitte eine Methode `pwdgen()` zum Generieren von
 * Passwörtern.
 *
 * - Passwörter sollen dabei aus einem Satz gebildet werden.
 * - Worte in dem Satz sind durch ein oder mehrere  Leerzeichen voneinander
 *   getrennt.
 * - Für jedes Wort soll abwechselnd der erste oder letzte Buchstabe des
 *   Wortes genommen werden.
 * - Die Anzahl an Worten soll an den Anfang des Passworts gesetzt werden.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Die String-Methode `split()` ist sicher hilfreich.
 * - Beachten Sie, dass Sätze mit Leerzeichen beginnen oder enden können.
 *
 * __Achtung:__ Ab sofort werden keine Methodenköpfe mehr vorgegeben.
 * Diese aus der Problemformulierung zu bestimmen, ist Teil der Aufgabe.
 *
 */
class pwdGen__6Dtnndl {

    public static String pwdgen(String s) {
        if (s == null || s.isEmpty() || s.isBlank()) {
            int uff = 0;
            return Integer.toString(uff);
        }

        String[] w = s.split("\\s+");

        int laenge = 0; // Zähler für die tatsächliche Anzahl von Wörtern

        StringBuilder ergebnis = new StringBuilder();

        for (int i = 0; i < w.length; i++) {
            if (!w[i].isEmpty()) {
                laenge++;
                String word = w[i].trim();
                if (laenge % 2 != 0) {
                    ergebnis.append(word.charAt(0)); // Fügt den ersten Buchstaben des Wortes hinzu
                } else {
                    ergebnis.append(word.charAt(word.length() - 1)); // Fügt den letzten Buchstaben des Wortes hinzu
                }
            }
        }

        // Hinzufügen der Anzahl der Wörter an den Anfang des Ergebnisses
        ergebnis.insert(0, laenge);

        return ergebnis.toString();
    }

    /*
    oder:

        public static String pwdgen(String s) {
        if (s == null || s.isEmpty() || s.isBlank()) {
            int uff = 0;
            return Integer.toString(uff);
        }

        String[] w = s.split("\\s+");


        int laenge = 0; // Zähler für die tatsächliche Anzahl von Wörtern
        String ergebnis = "";

        for (int i = 0; i < w.length; i++) {
            if (!w[i].isEmpty()) {
                laenge++;
                String word = w[i].trim();
                if (laenge % 2 != 0) {
                    ergebnis += word.charAt(0); // Fügt den ersten Buchstaben des Wortes hinzu
                } else {
                    ergebnis += word.charAt(word.length() - 1); // Fügt den letzten Buchstaben des Wortes hinzu
                }
            }
        }

        // Hinzufügen der Anzahl der Wörter an den Anfang des Ergebnisses
        ergebnis = laenge + ergebnis;

        return ergebnis;
    }
     */



    public static void main(String[] args) {
        String pwd = pwdgen("Dies ist nur ein doofes Beispiel");
        System.out.println(pwd); // => "6Dtnndl"
        System.out.println(pwdgen("a b c")); // => 3abc
    }
}