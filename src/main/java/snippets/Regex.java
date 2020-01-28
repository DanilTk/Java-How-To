package snippets;

public class Regex {

    public static String removeTrailingZeroes(String number) {

        if (number.contains(".")) {
            return number.replaceAll("0*$", "").replaceAll("\\.$", "");
        }
        return null;
    }
}
