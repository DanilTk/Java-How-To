package snippets;

import java.util.stream.IntStream;

/**
 * Code snippet shows how to trim 2d array with stream and save back to 2d array
 */
public class StreamArrayTrimmer {

    String[][] arr = {{"  word  ", " word  "}, {"  word  ", " word  "}, {"  word  ", " word  ", "sdfsd  "}};

    String[][] result = IntStream.range(0, arr.length)
            .mapToObj(i -> IntStream.range(0, arr[0].length).mapToObj(j -> arr[i][j].trim()).toArray(String[]::new))
            .toArray(String[][]::new);
}
