package Aufgaben.ZweiKlassen.Äpfel;

import java.util.*;

/**
 * Apfelernte:

 * Entwickeln Sie auf Basis der gegebenen Klasse Apple folgende Methoden:
 *
 * - harvest()      (soll eine Liste zufälliger Äpfel erzeugen)
 * - filter()       (soll Äpfel einer Farbe selektieren)
 * - countByColor() (soll Äpfel anhand der Farbe zählen)
 * - groupByColor() (soll Äpfel anhand ihrer Farbe gruppieren)
 *
 * Beispielaufrufe finden Sie in der Main-Methode.
 * Wenden Sie zur Entwicklung der Methoden gerne unsere Checkliste an.
 *
 */
public class MainApple {

    // harvest() GENERATOR - PATTERN
    public static List<Apple> harvest(int n) {
        List<Apple> apples = new ArrayList<>();                        // Aggregat
        while (n-- > 0) apples.add(new Apple());                       // Loop + Logik
        return apples;                                                 // Return
    }

    // filter() FILTER - PATTERN
    public static List<Apple> filter(String color, List<Apple> apples) {
        List<Apple> filtered = new ArrayList<>();                      // Aggregat
        for (Apple a : apples) {                                       // Loop
            if (a.color.equals(color)) filtered.add(a);                // Logik
        }
        return filtered;                                               // Return
    }

    // countByColor() COUNTING - PATTERN
    public static Map<String, Integer> countByColor(List<Apple> apples) {
        Map<String, Integer> counted = new TreeMap<>();                // Aggregat
        for (Apple a : apples) {                                       // Loop
            counted.put(a.color, counted.getOrDefault(a.color, 0) + 1);// Logik
        }
        return counted;                                                // Return
    }

    // groupByColor() GROUPING - PATTERN
    public static Map<String, List<Apple>> groupByColor(List<Apple> apples) {
        Map<String, List<Apple>> gmap = new TreeMap<>();             // Aggregat
        for (Apple a : apples)
            gmap.put(a.color, new ArrayList<>()); // Preprocessing
        for (Apple a : apples)
            gmap.get(a.color).add(a);             // Loop + Logik
        return gmap;                                                 // Return
    }

    public static void main(String[] args) {
        Apple a = new Apple();
        System.out.println(a);

        List<Apple> apples = harvest(10);
        System.out.println(apples);
        // => Liste von 25 Äpfeln

        List<Apple> filtered = filter("green", apples);
        System.out.println(filtered);
        // => Liste nur grüner Äpfel

        Map<String, Integer> counted = countByColor(apples);
        System.out.println(counted);
        // => z.B. { red=1, green=4, yellow=2, brown=4 }

        Map<String, List<Apple>> grouped = groupByColor(apples);
        System.out.println(grouped);
        // => { red=[Liste roter Äpfel], green=[Liste grüner Äpfel], yellow=... }
    }
}
