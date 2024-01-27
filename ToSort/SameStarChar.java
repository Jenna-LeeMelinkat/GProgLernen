package ToSort;

/**
 * ## Zeichenketten prüfen mittels `sameStarChar()`
 *
 * Entwickeln Sie nun bitte eine Methode `sameStarChar()`, die 
 * für eine Zeichenkette prüft, ob bei allen '*' Zeichen, 
 * das jeweils linke und rechte gleich sind.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweis:__
 *
 * - Achten Sie auf Sonderfälle wie beginnende und abschließende `'*'`-Zeichen.
 * - Was passiert bspw. bei Zeichenketten wie `"*"`, `"**"` oder `"***"`?
 *
 */
class SameStarChar {

    public static boolean sameStarChar(String str) {
        if (str.length() < 3) {
            return true;
        }

        if (str.isEmpty() || str.equals("*")) {
            return true;
        }

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return str.charAt(0) != '*' && str.charAt(str.length() - 1) != '*';

    }

    public static void main(String[] args) {
        boolean result = sameStarChar("xy*yzz");
        System.out.println(result); // => true
        System.out.println(sameStarChar("xy*zzz")); // => false
        System.out.println(sameStarChar("*xa*az")); // => false
    }
}