package Aufgaben.ZweiKlassen.ProbeString;



public class Objekt {

    String l1;
    String o2;

    public Objekt(String liste1, String liste2) {
        this.l1 = liste1;
        this.o2 = liste2;
    }


    public String toString() {
        return "(" + l1 + ", " + o2 + ")";
    }
}
