package ZweiKlassen.Personen;

import java.util.*;

/**
 * 
 * ## Bestimmung beliebter Vornamen
 * 
 * Gegeben sei die Klasse `ZweiKlassen.Personen.Person`. Eine `ZweiKlassen.Personen.Person` hat
 * 
 * - einen Vornamen,
 * - und einen Nachnamen.
 * 
 * Wie `ZweiKlassen.Personen.Person`en angelegt und ausgegeben werden können,
 * lässt sich den Beispielen in der `main()`-Methode entnehmen.
 * 
 * 1. Entwicklen Sie nun bitte eine Methode `countNames()`, die
 *    die Häufigkeit aller Vornamen in einer Liste von `ZweiKlassen.Personen.Person`en
 *    bestimmt.
 * 2. Entwickeln Sie ferner eine Methode `mostPopularNames()`
 *    die aus einer Liste von `Personen die beliebtesten Vornamen
 *    bestimmt. Die beliebtesten Vornamen sind die Vornamen,
 *    die am häufigsten in einer Liste von `Personen vorkommen.
 * 
 * Beachten Sie, dass es durchaus vorkommen kann, dass mehrere
 * Vornamen gleich häufig vorkommen können. Daher sollen Vornamen
 * als alphabetisch sortierte Liste zurückgegeben werden.
 * 
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * 
 */
class Person____MapMostPopular {

    public static Map<String, Integer> countNames(List<Person> persons) {
        Map<String, Integer> countedNames = new HashMap<>();

        for (Person person : persons) {
            String vorname = person.vorname;
            countedNames.put(vorname, countedNames.getOrDefault(vorname, 0) + 1);
        }

        // Sortieren der Map nach der Häufigkeit der Vornamen
        Map<String, Integer> sortierteMap = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> eintrag : countedNames.entrySet()) {
            // Wenn die sortierte Map leer ist, füge den Eintrag einfach hinzu
            if (sortierteMap.isEmpty()) {
                sortierteMap.put(eintrag.getKey(), eintrag.getValue());
            } else {
                boolean eingefügt = false;

                // Durchlaufe die sortierte Map, um den richtigen Einfügepunkt zu finden
                for (Map.Entry<String, Integer> sortierterEintrag : sortierteMap.entrySet()) {
                    if (eintrag.getValue() < sortierterEintrag.getValue()) {
                        // Füge den Eintrag an der richtigen Stelle ein
                        Map<String, Integer> tempMap = new LinkedHashMap<>();
                        for (Map.Entry<String, Integer> e : sortierteMap.entrySet()) {
                            if (e.getKey().equals(sortierterEintrag.getKey())) {
                                tempMap.put(eintrag.getKey(), eintrag.getValue());
                                eingefügt = true;
                            }
                            tempMap.put(e.getKey(), e.getValue());
                        }
                        if (!eingefügt) {
                            tempMap.put(eintrag.getKey(), eintrag.getValue());
                        }
                        sortierteMap.clear();
                        sortierteMap.putAll(tempMap);
                        break;
                    }
                }
                // Wenn der Eintrag größer als alle bisherigen ist, am Ende einfügen
                if (!eingefügt) {
                    sortierteMap.put(eintrag.getKey(), eintrag.getValue());
                }
            }
        }

        return sortierteMap;

        /* Sortieren der Map nach der Häufigkeit der Vornamen
        Map<String, Integer> sortierteMap = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> eintrag : countedNames.entrySet()) {
            boolean eingefügt = false;

            // Durchlaufen der sortierten Map, um den richtigen Einfügepunkt zu finden
            for (Map.Entry<String, Integer> uff : sortierteMap.entrySet()) {
                // Eintrag an der richtigen Stelle einfügen
                if (eintrag.getValue() < uff.getValue()) {
                    sortierteMap.put(eintrag.getKey(), eintrag.getValue());
                    eingefügt = true;
                    break;
                }
            }

            // Wenn der Eintrag größer als alle bisherigen ist, am Ende einfügen
            if (!eingefügt) {
                sortierteMap.put(eintrag.getKey(), eintrag.getValue());
            }
        }

        return sortierteMap;

        /*
        countedNames.entrySet()
                // Verwende die Stream-API, um die Einträge der Map zu durchlaufen

                .stream()
                //wandelt um in Stream von Map.Entry-Objekten
                // repräsentiert einen Schlüssel-Wert-Paar in der Map.

                .sorted(Map.Entry.comparingByValue())
                //absteigende Reihenfolge: .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                // Sortiere die Einträge nach dem Wert (der Häufigkeit) in aufsteigender Reihenfolge

                .forEachOrdered(entry -> sortedMap.put(entry.getKey(), entry.getValue()));
                // Füge die sortierten Einträge in die neue LinkedHashMap ein, um die Reihenfolge beizubehalten


        return sortedMap;

         */
    }

    public static List<String> mostPopularNames(List<Person> persons) {
        Map<String, Integer> nameCounts = countNames(persons);
        List<String> populars = new ArrayList<>();
        int count = 0;

        for (int mapCount : nameCounts.values()) {
            if (mapCount > count) {
                count = mapCount;
            }
        }

        for (Map.Entry<String, Integer> entry : nameCounts.entrySet()) {
            if (entry.getValue() == count) {
                populars.add(entry.getKey());
            }
        }

        Collections.sort(populars);

        return populars;
    }

    public static void main(String[] args) {
        Person p = new Person("Max", "Mustermann");
        Person q = new Person("Maren", "Musterfrau");

        System.out.println(p); // => Max Mustermann
        System.out.println(q); // => Maren Musterfrau

        List<Person> persons = Arrays.asList(
            new Person("Max", "Mustermann"),
            new Person("Maren", "Musterfrau"),
            new Person("Max", "Bühlow"),
            new Person("Maren", "Maus"),
            new Person("Anton", "Pünktchen"),
            new Person("Berta", "Bohnenstange")
        );
        Map<String, Integer> count = countNames(persons);
        System.out.println(count); // => {Anton=1, Berta=1, Maren=2, Max=2}

        List<String> populars = mostPopularNames(persons);
        System.out.println(populars); // => [Maren, Max]
    }
}