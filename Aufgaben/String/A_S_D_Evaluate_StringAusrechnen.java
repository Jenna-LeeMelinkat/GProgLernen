package Aufgaben.String;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class A_S_D_Evaluate_StringAusrechnen {

    /**
     * # Links-Rechts Auswertung von Grundrechenoperatoren
     * <p>
     * Gegeben seien Zeichenketten in denen positive natürliche Zahlen in Dezimalnotation
     * (wie bspw. 42) und die Grundrechenarten-Aufgaben.Operatoren +, -,
     * ungeklammert abwechselnd aufeinander folgen. Aufgaben.Operatoren **können** von Zahlen durch ein oder mehrere Leerzeichen getrennt sein.
     * Also z.B. So *"1 + 2 * 3 / 4"* oder so *"5-4*3+2/1"* (auch Mischformen sind zulässig). derartigen eichenketten une mettere usalute), den
     * die Aufgaben.Operatoren in der üblichen Infix-Notation von links nach rechts abgearbeitet werden.
     * Es ist sichergestellt, dass Zeichenketten immer nur positive natürliche Zahlen inkl. der Null und die genannten Aufgaben.Operatoren
     * in abwechselnder Reihenfolge beinhalten.
     * evaluate()'
     * soll
     * • ferner **keine** Operatorpräzendenz (Punkt-vor-Strich-Regel) oder Klammerregelung berücksichtigen! Ansonsten wäre die Aufgabe zu aufwändig.
     * Aufrufbeispiele und Lösungstipps, um in einer Zeichenkette
     * an die zu verarbeitenden Dezimalwerte und Aufgaben.Operatoren zu gelangen,
     * finden Sie in der main()' -Methode.
     * Die Aufgabe ist einfacher als Sie auf den ersten Blick aussieht.
     * Da Sie vermutlich zwei Arrays parallel durchlaufen müssen, ist der Einsatz einer zählenden for -Schleife, ggf. eine Überlegung wert.
     */


    public static double evaluate(String s) {
        if (s == null || s.isEmpty() || s.isBlank()) {
            return 0; // Rückgabe von 0, wenn die Zeichenkette leer ist
        }

        String[] operatoren = s.split("(?<=[-+*/])|(?=[-+*/])");
        List<String> liste = new ArrayList<>();
        for (String operator : operatoren) {
            if (!operator.trim().isEmpty()) {
                liste.add(operator.trim());
            }
        }

        double result = Double.parseDouble(liste.get(0));
        String operator = "";

        for (int i = 1; i < liste.size(); i += 2) {
            operator = liste.get(i);
            double value = Double.parseDouble(liste.get(i + 1));

            switch (operator) {
                case "+":
                    result += value;
                    break;
                case "-":
                    result -= value;
                    break;
                case "*":
                    result *= value;
                    break;
                case "/":
                    result /= value;
                    break;
            }
        }

        return result;
    }


    // Main-Methode für Testbeispiele
    public static void main(String[] args) {
        String s = "1 + 2 * 3 / 4";

        String[] operators = s.split("[0-9 ]+");
        System.out.println(Arrays.toString(operators));
        String[] values = s.split("[+\\-*/ ]+");
        System.out.println(Arrays.toString(values));

        int v = Integer.parseInt("42");
        System.out.println(v);

        double result = evaluate("5 + 4 * 3 - 2 + 1");
        System.out.println(result); // => 26.0

        // Weitere Beispiele
        System.out.println(evaluate("42")); // => 42.0
        System.out.println(evaluate("20 - 2")); // => 18.0
        System.out.println(evaluate("2 / 100")); // => 0.02
        System.out.println(evaluate(" 5 * 3-200 + 0 ")); // => -185.0
    }
}
