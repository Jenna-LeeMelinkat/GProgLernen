package ZweiKlassen;

// Gegeben, nicht durch Sie anzupassen!
// Alle Änderungen werden durch den Evaluator überschrieben!
public class Person {

    public String vorname;
    public String nachname;

    public Person(String vn, String nn) {
        this.vorname = vn.trim();
        this.nachname = nn.trim();
    }

    public String toString() {
        return String.format("%s %s", this.vorname, this.nachname).trim();
    }
}