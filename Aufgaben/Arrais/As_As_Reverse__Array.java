package Aufgaben.Arrais;

import java.util.Arrays;

/**
 * Erzeugen Sie aus einem Array ein neues Array,
 * indem die Abfolge aller Elemente des Ursprungsarrays
 * umgedreht wird.
 */
public class As_As_Reverse__Array {

    // Your turn
    public static String[] reverse(String[] array) {
        String[] reversed = new String[array.length];
        int n = array.length;
        for (String w : array) reversed[--n] = w;
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
