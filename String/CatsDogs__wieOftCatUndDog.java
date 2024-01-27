package String;

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
class CatsDogs__wieOftCatUndDog {

    public static Boolean catsDogs(String s) {
        int laenge = s.length();

        int cats = laenge - s.replaceAll("cat", "").length();
        int dogs = laenge - s.replaceAll("dog", "").length();

        if (cats == 0 && dogs == 0) {
            return false;
        }

        return cats == dogs;
    }


    public static void main(String[] args) {
        boolean r = catsDogs("catdog");
        System.out.println(r); // => true
        System.out.println(catsDogs("catcat")); // => false
        System.out.println(catsDogs("1cat1cadodog")); // => true
    }
}
