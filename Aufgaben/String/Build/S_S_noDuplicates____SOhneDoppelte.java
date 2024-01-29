package Aufgaben.String.Build;

/**
 * ## Entferne alle mehrfachen Zeichen in einer Zeichenkette
 *
 * Entwickeln Sie bitte eine Methode `noDuplicates()`, die aus einer
 * beliebigen Zeichenkette eine neue Zeichenkette erzeugt, ohne
 * mehrfach direkt aufeinander folgende Zeichen zu übernehmen.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
public class S_S_noDuplicates____SOhneDoppelte {

    public static String noDuplicates(String s) {
        s = s.trim();
        int laenge = s.length();

        StringBuilder ergebnis = new StringBuilder();

        if (laenge > 0) {
            ergebnis.append(s.charAt(0));
        }

        for (int i = 1; i < laenge; i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                ergebnis.append(s.charAt(i));
            }
        }

        return ergebnis.toString();
    }

    public static void main(String[] args) {
        String result = noDuplicates("123aa bbbcc  c2589  99oppq rtyyy");
        System.out.println(result); // => 123a bc c2589 9opq rty
        System.out.println(noDuplicates("xxxabyyyycd")); // => "xabycd"
        System.out.println(noDuplicates("abc")); // => "abc"
    }
}