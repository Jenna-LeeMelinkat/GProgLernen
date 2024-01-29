package Notes.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Maip {
    public static void main(String[] args) {
        Map<String, Integer> altersMap = new HashMap<>();

        // Schlüssel-Wert-Paare hinzufügen
        altersMap.put("Alice", 30);
        altersMap.put("Bob", 25);
        altersMap.put("Charlie", 35);

//put() Einen bestehenden Wert aktualisieren
        altersMap.put("Alice", 31);

        System.out.println(altersMap);

//get() Einen bestehenden Wert von Alice
        Integer alterswertVonAlice = altersMap.get("Alice");

        System.out.println("Alter von Alice: " + alterswertVonAlice);

// entrySet() verwenden, um über die Mapping-Einträge zu iterieren
        for (Map.Entry<String, Integer> eintrag : altersMap.entrySet()) {

            System.out.println(eintrag.getKey() + " ist " + eintrag.getValue() + " Jahre alt");
        }

// keySet() verwenden, um über die Schlüssel zu iterieren
        for (String name : altersMap.keySet()) {
            System.out.println(name);
        }

// values() verwenden, um über die Werte zu iterieren
        for (Integer alter : altersMap.values()) {
            System.out.println(alter);
        }

//getOrDefault()
        // Schlüssel abfragen, die in der Map vorhanden sind
        int alterswertAlice = altersMap.getOrDefault("Alice", 0);
        System.out.println("Das Alter von Alice ist: " + alterswertAlice); // Ausgabe: Das Alter von Alice ist: 30

        // Schlüssel abfragen, der nicht in der Map vorhanden ist
        int alterswertDavid = altersMap.getOrDefault("David", 0);
        System.out.println("Das Alter von David ist: " + alterswertDavid); // Ausgabe: Das Alter von David ist: 0, da "David" nicht in der Map vorhanden ist


    }

    public static void puff(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Banane");
        map.put(1, "Apfel");
        map.put(2, "Orange");

        // Konvertiere die Schlüssel der Map in eine sortierte Liste
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        System.out.println("Sortierte Schlüssel: " + keys);

        // Binäre Suche in der sortierten Liste der Schlüssel
        int index = Collections.binarySearch(keys, 2);
        System.out.println("Index von '2' in den sortierten Schlüsseln: " + index);
    }
}