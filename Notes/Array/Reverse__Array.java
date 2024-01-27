package Notes.Array;

import java.util.Arrays;

/**
 * Erzeugen Sie aus einem Array ein neues Array,
 * indem die Abfolge aller Elemente des Ursprungsarrays
 * umgedreht wird.
 */
public class Reverse__Array {

    // Your turn
    public static String[] reverse(String[] data) {
        String[] reversed = new String[data.length];
        int n = data.length;
        for (String w : data) reversed[--n] = w;
        return reversed;
    }

    public static void main(String[] args) {
        String[] data = { "Dies", "ist", "nur", "ein", "Beispiel" };
        System.out.println(Arrays.toString(data));
        // [Dies, ist, nur, ein, Beispiel]

        String[] reversed = reverse(data);
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(reversed));
        // [Dies, ist, nur, ein, Beispiel]
        // [Beispiel, ein, nur, ist, Dies]
    }
}
