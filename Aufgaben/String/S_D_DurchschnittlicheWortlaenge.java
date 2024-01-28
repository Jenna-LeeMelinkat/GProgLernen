package Aufgaben.String;

/**
 * Bestimmen Sie die durchschnittliche Wortlänge eines Satzes
 * mittels einer Methode.
 */
public class S_D_DurchschnittlicheWortlaenge {

    // 1. Was geht rein?
    // 2. Was kommt raus?
    // 3. Wie heißt die Logik?
    public static double average(String sentence) {
        int words = 0;                          // Hilfs-/Aggregatvariablen
        int length = 0;
        for (String w : sentence.split(" +")) { // Data loop
            length += w.length();               // Processing
            words++;
        }
        return (double)length / words;          // Return / Postprocessing
    }

    public static void main(String[] args) {
        String bsp = "Dies ist ein Beispiel";

        double avg = average(bsp);

        System.out.printf(
                "Alle Wörter haben eine durchschnittliche Wortlänge von %.2f Zeichen",
                avg
        );
    }
}

