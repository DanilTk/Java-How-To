package snippets;

/**
 * Code snippet shows how to format values which are subsequently concatenated into one, disregard of their data types
 */

public class StringFormatting {

    public static void formatString() {

        int number = 5;
        String text = "hello";
        System.out.printf("%-15s%03d", text, number);
    }
}
