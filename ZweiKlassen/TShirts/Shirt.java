package ZweiKlassen.TShirts;

public class Shirt {

    public String size;
    public String color;

    public Shirt(String s,String c) {
        this.size = s;
        this.color = c;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }


    public String toString() {
        return String.format("%ses %s-ZweiKlassen.TShirts.Shirt", color, size);
    }

}

