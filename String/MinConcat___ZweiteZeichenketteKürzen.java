package String;

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
class MinConcat___ZweiteZeichenketteKürzen {

    public static String minConcat(String a, String b) {
        int aL = a.length();
        int bL = b.length();

        if (aL < bL) {
            b = b.substring(bL - aL);
        } else if (aL > bL) {
            a = a.substring(aL - bL);
        }
        return a + b;

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
