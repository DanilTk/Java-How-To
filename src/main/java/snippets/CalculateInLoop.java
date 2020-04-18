package snippets;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-loops/problem (Java Loops II)
 */

public class CalculateInLoop {

    public static void solutionOne(int rows, int multiplier, int adder) {

        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < i + 1; j++) {
                int multiplicationExpression = (int) (Math.pow(2, j) * multiplier);

                if (j == 0) {
                    multiplicationExpression = multiplicationExpression + adder;
                }
                sum += multiplicationExpression;
            }
            System.out.print(sum + " ");
        }
    }


    public static void solutionTwo() {
        Scanner in = new Scanner(System.in);
        int t = 0;
        int a = 0;
        int b = 0;
        int n = 0;
        t = in.nextInt();
        for (int i = 0; i < t; i++) {
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            for (int j = 0; j < n; j++) {
                System.out.print(getValue(a, b, j) + " ");
            }
            System.out.println();
        }
    }

    static int getValue(int a, int b, int n) {

        int sum = a;
        for (int z = n; z >= 0; z--) {
            sum = sum + ((int) Math.pow(2, z)) * b;
        }

        return sum;
    }
}
