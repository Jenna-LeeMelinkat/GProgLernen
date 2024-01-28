package ZweiKlassen.PadPerson;

public class MainPadPerson {

    public static void main(String[] args) {
        Person p = new Person("Max", "Mustermann", 2002);
        Person q = new Person("Maren", "Musterfrau", 1998);
        Person pc = p.clone();

        System.out.println("p:  " + p);
        System.out.println("q:  " + q);

        System.out.println("pc: " + pc);

        System.out.println("p und pc identisch? " + (p == pc));
        System.out.println("p und pc gleich? " + p.equals(pc));
    }
}
