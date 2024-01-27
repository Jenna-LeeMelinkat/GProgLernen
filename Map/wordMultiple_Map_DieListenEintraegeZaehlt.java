package Map;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;


/**
 *
 * ## `wordMultiple()`
 *
 * Gegeben sei eine Liste von Strings. Entwickeln Sie eine Methode `wordMultiple()`, die
 * mittels einer Map kenntlich macht, welche der Zeichenketten mehrmals in der
 * Liste von Strings vorkommt. Leere Zeichenketten sollen nicht berücksichtigt werden.
 *
 * Aufruf-Beispiele finden Sie in der `main()`-Methode.
 *
 */

public class wordMultiple_Map_DieListenEintraegeZaehlt {

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
        List<String> list = Arrays.asList("a", "b", "", "d", "c", "a", "c", "b");
        Map<String, Boolean> multiple = wordMultiple(list);
        System.out.println(multiple);
    }
}


