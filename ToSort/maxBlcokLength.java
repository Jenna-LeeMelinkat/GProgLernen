package ToSort;

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
public class maxBlcokLength {

    public static int maxBlockLength(String block) {
        int bLength = block.length();
        int count = 1;
        int currentBlockLength = 1;

        for (int i = 0; i < bLength - 1; i++) {
            if (block.charAt(i) == block.charAt(i + 1)) {
                currentBlockLength++;
                if (currentBlockLength > count) {
                    count = currentBlockLength;
                }
            } else {
                currentBlockLength = 1;
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