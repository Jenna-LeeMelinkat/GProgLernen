package booleans;

/**
 * ## Klammerungen prüfen mit `checkBrackets()`
 *
 * Eine vollständige Klammerung bedeutet: Jeder geöffneten Klammer
 * muss eine schließende Klammer folgen. Darüber hinaus müssen
 * die runden Klammern korrekt verschachtelt sein. Andere Zeichen
 * sind zu ignorieren.
 *
 * Schreiben Sie nun eine Methode `checkBrackets()`, die prüft, ob eine
 * Zeichenkette den oben angegebenenen Regeln einer vollständigen
 * Klammerung entspricht oder nicht.
 *
 */
public class KlammerAnfangUndEnde {

    public static boolean checkBrackets(String s) {
        int n = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                n++;
            } else if (c == ')') {
                n--;
                if (n < 0) {
                    return false;
                }
            }
        }

        return n == 0;
    }

    public static void main(String[] args) {

        boolean check = checkBrackets("()");
        System.out.println(check); // => true
        System.out.println(checkBrackets("(()(a)(()((c))))")); // => true

        System.out.println(checkBrackets(")(")); // => false
        System.out.println(checkBrackets("a (()())a)")); // => false
    }
}
