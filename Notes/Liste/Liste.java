package Notes.Liste;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.Collections;


public class Liste {
    public class ListExample {
        public static void main(String[] args) {
            // Aufgaben.Arrais.List-Interface
            List<String> arrayList = new ArrayList<>();
            arrayList.add("Apfel");
            arrayList.add("Banane");

            List<Integer> linkedList = new LinkedList<>();
            linkedList.add(1);
            linkedList.add(2);

            System.out.println("ArrayList: " + arrayList);
            System.out.println("LinkedList: " + linkedList);


            //-------------------------------------------------

            // Fortsetzung des vorherigen Beispiels

            // Das Element an einem bestimmten Index abrufen
            String name = arrayList.get(2); // "Charlie"

// SubList erstellen
            List<String> subList = arrayList.subList(0, 1);
            System.out.println("SubList: " + subList);

// Element entfernen
            arrayList.remove(1);
            System.out.println("ArrayList nach Entfernen: " + arrayList);

// Element hinzufügen
            arrayList.add("Kirsche");
            System.out.println("ArrayList nach Hinzufügen: " + arrayList);

            //---------------------------------------------

            // For-each Schleife
            for (String fruit : arrayList) {
                System.out.println("Frucht: " + fruit);
            }

            //-----------------------------------------------


            // Filtern mit Stream API
            List<String> filteredList = arrayList.stream()
                    .filter(fruit -> fruit.startsWith("A"))
                    .collect(Collectors.toList());

            System.out.println("Gefilterte Liste: " + filteredList);

            //--------------------------------------------------------

            List<String> stringList = new ArrayList<>();
// Nur Strings erlaubt
            stringList.add("Hallo");
// stringList.add(42); // Kompilierungsfehler, da Integer nicht erlaubt ist

            //-----------------------------------------------------------

            // Iterator verwenden
            Iterator<String> iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                String fruit = iterator.next();
                System.out.println("Frucht: " + fruit);
            }

            //---------------------------------------------------
            //set

            List<String> list = new ArrayList<>();
            list.add("Apfel");
            list.add("Banane");
            list.add("Orange");

            System.out.println("Liste vor dem Setzen: " + list);

            // Das Element an Index 1 (Banane) wird durch "Kiwi" ersetzt
            list.set(1, "Kiwi");

            System.out.println("Liste nach dem Setzen: " + list);

            // Sortieren der Liste
            Collections.sort(list);
            System.out.println("Sortierte Liste: " + list);

            // Binäre Suche in der sortierten Liste
            int index = Collections.binarySearch(list, "Apfel");
            System.out.println("Index von 'Apfel' in der sortierten Liste: " + index);
        }

        }
    }

    /*
    List<String> liste = new ArrayList<>();
    String[] array = s.split("\\s");
    for (String element : array) {
    liste.add(element);

    List<String> liste = new ArrayList<>(Arrays.asList(s.split("\\s")));
}
     */





