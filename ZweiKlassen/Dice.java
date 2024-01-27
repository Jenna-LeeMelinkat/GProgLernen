package ZweiKlassen;

class Dice {

    int numberGot;

    public Dice() {
        numberGot = (int) (Math.random() * 6) + 1;
    }

    public Dice(int x) {
        numberGot = x;
    }

    public String toString() {
        return String.format("W%d", numberGot);
    }




}
