package Aufgaben.Map;

import java.util.Map;
        import java.util.TreeMap;

/**
 * ## Toppings
 *
 * Sie sollen nun eine Methode `topping()` schreiben, die
 * für einen Bringdienst ein paar Bereinigungen auf Bestellungen
 * vornimmt.
 *
 * Bestellungen werden als `Aufgaben.Arrais.Map` codiert.
 *
 * - Taucht in der Bestellung `"ice cream"` auf, soll derselbe Wert auch für `"yoghurt"` gesetzt werden.
 * - Taucht in der Bestellung `"spinach"` auf, soll dieser Eintrag gelöscht werden (niemand mag Spinat).
 *
 * `topping()` soll die ursprüngliche Bestellung nicht modifizieren, sondern eine neue modifizierte
 * Bestellung erzeugen.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweis:__
 *
 * - Beachten Sie den Unterschied von Referenztypen und primitiven Datentypen.
 *
 */
class Mss_Mss_Topping___MapEintraegeAendern {

    public static Map<String, String> topping(Map<String, String> mss) {
        Map<String, String> map = new TreeMap<>();
        if (mss.isEmpty() || mss == null) {
            return map;
        }
        for (String s : mss.keySet()) {
            if (!s.equals("spinach") && !s.equals("yoghurt")) {
                map.put(s, mss.get(s));
            }
            if (s.equals("ice cream")) {
                if (mss.get("yoghurt") == null || mss.get("yoghurt").isEmpty()) {
                    map.put("yoghurt", mss.get(s));
                }

            }
            if (s.equals("yoghurt")) {
                String iceCreamValue = mss.get("ice cream");
                if (iceCreamValue == null || iceCreamValue.isEmpty() || iceCreamValue.isBlank()) {
                    map.put("yoghurt", mss.get(s));
                } else {
                    map.put("yoghurt", iceCreamValue);
                }
            }

        }

        return map;


    }

    public static void main(String[] args) {
        Map<String, String> order1 = new TreeMap<>();
        order1.put("ice cream", "cherry");

        Map<String, String> order2 = new TreeMap<>();
        order2.put("spinach", "dirt");
        order2.put("ice cream", "cherry");

        Map<String, String> order3 = new TreeMap<>();
        order3.put("yoghurt", "salt");

        System.out.println(topping(order1));
        // => { "ice cream"="cherry", "yoghurt"="cherry" }
        System.out.println(order1);
        // => { "ice cream"="cherry" }

        System.out.println(topping(order2));
        // => { "ice cream"="cherry", "yoghurt"="cherry" }
        System.out.println(order2);
        // => { "spinach"="dirt", "ice cream"="cherry" }

        System.out.println(topping(order3));
        // => { "yoghurt"="salt" }
        System.out.println(order3);
        // => { "yoghurt"="salt" }
    }
}