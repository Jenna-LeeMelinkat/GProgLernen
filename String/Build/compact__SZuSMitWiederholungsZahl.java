package String.Build;

/**
 * ## Komprimiere alle mehrfachen Zeichen in einer Zeichenkette
 *
 * Unter einem Block verstehen wir eine Folge gleicher Zeichen,
 * z.B. "aaaa". Blöcke mit mehr als einem Zeichen, können kompakt
 * dargestellt werden, indem nur das Zeichen und die Wiederholung
 * angegeben wird (die Kompaktschreibweise für "aaaa" wäre "a4").
 *
 * Blöcke der Länge 1 werden nicht in Kompaktschreibweise notiert
 * ("a" wird also nie zu "a1").
 *
 * Entwickeln Sie bitte eine Methode `compact()`, die aus einer
 * beliebigen Zeichenkette eine neue Zeichenkette erzeugt, indem
 * alle Blöcke (z.B. "aaaa") kompakt dargestellt werden.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
public class compact__SZuSMitWiederholungsZahl {

    public static String compact(String s) {
        if (s.isEmpty()) {
            return s;
        }
        StringBuilder ergebnis = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                if (count >= 1) {
                    ergebnis.append(s.charAt(i)).append(count + 1);
                } else {
                    ergebnis.append(s.charAt(i));
                }

                count = 0;
            }
        }
        if (count >= 1) {
            ergebnis.append(s.charAt(s.length() - 1)).append(count + 1);
        } else {
            ergebnis.append(s.charAt(s.length() - 1));
        }
        return ergebnis.toString();
    }

    public static void main(String[] args) {
        String result = compact("123aabbbccc258999oppqrtyyy");
        System.out.println(result); // => 123a2b3c325893op2qrty3
        System.out.println(compact("xxxabyyyycd")); // => "x3aby4cd"
        System.out.println(compact("abc")); // => "abc"
    }
}