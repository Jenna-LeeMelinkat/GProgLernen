package Aufgaben.String.C;

/**
 * ## Zeichen zählen
 *
 * Entwickeln Sie bitte eine Methode `countChars()`, die zählt wie oft
 * ein Zeichen in einer Zeichenkette vorkommt. Das Zählen soll
 * case-insenstiv erfolgen (d.h. 'a' ist wie 'A' zu zählen).
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Denken Sie über den Einsatz folgender Aufgaben.String-Methoden nach.
 *   Die Wirkungsweise finden Sie im Handout der Unit 02 oder unter diesem 
 *   [API Link](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html).
 * - `length()`
 * - `toLowerCase()` und `toUpperCase()` 
 * - `replaceAll()`
 *
 */
class CS_I_CountChars__CInS_Vorkommen {

    public static Integer countChars(char c, String s) {
        int laenge = s.length();

        s = s.toLowerCase();
        String str = Character.toString(c);
        str = str.toLowerCase();

        String sOhneC = s.replaceAll(str,"");
        int count = laenge - sOhneC.length();

        return count;
    }

    public static void main(String[] args) {
        int n = countChars('a', "Abc");
        System.out.println(n); // => 1
        System.out.println(countChars('A', "abc")); // => 1
        System.out.println(countChars('x', "ABC")); // => 0
        System.out.println(countChars('!', "!!!")); // => 3
    }
}