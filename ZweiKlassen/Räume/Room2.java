package ZweiKlassen.Räume;

public class Room2 {
    public int geb;
    public int etage;
    public int nummer;

    public Room2(int geb, int etage, int nummer) {
        this.geb = geb;
        this.etage = etage;
        this.nummer = nummer;
    }

    public Room2 clone() {
        return new Room2(this.geb, this.etage, this.nummer);
    }

    public boolean equals(Room2 obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Room2 room = (Room2) obj;
        return geb == room.geb && etage == room.etage && nummer == room.nummer;
    }

    public String toString() {
        return String.format("%2d-%d.%02d", geb, etage, nummer);
    }

}

