package String;

/**
 * ## Bestimme die Länge des längsten Blocks
 *
 * Unter einem Block verstehen wir mehrere aufeinander folgende gleiche Zeichen
 * in einer Zeichenkette (z.B. "aaa" in "xaaax" oder "bb" in "abbcde").
 *
 * Entwickeln Sie bitte eine Methode `maxBlockLength()`, die in einer
 * beliebigen Zeichenkette, die Länge des längsten Blocks bestimmt.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
public class maxBlockLength___Schleifen {

    public static int maxBlockLength(String s) {
        if (s == null || s.isEmpty() || s.isBlank()) {
            return 0;
        }
        int count = 1;
        int aL = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                aL++;
                if (aL > count) {
                    count = aL;
                }
            } else {
                aL = 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int block = maxBlockLength("abcXXXabc");
        System.out.println(block); // => 3
        System.out.println(maxBlockLength("xxxabyyyycd")); // => 4        
        System.out.println(maxBlockLength("abc")); // => 1
    }
}