package snippets;

/**
 * Code snippet shows quicksort implementation with recursion
 */

public class QuickSort {

    public static void quickSort(char items[], int left, int right) {
        char x;
        char y;
        int i = left;
        int j = right;
        x = items[(left + right) / 2];

        do {
            while ((items[i] < x) && (i < right)) {
                i++;
            }
            while ((x < items[j]) && (j > left)) {
                j--;
            }

            if (i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;
                j--;
            }
        } while (i <= j);

        if (left < j) quickSort(items, left, j);
        if (i < right) quickSort(items, i, right);
    }
}
