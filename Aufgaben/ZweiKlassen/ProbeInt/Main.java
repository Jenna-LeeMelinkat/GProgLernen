package Aufgaben.ZweiKlassen.ProbeInt;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<Inti> combine(List<Integer> uno, List<Integer> dos) {
        List<Inti> ergebnis = new ArrayList<>();

        if (uno == null || dos == null) {
            return ergebnis;
        }

        for (int i1 : uno) {
            for (int i2 : dos) {
                int sum = i1 + i2;
                Inti inti = new Inti(i1, sum); // Neues Inti-Objekt erstellen
                ergebnis.add(inti); // Inti-Objekt zur Ergebnisliste hinzufügen

            }
        }

        return ergebnis;

    }

    public static void main(String[] args) {
        // Aufgaben.ZweiKlassen.TupleListen.Tuple Erzeugung
        Inti uno = new Inti(5, 6);
        Inti dos = new Inti(5, 6);

        // Combine-Beispiele
        List<Integer> l1 = Arrays.asList(5, 2, 1);
        List<Integer> l2 = Arrays.asList(5, 4);
        List<Inti> combinations = combine(l1, l2);
        System.out.println(combinations); // = [(A, X), (A, Y), (B, X), (B, Y), (C, X), (C, Y)]
        System.out.println(combine(l1, null)); //[]
    }
}
