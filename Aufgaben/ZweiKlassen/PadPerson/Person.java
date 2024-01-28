package Aufgaben.ZweiKlassen.PadPerson;

public class Person {

    // Instanzvariablen
    public String vorname;
    public String nachname;
    public int geburtsjahr;

    // Klassenvariablen
    public static int TOTAL;        // static => Klassenvariable
    public int lfdNr;               // kein static => objektbezogenes Datenfeld

    // Konstruktor
    public Person(String vn, String nn, int geb) {

        // Initialisierung der Instanzvariablen mit den übergebenen Werten
        this.vorname = vn;
        this.nachname = nn;
        this.geburtsjahr = geb;

        // Inkrementieren der Klassenvariable TOTAL und Zuweisung zur lfdNr
        this.lfdNr = ++Person.TOTAL;
    }

    // Überschriebene toString-Methode, um eine lesbare Repräsentation des Objekts zu erhalten
    public String toString() {
        return String.format("[%d/%d] %s %s (%d)",
                this.lfdNr,          // laufende Nummer des aktuellen Objekts
                Person.TOTAL,       // Gesamtanzahl der Objekte
                this.vorname,
                this.nachname,
                this.geburtsjahr
        );
    }

    // Überschriebene equals-Methode, um zu prüfen, ob zwei Person-Objekte gleich sind
    public boolean equals(Person other) {
        return this.vorname.equals(other.vorname)
                && this.nachname.equals(other.nachname)
                && this.geburtsjahr == other.geburtsjahr;
    }

    // Clone-Methode, um eine Kopie des aktuellen Objekts zu erstellen
    public Person clone() {
        return new Person(this.vorname, this.nachname, this.geburtsjahr);
    }

}

/*
In deinem Code gibt es zwei Klassenvariablen:

TOTAL:
Diese Variable dient dazu,
die Gesamtanzahl der erstellten Personen zu zählen.

Sie wird verwendet, um die laufende Nummer für jedes erstellte Person-Objekt zu setzen.


lfdNr:
Diese Variable ist die laufende Nummer einer Person.
Sie gibt an, welche Nummer die Person in der Reihenfolge der Erstellung hat.

Die Klassenvariable TOTAL wird verwendet,
um sicherzustellen, dass jede Person eine eindeutige laufende Nummer erhält,
basierend auf der Gesamtanzahl der erstellten Personen.
Sie dient dazu, sicherzustellen, dass jede Person eindeutig identifizierbar ist.

Die Variable lfdNr ist spezifisch für jedes Objekt und wird verwendet,
um die laufende Nummer der Person darzustellen.
Sie wird durch Inkrementieren von TOTAL bei der Initialisierung jedes Objekts aktualisiert.

Insgesamt helfen die Klassenvariablen TOTAL und lfdNr dabei,
die Personenobjekte zu verfolgen und ihnen eine eindeutige Identifikation zuzuweisen.
 */
