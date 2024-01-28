package Aufgaben.ZweiKlassen.Räume;

public class Room {

    public int gebaeude;
    public int etage;
    public int raumnummer;

    public Room(int geb, int et, int room) {
        this.gebaeude = geb;
        this.etage = et;
        this.raumnummer = room;
    }

    public String toString() {
        return String.format("%2d-%d.%02d",
                this.gebaeude,
                this.etage,
                this.raumnummer
        );
    }

    public boolean equals(Room other) {
        return  this.gebaeude == other.gebaeude
                && this.etage == other.etage
                && this.raumnummer == other.raumnummer;
    }

    public Room clone() {
        return new Room(this.gebaeude, this.etage, this.raumnummer);
    }

}
