package Aufgaben.ZweiKlassen.Räume;

/**
 * ## Räume
 *
 * Sie sollen nun eine Klasse `Room` anlegen, mit denen man
 * Räume verwalten kann, die dem Benennungsschema
 * der TH Lübeck entsprechen.
 *
 * Ein Raum liegt
 *
 * - in einem Gebäude,
 * - auf einer Etage
 * - und hat eine Raumnummer (< 100).
 *
 * Wie n()`-Räume angelegt und ausgegeben werden können,
 * lässt sich den Beispielen in der `maiMethode entnehmen.
 *
 * Ergänzend sollen Räume noch gem. Java Konventionen
 * inhaltlich verglichen und geklont werden können.
 *
 *
 * __Hinweise:__
 *
 * - Sehen Sie sich die relevanten Punkte in Unit 03 noch einmal an.
 * - Sehen Sie sich nochmal `Aufgaben.String.format()` in Unit 01 an.
 * - Implementieren Sie die Klasse Room in einer eigenen Datei (`Room.java`).
 *
 */
class MainRoom {

    public static void main(String[] args) {
        Room2 office = new Room2(17, 0, 10);
        Room2 lecture = new Room2(2, 0, 10);
        Room2 lab = new Room2(18, 1, 1);

        System.out.println(office);  // => "17-0.10"
        System.out.println(lecture); // => " 2-0.10"
        System.out.println(lab);     // => "18-1.01"
    }
}