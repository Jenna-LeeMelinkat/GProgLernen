package String.Build;
/**
 * ## zipZap
 *
 * Entwickeln Sie bitte eine Methode `zipZap()`, die in einer
 * beliebigen Zeichenkette nach Mustern wie "zip" und "zap" sucht.
 * Teilzeichenketten der Länge 3, die mit 'z' beginnen und mit 'p' enden,
 * sollen durch Zeichenketten der Länge 2 ersetzt werden, bei der der
 * mittlere Buchstabe wegfällt, so dass "zipXzap" "zpXzp" ergibt.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Verbote:__
 *
 * - Der Einsatz von `replaceAll()` ist verboten.
 *
 */
public class ZipZap {

    public static String zipZap(String s) {
        int sLength = s.length();
        if (sLength < 3) {
            return s;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sLength; i++) {
            if (s.charAt(i) == 'z' && s.charAt(i + 2) == 'p') {
                result.append('z').append('p');
                i = i + 2;
            } else {
                result.append(s.charAt(i));
            }
        }

        return result.toString();

    }

    public static void main(String[] args) {
        String zipZapped = zipZap("zipXzap");
        System.out.println(zipZapped); // => zpXzp
        System.out.println(zipZap("zopzop")); // => zpzp
        System.out.println(zipZap("zzzopzop")); // => zzzpzp
    }
}