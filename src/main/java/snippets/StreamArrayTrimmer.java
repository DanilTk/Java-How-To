package snippets;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Code snippet shows how to trim 2d array with stream and save back to 2d array.
 * Results 1 and 2 are the same and limit size of sub-array, but result 3 is dynamical
 */

public class StreamArrayTrimmer {

    public static void streamAndTrimArray() {
        String[][] arr = {{"  word  ", " word  "}, {"  word  ", " word  "}, {"  word  ", " word  ", "word  "}};

        String[][] result1 = IntStream.range(0, arr.length)
                .mapToObj(i -> IntStream.range(0, arr[0].length)
                        .mapToObj(j -> arr[i][j].trim())
                        .toArray(String[]::new))
                .toArray(String[][]::new);

        String[][] result2 = Arrays.stream(arr)
                .map(strings -> IntStream.range(0, arr[0].length)
                        .mapToObj(j -> strings[j].trim())
                        .toArray(value1 -> new String[value1]))
                .toArray(value -> new String[value][]);

        String[][] result3 = Arrays.stream(arr)
                .map(strings -> Arrays.stream(strings)
                        .map(String::trim)
                        .toArray(String[]::new))
                .toArray(String[][]::new);

    }
}
