package Notes.String;

public class StringBeipiele {

    //length()
    String str = "Hallo Welt";
    int length = str.length(); // length ist 10

    //isDigit()
    char ch = str.charAt(1);
    boolean jaein = Character.isDigit(ch);


    //-------------------------------------------------------------

    //startsWith()
    boolean startsWithHallo = str.startsWith("Hallo"); // true

    //-------------------------------------------------------------

    //endsWith()
    boolean endsWithWelt = str.endsWith("Welt"); // true

    //-------------------------------------------------------------

    //split()
    String[] parts = str.split(","); // parts ist ein Array: {"Hallo", "Welt", "Test"}

    //-------------------------------------------------------------

    //contains()
    boolean containsWelt = str.contains("Welt"); // true

    //-------------------------------------------------------------

    //toUpperCase()
    String upperCaseStr = str.toUpperCase(); // upperCaseStr ist "HALLO WELT"

    //-------------------------------------------------------------

    //substring()
    String subStr = str.substring(6); // subStr ist "World"
    String subStr2 = str.substring(0, 5); // subStr2 ist "Hello"

}
