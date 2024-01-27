package Map;

    import java.util.Map;
import java.util.HashMap;

    /**
     * ## [Leetspeech](https://de.wikipedia.org/wiki/Leetspeak)
     *
     * Leetspeak (oder 1337) bezeichnet im Netzjargon das Ersetzen
     * von Buchstaben durch ähnlich aussehende Ziffern sowie
     * Sonderzeichen. Die häufige Schreibweise 1337 für Leetspeak
     * entstand aus dem englischen Wort "Elite". Es wurde dabei erst
     * zu Eleet verballhornt und dann zu 'leet abgekürzt, was im
     * Leetspeak als 1337 geschrieben wird.
     *
     * Es gibt vielfältige Leetspeak-Ersetzungen, z.B.:
     *
     *      A=4    B=8    E=3    G=6
     *      L=1    O=0    P=9    S=5
     *      T=7    Z=2
     *
     * A=4 bedeutet bspw., dass alle Vorkommen von 'a' oder 'A'
     * durch die Ziffer 4 in einer Zeichenkette zu ersetzen wären,
     * denn 4 sieht ähnlich aus wie A.
     *
     * Mit der obigen Ersetzung würde "Hello World" zu "H3110 W0r1d".
     *
     * Entwickeln Sie nun bitte die folgenden Methoden für eine
     * effiziente Leetspeech-Verarbeitung:
     *
     * - `replacings()` soll Leetspeech-Ersetzungen aus einer
     *   Komma-separierten Zeichenkette erzeugen.
     * - Mit der Methode `leetspech()` sollen Leetspeech Ersetzungen
     *   dann auf Zeichenketten angewendet werden können.
     *
     * Aufrufbeispiele für beide Methoden finden Sie in der
     * `main()`-Methode. Aus diesen können Sie die Wirkungsweise
     * ableiten und generalisieren.
     *
     * __Hinweise:__
     *
     * - Die `split()`-Methode der Klasse `String` kann hilfreich sein.
     *
     */
    class BuchstabenDurchZahlenErsetzen__Map {

        public static Map<Character, String> replacings(String s) {
            Map<Character, String> map = new HashMap<>();
            if (s.isEmpty() || s.isBlank()) {
                return map;
            }
            String[] seperate = s.split(",");
            for (String element : seperate) {
                String[] getrennt = element.split("=");
                map.put(Character.toUpperCase(getrennt[0].trim().charAt(0)), getrennt[1].trim());
                map.put(Character.toLowerCase(getrennt[0].trim().charAt(0)), getrennt[1].trim());
            }
            return map;
        }

        public static String leetspeech(String s, Map<Character, String> m) {
            if (s.isEmpty() || s.isBlank()) {
                return s;
            }
            for (Character c : m.keySet()) {
                s = s.replaceAll(c.toString(), m.get(c));
            }
            return s;
        }

        public static void main(String[] args) {

            // Mit der Methode replacings() sollen Leetspeech-
            // Ersetzungen aus Komma-separierten Zeichenketten
            // erzeugt werden können.
            Map<Character, String> mappings = replacings(
                    "A=4,B=8,E=3,G=6,L=1,O=0,S=5,T=7,Z=2,"
            );
            System.out.println(mappings);
        /* Dies erzeugt folgende Mappingausgabe auf der Konsole
           (ohne Zeilenumbruch):
        {A=4, B=8, E=3, G=6, L=1, O=0, S=5, T=7, Z=2,
         a=4, b=8, e=3, g=6, l=1, o=0, s=5, t=7, z=2}
        */

            // Die Methode leetspeech() soll diese Ersetzungen
            // dann auf Zeichenketten anwenden.
            String leet = leetspeech("Elite speech", mappings);
            System.out.println(leet);
            // => 31i73 5p33ch
            System.out.println(leetspeech("Berlin", replacings("B=8,l=1")));
            // => 8er1in
            System.out.println(leetspeech("Wow", replacings("w=VV,O=0")));
            // => VV0VV
        }
    }

