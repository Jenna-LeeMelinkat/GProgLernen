package ToSort;

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
class pwdGen {

    public static String pwdgen(String input) {
        if (input.isEmpty()) {
            int w = 0;
            return Integer.toString(w);
        }
        String[] words = input.trim().split(" ");
        int wordCount = words.length;
        StringBuilder password = new StringBuilder();
        password.append(wordCount);

        for (int i = 0; i < wordCount; i++) {
            String word = words[i];
            if (!word.isEmpty()) {
                if (i == 0) {
                    password.append(word.charAt(0));
                } else {
                    if (i % 2 == 1) {
                        password.append(word.charAt(word.length() - 1));
                    } else {
                        password.append(word.charAt(0));
                    }
                }
            }
        }
        return password.toString();
    }



    public static void main(String[] args) {
        String pwd = pwdgen("Dies ist nur ein doofes Beispiel");
        System.out.println(pwd); // => "6Dtnndl"
        System.out.println(pwdgen("a b c")); // => 3abc
    }
}