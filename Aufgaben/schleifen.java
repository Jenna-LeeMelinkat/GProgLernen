package Aufgaben;

public class schleifen {

    public static void nichts(){

//for Ausgabe der Zahlen von 1 bis 5
    for (int i = 1; i <= 5; i++) {
        System.out.println(i);
    }

//while Ausgabe der Zahlen von 1 bis 5
    int j = 1;
    while (j <= 5) {
        System.out.println(j);
        j++;
    }

// do while Ausgabe der Zahlen von 1 bis 5
    int k = 1;
    do {
        System.out.println(k);
        k++;
    } while (k <= 5);

//for each Ausgabe von Elementen eines Arrays
    int[] array = {1, 2, 3, 4, 5};
    for (int num : array) {
        System.out.println(num);
    }


//for X for  Multiplikationstabelle bis 5x5 ausgeben
    for (int row = 1; row <= 5; row++) {
       for (int col = 1; col <= 5; col++) {
           System.out.print(row * col + "\t");
       }
           System.out.println();
    }
    }
}
