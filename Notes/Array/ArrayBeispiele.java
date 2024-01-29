package Notes.Array;
import java.util.ArrayList;
import java.util.Arrays;

import java.awt.image.LookupOp;

public class ArrayBeispiele {

    public static void mammut(String[] args) {
        // Beispiel für ein Array von ints
        int[] array = {5, 2, 9, 1, 7};

        // Sortieren des Arrays
        Arrays.sort(array);
        System.out.println("Sortiertes Array: " + Arrays.toString(array));

        // Binäre Suche im sortierten Array
        int index = Arrays.binarySearch(array, 9);
        System.out.println("Index von '9' im sortierten Array: " + index);

        String[] strings = {"Banane", "Apfel", "Orange"};

        // Sortieren der Strings im Array
        Arrays.sort(strings);
        System.out.println("Sortierte Strings: " + Arrays.toString(strings));

        // Binäre Suche nach einem String im sortierten Array
        int x = Arrays.binarySearch(strings, "Apfel");
        System.out.println("Index von 'Apfel' im sortierten Array: " + x);




    }



    ArrayList<String> namenListe = new ArrayList<String>();


// 1. Eindimensional---------------------------------------------------------------

    // Deklaration und Initialisierung eines eindimensionalen Arrays
    int[] numbers = new int[5];
    /*
    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = 3;
    numbers[3] = 4;
    numbers[4] = 5;
    */

    //---------------------------------------------------------
    // Deklaration und Initialisierung mit dem new-Operator
    int[] array1 = new int[5];

    // Deklaration und Initialisierung mittels direkter Angabe
    int[] array2 = {1, 2, 3, 4, 5};

    //------------------------------------------------------------
    int[] numberse = {10, 20, 30, 40, 50};
    int thirdNumber = numberse[2]; // Zugriff auf das dritte Element (Index 2)

    //------------------------------------------------------------
    int[] numbars = new int[5];
    //numbars[0] = 100;  Schreibt den Wert 100 an Index 0

//2. Zweidimensional-------------------------------------------------------------------

    // Deklaration und Initialisierung eines zweidimensionalen Arrays
    int[][] matrix = new int[3][3];
    /*
    matrix[0][0] = 1;
    matrix[0][1] = 2;
    // ...
    */

    //------------------------------------------------------------
    /*
    //Loop in Loop
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    // Iteration durch ein zweidimensionales Array

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }

    1 2 3
    4 5 6
    7 8 9
    */


}
