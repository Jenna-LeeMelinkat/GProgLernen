package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/*

Implementieren Sie eine Java-Methode namens split,
die eine gegebene Liste von Ganzzahlen
an einem bestimmten Index aufteilt.
Die Aufteilung erfolgt je nach einer
Richtungsanweisung entweder vor oder nach dem angegebenen Index.
 */

public class Liste_LinksOderRechts_Ausgeben {

    public static List<Integer> split(List<Integer> liste, int zahl, boolean ja){
        List<Integer> ergebnis = new ArrayList<>();

        if(ja) {
            for(int i = zahl; i < liste.size(); i++) {
                ergebnis.add(liste.get(i));
            }
        } else {
            for (int i = 0; i < zahl; i++) {
                ergebnis.add(liste.get(i));
            }
        }
        return ergebnis;
    }

    public static void main(String[] args) {
        List<Integer> examples = Arrays.asList(1,2,3,4,5);
        List<Integer> head = split(examples, 2, false);
        System.out.println(head); // => [1,2]

        List<Integer> tail = split(examples,2,true);
        System.out.println(tail); // => [3,4,5]

        System.out.println(split(examples,4,false));
        System.out.println(split(examples,4,true));

        System.out.println(split(examples,5,false));
        System.out.println(split(examples,5,true));

    }

}
