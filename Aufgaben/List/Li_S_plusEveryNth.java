package Aufgaben.List;
import java.util.List;
import java.util.ArrayList;

public class Li_S_plusEveryNth {

    public static String plusEveryNth(List<Integer> numbers, int n) {
        int sum = 0;
        List<Integer> liste = new ArrayList<>();

        for (int i = n - 1; i < numbers.size(); i += n) {
            sum += numbers.get(i);
            liste.add(numbers.get(i));
        }

        StringBuilder ergebnis = new StringBuilder();

// Ausgabe der Liste mit Teilschritten
        ergebnis.append("Rechnung: ");
        for (int i = 0; i < liste.size(); i++) {
            ergebnis.append(liste.get(i));
            if (i < liste.size() - 1) {
                ergebnis.append(" + ");
            }
        }
        ergebnis.append(" = ").append(sum);

        return ergebnis.toString();
    }

    public static void main(String[] args) {
        // Beispiel: Erstellen einer Liste von Integern
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Festlegen des Wertes für n (n-tes Element)
        int n = 3;

        // Addiere jedes n-te Element in der Liste
        String result = plusEveryNth(numbers, n);

        // Ausgabe des Ergebnisses
        System.out.println(result);
    }
}