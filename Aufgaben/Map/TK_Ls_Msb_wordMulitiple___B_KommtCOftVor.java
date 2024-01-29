package Aufgaben.Map;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;


/**
 *
 * ## `wordMultiple()`
 *
 * Gegeben sei eine Liste von Strings. Entwickeln Sie eine Methode `wordMultiple()`, die
 * mittels einer Aufgaben.Arrais.Map kenntlich macht, welche der Zeichenketten mehrmals in der
 * Liste von Strings vorkommt. Leere Zeichenketten sollen nicht berücksichtigt werden.
 *
 * Aufruf-Beispiele finden Sie in der `main()`-Methode.
 *
 */

public class TK_Ls_Msb_wordMulitiple___B_KommtCOftVor {

    public static Map<String, Boolean> wordMultiple(List<String> l) {
        Map<String, Boolean> map = new HashMap<>();

        for (String s : l) {
            if (!s.isEmpty() || !s.isBlank()) {
                if (map.containsKey(s)){
                    map.put(s, true);
                } else {
                    map.put(s, false);
                }
            }

        }

        return map;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "a", "c", "b");
        Map<String, Boolean> multiple = wordMultiple(list);
        System.out.println(multiple);
        // => { "a": true, "b": true, "c": false }

        list = Arrays.asList("c", "b", "a");
        System.out.println(wordMultiple(list));
        // => { "a": false, "b": false, "c": false }

        list = Arrays.asList("c", "c", "c");
        System.out.println(wordMultiple(list));
        // => { "c": true }
    }
}


