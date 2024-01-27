package ZweiKlassen.Äpfel;

// Diese Klasse ist gegeben

public class Apple {

    public final static String[] COLORS = { "red", "green", "yellow", "brown" };

    public String color;
    public int weight;

    public Apple() {
        this.color = COLORS[(int)(Math.random() * COLORS.length)];
        this.weight = 150 + (int)(Math.random() * 100);
    }

    public String toString() {
        return String.format("%s apple (%dg)", this.color, this.weight);
    }

}
