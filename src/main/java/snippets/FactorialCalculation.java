package snippets;


/**
 * Code snippet shows how to calculate factorial
 */

public class FactorialCalculation {

    public static int factorial(int i) {
        int result;
        if (i == 1) return i;

        result = factorial(i - 1) * i;
        return result;
    }
}
