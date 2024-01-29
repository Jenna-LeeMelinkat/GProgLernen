package Aufgaben.ZweiKlassen.TK_TupleListen;

public class Tuple {

    String t1;
    String t2;

    public Tuple(String tuple1, String tuple2) {
        this.t1 = tuple1;
        this.t2 = tuple2;
    }


    public String toString() {
        return "(" + t1 + ", " + t2 + ")";
    }
}
