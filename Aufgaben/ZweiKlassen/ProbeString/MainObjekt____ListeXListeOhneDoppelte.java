package Aufgaben.ZweiKlassen.ProbeString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainObjekt____ListeXListeOhneDoppelte {

    public static List<Objekt> combine(List<String> uno, List<String> dos) {
        List<Objekt> ergebnis = new ArrayList<>();

        if (uno == null || dos == null) {
            return ergebnis;
        }

        for (String s1 : uno) {
            for (String s2 : dos) {
                Objekt o = new Objekt(s1.toLowerCase(), s2.toLowerCase());
                if (s1 != s2) {
                    ergebnis.add(o);
                }

            }
        }

        return ergebnis;

    }

    public static void main(String[] args) {
        // Aufgaben.ZweiKlassen.TupleListen.Tuple Erzeugung
        Objekt uno = new Objekt("Hello", "World");
        Objekt dos = new Objekt("Hallo", "Welt");

        // Combine-Beispiele
        List<String> l1 = Arrays.asList("A", "B", "C");
        List<String> l2 = Arrays.asList("A", "Y");
        List<Objekt> combinations = combine(l1, l2);
        System.out.println(combinations); // = [(A, X), (A, Y), (B, X), (B, Y), (C, X), (C, Y)]
        System.out.println(combine(l1, null)); //[]
    }
}
