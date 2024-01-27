package Notes.Map;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Mappi {

    public class MapExample {
        public static void main(String[] args) {
            // Map-Interface
            Map<String, Integer> hashMap = new HashMap<>();
            hashMap.put("Eins", 1);
            hashMap.put("Zwei", 2);

            System.out.println("HashMap: " + hashMap);


        //--------------------------------------------------

        // Wert abrufen
        int value = hashMap.get("Eins");
        System.out.println("Wert für 'Eins': " + value);

        // Eintrag entfernen
        hashMap.remove("Zwei");
        System.out.println("HashMap nach Entfernen: " + hashMap);


        //-------------------------------------------------------

            // For-each Schleife für Schlüssel und Werte
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }

            //-------------------------------------------------

            List<String> arrayList = new ArrayList<>();

            // Gruppierung nach Anfangsbuchstaben
            Map<Character, List<String>> groupedMap = new HashMap<>();
            for (String fruit : arrayList) {
                char firstChar = fruit.charAt(0);
                groupedMap.computeIfAbsent(firstChar, k -> new ArrayList<>()).add(fruit);
            }

            System.out.println("Gruppierte Map: " + groupedMap);

        }
    }

}
