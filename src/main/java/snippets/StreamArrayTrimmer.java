package snippets;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Code snippet shows how to trim 2d array with stream and save back to 2d array
 */

public class StreamArrayTrimmer {

    public static void main() {
        String[][] arr = {{"  word  ", " word  "}, {"  word  ", " word  "}, {"  word  ", " word  ", "word  "}};

        String[][] result = IntStream.range(0, arr.length)
                .mapToObj(i -> IntStream.range(0, arr[0].length)
                        .mapToObj(j -> arr[i][j].trim())
                        .toArray(String[]::new))
                .toArray(String[][]::new);

        String[][] result2 = Arrays.stream(arr)
                .map(strings -> IntStream.range(0, arr[0].length)
                        .mapToObj(j -> strings[j].trim())
                        .toArray(String[]::new))
                .toArray(String[][]::new);

    }
}
