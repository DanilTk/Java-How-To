package snippets;

import java.util.Arrays;
import java.util.List;

/**
 * Code snippet splits the string on a delimiter defined as: zero or more whitespace, a literal comma, zero or more whitespace which will place the words into the list and collapse any whitespace between the words and commas.
 */

public class StringToList {
    public static void emptyMethod() {
        String str = null;
        List<String> items = Arrays.asList(str.split("\\s*,\\s*"));
    }
}
