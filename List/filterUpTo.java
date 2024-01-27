package List;

import java.util.*;

/**
 * Entwickeln Sie eine Methode,
 * die in einem Satz alle Worte bis
 * zu einer maximalen Länge
 * herausfiltert.
 */
public class filterUpTo {

    // Was geht rein?
    // Was kommt raus?
    // Wie heißt die Logik?

    // (1) Aggregat-Variable
    // [ggf. Guard-Conditions]
    // [ggf. Hilfsvariablen]
    // [ggf. Pre-Processing]
    // (3) Loop
    // (4) Logik
    // [ggf. Post-Processing]
    // (2) Return

    public static List<String> filterUpTo(int n, String s) {
        List<String> filtered = new ArrayList<>();
        for (String w : s.split(" +")) {
            if (w.length() < n) filtered.add(w);
        }
        return filtered;
    }

    public static void main(String[] args) {
        List<String> shorts = filterUpTo(4, "Dies ist nur ein Beispiel");
        System.out.println(shorts);
        // [ist, nur, ein]
    }
}

