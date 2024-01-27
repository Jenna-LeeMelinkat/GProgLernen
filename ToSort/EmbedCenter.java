package ToSort;

/**
 * ## Zeichenketten klammern
 *
 * Schreiben Sie eine Methode `embedCenter()`, die eine payload Zeichenkette in die
 * Mitte einer anderen Klammer-Zeichenkette setzt.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Beachten Sie Sonderfälle wie leere Klammer und Payload Zeichenketten.
 * - Denken Sie über den Einsatz folgender String-Methoden nach.
 *   Die Wirkungsweise finden Sie im Handout der Unit 02 oder unter diesem
 *   [API Link](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html).
 * - `substring()`
 * - `length()`
 *
 */
class EmbedCenter {

    public static String embedCenter(String embed, String payload) {
        int embedLength = embed.length();
        int center = embedLength / 2;
        String firstHalf = embed.substring(0, center);
        String secondHalf = embed.substring(center);
        return firstHalf + payload + secondHalf;

    }


    public static void main(String[] args) {
        System.out.println(embedCenter("<<>>", "Yay")); // => <<Yay>>
        System.out.println(embedCenter("()", "Yay")); // => (Yay)
        System.out.println(embedCenter(":-)", "Example")); // :Example-)
    }
}

