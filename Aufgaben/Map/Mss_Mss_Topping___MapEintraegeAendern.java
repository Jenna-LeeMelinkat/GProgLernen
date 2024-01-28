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

    public static Map<String, String> topping(Map<String, String> ursprungsBestellung) {
        Map<String, String> neueBestellung = new TreeMap<>();
        if (ursprungsBestellung.isEmpty() || ursprungsBestellung == null) {
            return neueBestellung;
        }
        for (String s : ursprungsBestellung.keySet()) {
            if (!s.equals("spinach") && !s.equals("yoghurt")) {
                neueBestellung.put(s, ursprungsBestellung.get(s));
            }
            if (s.equals("ice cream")) {
                if (ursprungsBestellung.get("yoghurt") == null || ursprungsBestellung.get("yoghurt").isEmpty()) {
                    neueBestellung.put("yoghurt", ursprungsBestellung.get(s));
                }

            }
            if (s.equals("yoghurt")) {
                String iceCreamValue = ursprungsBestellung.get("ice cream");
                if (iceCreamValue == null || iceCreamValue.isEmpty() || iceCreamValue.isBlank()) {
                    neueBestellung.put("yoghurt", ursprungsBestellung.get(s));
                } else {
                    neueBestellung.put("yoghurt", iceCreamValue);
                }
            }

        }

        return neueBestellung;


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