package snippets;

/**
 * Code snippet shows how to parse multidimensional array with enhanced for loop
 */

public class ForEachMultiArray {

    public static void parseArrayWithForEach() {
        String array[][] = new String[10][10];

        for (String arr[] : array) {
            for (String element : arr) {
                System.out.println(element);
            }

        }
    }
}
