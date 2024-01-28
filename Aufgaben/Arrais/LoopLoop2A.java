package Aufgaben.Arrais;

public class LoopLoop2A {
    public static void main(String[] args) {
        // Ein 2D-String-Array erstellen
        String[][] namenArray = {
                {"Alice", "Bob", "Charlie"},
                {"David", "Emma", "Frank"},
                {"Grace", "Henry", "Ivy"}
        };

        // Loop-in-Loop-Konstrukt für die Iteration über das String-Array
        for (int i = 0; i < namenArray.length; i++) { // Äußere Schleife für die Zeilen
            for (int j = 0; j < namenArray[i].length; j++) { // Innere Schleife für die Spalten
                System.out.print(namenArray[i][j] + " "); // Wert des aktuellen Elements ausgeben
            }
            System.out.println(); // Neue Zeile für den nächsten Zeilendurchlauf
        }
    }
}

/*
In diesem Array gibt es drei Zeilen und drei Spalten.

Die Zeilen sind die horizontalen Gruppen von Elementen:
{Alice, Bob, Charlie}, {David, Emma, Frank}, und {Grace, Henry, Ivy}.

Die Spalten sind die Elemente in jeder dieser horizontalen Gruppen:
In der ersten Zeile haben wir die Spalten {Alice}, {Bob}, und {Charlie};
in der zweiten Zeile haben wir die Spalten {David}, {Emma}, und {Frank};
und in der dritten Zeile haben wir die Spalten {Grace}, {Henry}, und {Ivy}.

 */