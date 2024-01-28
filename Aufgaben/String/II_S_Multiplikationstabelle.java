package Aufgaben.String;

/**
 * Erstellen Sie eine Methode zur Erzeugung
 * von Multiplikationstabellen.
 */
public class II_S_Multiplikationstabelle {

    // 1. Was geht rein?
    // 2. Was kommt raus?
    // 3. Wie heißt die Logik?
    public static String mulTable(int zeilen, int spalten) {
        String out = "";                            // Aggregatvariable

        for (int z = 1; z <= zeilen; z++) {         // Data Loop
            for (int s = 1; s <= spalten; s++) {
                out += String.format("%4d", z * s); // Logik (Spaltenformatierung)
            }
            out += "\n";                            // Logik (Zeilenende)
        }

        return out;                                 // Return
    }

    public static void main(String[] args) {
        String out = mulTable(3, 3);
        System.out.println(out);
        /*
           1   2   3
           2   4   6
           3   6   9
        */

        System.out.println(mulTable(4, 5));
        /*
           1   2   3   4    5
           2   4   6   8   10
           3   6   9  12   15
           4   8  12  16   20
        */

    }
}


