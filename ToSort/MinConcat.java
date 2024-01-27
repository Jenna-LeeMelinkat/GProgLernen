package ToSort;

/**
 *  ## Zeichenketten aneinander hängen
 *
 * Entwickeln Sie bitte eine Methode `minConcat()`,
 * die zwei Zeichenketten unterschiedlicher Länge
 * aneinander hängt. Dabei soll die längere der
 * beiden Zeichenketten auf die Länge der kürzeren
 * Zeichenkette gekürzt werden. Und zwar so, dass die ersten
 * Zeichen der längeren Zeichenkette nicht in das Resultat
 * übernommen werden.
 *
 * Beispielaufrufe finden Sie in der `main()`-Methode.
 *
 */
class MinConcat {

    public static String minConcat(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        if (aLength < bLength) {
            String shortB = b.substring(bLength - aLength);
            return a + shortB;
        } else if (bLength < aLength) {
            String shortA = a.substring(aLength - bLength);
            return shortA + b;
        } else if (aLength == bLength) {
            return a + b;
        }
        return null;
    }

    public static void main(String[] args) {

        String resultat = minConcat("Hello", "Hi");
        System.out.println(resultat); // => "loHi"

        System.out.println(minConcat("Hello", "java"));
        // => "ellojava"
        System.out.println(minConcat("java", "Hello"));
        // => "javaello"
    }
}
