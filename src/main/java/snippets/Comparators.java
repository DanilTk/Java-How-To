package snippets;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Code snippet shows how to sort a double-element array
 */

public class Comparators {
    public static void compareByFirstElement() {

        Comparator<String[]> byFirstElement = (String[] array1, String[] array2) -> Integer.parseInt(array1[0]) - Integer.parseInt(array2[0]);
        Comparator<String[]> byElement = (String[] ar1, String[] ar2) -> Integer.parseInt(ar1[0].substring(1, ar1[0].indexOf('/'))) - Integer.parseInt(ar2[0].substring(1, ar2[0].indexOf('/')));

        List<String[]> array1 = new ArrayList<>();

        String[] arr1 = {"3", "1/1"};
        String[] arr2 = {"1", "1/2"};
        String[] arr3 = {"2", "1/4"};

        array1.add(arr1);
        array1.add(arr2);
        array1.add(arr3);

        List<String[]> result1 = array1.stream()
                .sorted(byFirstElement)
                .collect(Collectors.toList());

        List<String[]> array2 = new ArrayList<>();

        String[] arr4 = {"390/360", "30/360"};
        String[] arr5 = {"360/360", "360/360"};
        array2.add(arr4);
        array2.add(arr5);

        List<String[]> result2 = array2.stream()
                .sorted(byElement)
                .collect(Collectors.toList());
    }
}
