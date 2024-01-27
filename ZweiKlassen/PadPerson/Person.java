package ZweiKlassen.PadPerson;

public class Person {

    public String vorname;
    public String nachname;
    public int geburtsjahr;

    public static int TOTAL;        // static => Klassenvariable
    public int lfdNr;               // kein static => objektbezogenes Datenfeld

    public Person(String vn, String nn, int geb) {
        this.vorname = vn;
        this.nachname = nn;
        this.geburtsjahr = geb;
        this.lfdNr = ++Person.TOTAL;
    }

    public String toString() {
        return String.format("[%d/%d] %s %s (%d)",
                this.lfdNr,
                Person.TOTAL,
                this.vorname,
                this.nachname,
                this.geburtsjahr
        );
    }

    public boolean equals(Person other) {
        return this.vorname.equals(other.vorname) &&
                this.nachname.equals(other.nachname) &&
                this.geburtsjahr == other.geburtsjahr;
    }

    public Person clone() {
        return new Person(this.vorname, this.nachname, this.geburtsjahr);
    }

}

