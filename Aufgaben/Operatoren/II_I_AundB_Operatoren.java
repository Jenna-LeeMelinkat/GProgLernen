package Aufgaben.Operatoren;

/**
 * 
 * ## Maximum bestimmen
 * 
 * Entwickeln Sie bitte eine Methode, die für zwei Integer-Werte
 * a und b, das Maximum von a und b liefert, wenn a oder b im Bereich
 * zwischen 10 und 20 (inklusive) liegen.
 * 
 * Andernfalls soll die Methode 0 zurückgeben.
 * 
 * Aufruf-Beispiele finden Sie in der `main()`-Methode.
 *
 * 
 */
public class II_I_AundB_Operatoren {

    public static int maxInRange(int a, int b) {
        int ergebnis = 0;

        boolean fuerA = (a <= 20 && a >= 10);
        boolean fuerB = (b <= 20 && b >= 10);

        if (fuerA && fuerB) {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        } else if(!fuerA && fuerB) {
            ergebnis += b;
        } else if(fuerA && !fuerB) {
            ergebnis += a;
        }
        return ergebnis;
    }

    public static void main(String[] args) {
        int r = maxInRange(11, 19);
        System.out.println(r); // => 19
        System.out.println(maxInRange(9, 11)); // => 11
        System.out.println(maxInRange(11, 9)); // => 11        
        System.out.println(maxInRange(21, 9)); // => 0    
        System.out.println(maxInRange(31, 15)); // => 15        
    }
}