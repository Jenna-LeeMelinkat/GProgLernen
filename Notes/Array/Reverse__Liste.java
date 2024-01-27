package Notes.Array;

import java.util.*;

/**
 * Erzeugen Sie aus einer Liste eine neue Liste,
 * indem die Abfolge aller Elemente des Ursprungsliste
 * umgedreht wird. Setzen Sie einen Iterator ein!
 */
public class Reverse__Liste {

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

    public static List<String> reverse(List<String> data) {
        List<String> reversed = new ArrayList<String>();
        Iterator<String> it = data.iterator();
        while (it.hasNext()) reversed.add(0, it.next());
        return reversed;
    }

    public static void main(String[] args) {
        List<String> data = Arrays.asList("Dies", "ist", "nur", "ein", "Beispiel");
        System.out.println(data);
        // [Dies, ist, nur, ein, Beispiel]

        List<String> reversed = reverse(data);
        System.out.println(data);
        System.out.println(reversed);
        // [Dies, ist, nur, ein, Beispiel]
        // [Beispiel, ein, nur, ist, Dies]
    }
}
