package Aufgaben.List;

import java.util.List;
import java.util.Arrays;

/*
balance() Summe zweier Teillisten

Entwickeln Sie nun bitte eine Methode namens balance(),
die den Index einer Liste von Integer-Werten bestimmt,
der den ersten Balancepunkt bestimmt.

Der Balancepunkt ist der Index,
der die Liste so in zwei Teillisten aufteilt,
dass die Summe zweier
Teillisten links und rechts vom Balancepunkt gleich sind.

Beispiel:
Gegeben sei die Liste [1,2,3,4,2].
Dann kann die Liste in zwei Listen [1,2,3] und [4,2] aufgeteilt werden,
sodass die Summe der Teilliste [1,2,3] und die Summe der Teilliste [4,2] jeweils 6 ergibt.
Der Balancepunkt wäre somit der IIndex 3!

- Sollte es keinen Balancepunkt geben, soll -1 zurückgegeben werden.
- Gibt es mehrere Balancepunkte, soll der mit dem kleinsten Index zurückgegeben werden

Weitere Aufrufbeispiele finden sich in der main()-Methode

Hinweis:
Sie dürfen natürlich Teilmethoden definieren (Dekomposition) und
Methoden wiederverwenden, die Sie an anderer Stelle in der Klausur
schon entwickelt haben.
 */

public class K_Li_I_Balance_Listenmitte_BeideSummenSelbe {

    public static int balance(List<Integer> liste){
        int summe = 0;

        for(int zahl : liste) {
            summe += zahl;
        }

        int linkeSumme = 0;

        for (int i = 0; i < liste.size(); i++) {
            int aktuelleZahl = liste.get(i);
            linkeSumme += aktuelleZahl;
            int rechteSumme = summe - linkeSumme;

            if (linkeSumme == rechteSumme) {
                return i + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,-1,3,2);
        int balanceIndex = balance(values);
        System.out.println(balanceIndex);
        // => 4 ( denn sum([1,2,3,-1]) = sum([3,2])

        System.out.println(balance(Arrays.asList(5,4)));
        // => -1 ( denn man kann [5,4] nicht so aufteilen, dass die Summe zweier Teillisten gleich sind)

        System.out.println(balance(Arrays.asList(5,4)));
        // => -1

    }

}
