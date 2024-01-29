package Aufgaben.ZweiKlassen.Palindrom;

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
        this.lfdNr = ++Aufgaben.ZweiKlassen.Palindrom.Person.TOTAL;
    }

    // Überschriebene toString-Methode, um eine lesbare Repräsentation des Objekts zu erhalten
    public String toString() {
        return String.format("[%d/%d] %s %s (%d)",
                this.lfdNr,          // laufende Nummer des aktuellen Objekts
                Aufgaben.ZweiKlassen.Palindrom.Person.TOTAL,       // Gesamtanzahl der Objekte
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