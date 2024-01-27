package ZweiKlassen.TShirts;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * ## Shirts
 * 
 * Gegeben sei die Klasse `ZweiKlassen.TShirts.Shirt`. Ein ZweiKlassen.TShirts.Shirt hat
 * 
 * - eine Größe (XS, S, M, L, XL, etc.),
 * - und eine Farbe ("rot", "grün", "blau", "gelb", etc.).
 * 
 * Wie `ZweiKlassen.TShirts.Shirt`s angelegt und ausgegeben werden können,
 * lässt sich den Beispielen in der `main()`-Methode entnehmen.
 * Es ist ferner eine Methode `factory()` gegeben, die eine Liste von
 * *n* zufälligen `ZweiKlassen.TShirts.Shirt`s erzeugen kann.
 * 
 * 1. Ergänzen Sie die gegebene Klasse `ZweiKlassen.TShirts.Shirt` gem. Java-Konventionen so,
 *    dass Objekte, wie in der `main()`-Methode exemplarisch gezeigt, ausgegeben
 *    werden können.
 * 2. Ergänzen Sie ferner gem. Java-Konventionen getter() Methoden,
 *    die es erlauben aus `ZweiKlassen.TShirts.Shirt`-Objekten Farbe und Größe auszulesen.
 * 3. Entwickeln Sie ferner eine Methode `countColors()`,
 *    die zählt, wie viele `ZweiKlassen.TShirts.Shirt`s einer Farbe in einer List von `ZweiKlassen.TShirts.Shirt`s vorkommen.
 * 
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * 
 */
class MainShirt____VorkommenNachFarben__Liste_Map_String_Integer {

    public static Map<String, Integer> countColors(List<Shirt> shirts){
        Map<String, Integer> ergebnis = new HashMap<>();
        for (Shirt shirt : shirts) {
            String color = shirt.getColor();
            ergebnis.put(color, ergebnis.getOrDefault(color, 0) + 1);
        }
        return ergebnis;
    }



    // gegeben
    public static List<Shirt> factory(int n) {
        List<Shirt> shirts = new ArrayList<>();
        String[] sizes = {"XS", "S", "M", "L", "XL"};
        String[] colors = {"rot", "grün", "blau"};
        while (n-- > 0) {
            String s = sizes[(int)(Math.random() * sizes.length)];
            String c = colors[(int)(Math.random() * colors.length)];
            shirts.add(new Shirt(s, c));
        }
        return shirts;
    }

    public static void main(String[] args) {
        Shirt s1 = new Shirt("XS", "rot");
        Shirt s2 = new Shirt("L", "grün");

        System.out.println(s1); // => "rotes XS-ZweiKlassen.TShirts.Shirt"
        System.out.println(s2); // => "grünes L-ZweiKlassen.TShirts.Shirt"

        List<Shirt> shirts = factory(10);
        Map<String, Integer> colors = countColors(shirts);
        System.out.println(colors); // => z.B. {blau=1, gelb=3, grün=2, rot=1, schwarz=3}

    }
}