package Aufgaben.ZweiKlassen.Palindrom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    // Hilfsmethode zur Überprüfung, ob ein String ein Palindrom ist
    private static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static Map<String, Integer> palindrom(List<Person> persons) {
        Map<String, Integer> count = new HashMap<>();

        for (Person person : persons) {
            // Überprüfen, ob der Vorname ein Palindrom ist
            if (isPalindrome(person.vorname)) {
                String name = person.vorname;

                // Überprüfen, ob der Name bereits in der Map enthalten ist
                // Falls ja, erhöhe den Zähler um 1, ansonsten füge den Namen hinzu
                count.put(name, count.getOrDefault(name, 0) + 1);
            }
        }

        return count;
    }

    public static List<String> geburtstag(List<Person> persons) {
        List<String> liste = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        // Zähle die Anzahl der Personen pro Geburtsjahr
        for (Person person : persons) {
            map.put(person.geburtsjahr, map.getOrDefault(person.geburtsjahr, 0) + 1);
        }

        // Überprüfe, ob Personen mit Palindrom-Vornamen im gleichen Jahr geboren sind
        for (Person person : persons) {
            if (isPalindrome(person.vorname) && map.get(person.geburtsjahr) > 1) {
                String message = person.vorname + " " + person.nachname + " hat ein Palindrom als Vornamen und ist " + person.geburtsjahr + " geboren";
                if (!liste.contains(message)) {
                    liste.add(message);
                }
            }
        }

        return liste;
    }

    public static void main(String[] args) {

        // Erstellen von Personenliste
        List<Person> persons = List.of(
                new Person("Max", "Mustermann", 1990),
                new Person("Maren", "Musterfrau", 2002),
                new Person("Hannah", "Bühlow", 2002),
                new Person("Otto", "Maus", 1998),
                new Person("Anna", "Pünktchen", 2002),
                new Person("Berta", "Bohnenstange", 2002)
        );

        // Palindrome zählen
        Map<String, Integer> PersonenMitPalindrom = palindrom(persons);
        System.out.println(PersonenMitPalindrom); // => {Anna=1, Otto=1}

        // Personen mit palindromischen Vornamen im gleichen Jahr finden
        List<String> populars = geburtstag(persons);
        System.out.println(populars); // => [Anna Pünktchen hat ein Palindrom als Vornamen und ist 2002 geboren]
    }
}
