package Notes.Array;

/**
 * Bestimmen Sie das kleinste Element in einem 2D-Array.
 */
public class KleinstesElement_2D {

    // 1. Was geht rein?
    // 2. Was kommt raus?
    // 3. Wie heißt die Logik?
    public static int smallest(int[][] data) {
        // (1) Aggregatvariable
        int x = data[0][0];

        // (3) Data loop(s)
        for (int[] zeile : data) {
            for (int spalte : zeile) {
                // (4) Processing
                x = spalte < x ? spalte : x;
            }
        }

        // (2) Return, ggf. anpassen nach 6)
        return x;
    }

    public static void main(String[] args) {
        int[][] data = {
                { 1, 2, 3, 4, 5 },
                { 10, 20, -10, 4, 8, 9 },
                { 100, 1, -1 }
        };

        int x = smallest(data);
        System.out.println(x);
        // => 10
    }
}


