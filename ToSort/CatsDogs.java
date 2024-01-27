package ToSort;

/**
 *  ## Cats and Dogs
 *
 * Entwickeln Sie bitte eine Methode `catsDogs()`,
 * die prüft, ob in einer Zeichenkette gleich häufig
 * die Zeichenketten "cat" und "dog" vorkommen.
 *
 * Wenn weder "cat" noch "dog" vorkommen, ist dies als
 * nicht gleich häufig zu werten.
 *
 * Beispielaufrufe finden Sie in der `main()`-Methode.
 *
 * Challenge: Lösen Sie die Aufgabe OHNE Schleifen.
 *
 */
class CatsDogs {

    public static boolean catsDogs(String s) {
        int countCats = (s.length() - s.replaceAll("cat", "").length()) / "cat".length();
        int countDogs = (s.length() - s.replaceAll("dog", "").length()) / "dog".length();
        if (countCats == 0 || countDogs == 0 || countCats != countDogs) {
            return false;
        } else {
            return true;
        }
    }


    public static void main(String[] args) {
        boolean r = catsDogs("catdog");
        System.out.println(r); // => true
        System.out.println(catsDogs("catcat")); // => false
        System.out.println(catsDogs("1cat1cadodog")); // => true
    }
}
