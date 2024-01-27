package ZweiKlassen;

public class Room {
    public int geb;
    public int etage;
    public int nummer;

    public Room(int geb, int etage, int nummer) {
        this.geb = geb;
        this.etage = etage;
        this.nummer = nummer;
    }

    public Room clone() {
        return new Room(this.geb, this.etage, this.nummer);
    }

    public boolean equals(Room obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Room room = (Room) obj;
        return geb == room.geb && etage == room.etage && nummer == room.nummer;
    }

    public String toString() {
        return String.format("%2d-%d.%02d", geb, etage, nummer);
    }

}

