package ToSort;

/**
 * ## Tripple in Zeichenketten finden
 *
 * Entwickeln Sie nun bitte eine Methode `noMultiples()`, die prüft, ob in
 * einer Zeichenkette niemals drei (oder mehr) gleiche Zeichen aufeinander 
 * folgen.
 *
 * Verallgemeinern Sie `noMultiples()` nun so,
 * dass die Anzahl der zu wiederholenden Zeichen parameterisiert ist.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweis:__
 *
 * - Sehen Sie sich noch einmal überladene Methoden in Unit 2 (Methoden) an. 
 *
 */
class noMultiples {

    public static boolean noMultiples(String input) {
        int iLength = input.length();
        int count = 1;
        for (int i = 0; i < iLength - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                count++;
                if (count >= 3) {
                    return false;
                }
            } else {
                count = 1;
            }
        }
        return true;
    }

    public static boolean noMultiples(int haufig, String input) {
        int iLength = input.length();
        int count = 1;
        for (int i = 0; i < iLength - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                count++;
                if (count >= haufig) {
                    return false;
                }
            } else {
                count = 1;
            }
        }
        return true;
    }




    public static void main(String[] args) {
        boolean result = noMultiples("Hello World");
        System.out.println(result); // => true
        System.out.println(noMultiples("faaantastic")); // => false
        System.out.println(noMultiples(2, "Hello World")); // => false
    }

}