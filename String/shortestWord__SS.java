package String;

/**
 * Kapseln Sie bitte diese Bestimmung eines kürzesten Wortes
 * in einer Methode shortestWord().
 */
public class shortestWord__SS {

    // Was geht rein?
    // Was kommt raus?
    // Wie heißt die parametrisierte Logik?

    // => Your turn!
    public static String shortestWord(String content) {
        String[] words = content.split(" ");
        String shortest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) shortest = word;
        }

        return shortest;
    }

    public static void main(String[] args) {
        String bsp = "Dies ist nur so ein Beispiel";

        /* Beginn der foreach Variante ein kürzestes Word zu finden.
        String[] words = bsp.split(" ");
        String shortest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) shortest = word;
        }
        // Ende der Variante*/

        String kuerzestesWort = shortestWord(bsp);

        System.out.printf(
                "Das kürzeste Wort in '%s' lautet '%s'.",
                bsp, kuerzestesWort
        );
    }
}

