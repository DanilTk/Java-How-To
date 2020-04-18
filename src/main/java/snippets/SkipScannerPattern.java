package snippets;

import java.util.Scanner;

/**
 * Code snippet shows how to skip /n while using subsequent scanners
 */

public class SkipScannerPattern {

    public static void emptyMethod() {

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); // removes /n before entering into the next scanner
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}