package Aufgaben.Arrais;

import java.util.ArrayList;
import java.util.List;

/* in der Main Methode soll eine Liste mit Strings reinkommen
und die methode palindrome ausführen, die die liste mit strings
durchgeht und eine neue liste mit palindrom Strings ausgibt

 */

public class Ls_Ls_Palindrome {

    // Methode, um Palindrome in einer Liste zu finden und zurückzugeben
    public static List<String> palindrome(List<String> strings) {
        List<String> palindromeList = new ArrayList<>();

        // Durchlaufe jede Zeichenkette in der Liste
        for (String str : strings) {
            // Überprüfe, ob die Zeichenkette ein Palindrom ist
            if (isPalindrome(str)) {
                palindromeList.add(str); // Füge das Palindrom der Ergebnisliste hinzu
            }
        }

        return palindromeList; // Gib die Liste der Palindrome zurück
    }

    // Hilfsmethode zur Überprüfung, ob eine Zeichenkette ein Palindrom ist
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

    public static void main(String[] args) {
        // Beispiel: Erstellen einer Liste von Strings
        List<String> stringList = List.of("Anna", "Franz", "Lagerregal", "Ente", "Hannah", "Kajak");

        // Palindrome in der Liste finden
        List<String> palindromeList = palindrome(stringList);

        // Ausgabe der Palindrome
        System.out.println("Palindrome in der Liste:");
        for (String palindrome : palindromeList) {
            System.out.println(palindrome);
        }
    }
}
