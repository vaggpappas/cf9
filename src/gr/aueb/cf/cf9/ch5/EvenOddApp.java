package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 *Ορίζει 2 μεθόδους, την isEven και την isOdd για τον έλεγχο ενός ακεραίου αν είναι άρτιος ή περιττός
 */
public class EvenOddApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean isEven = false;

        System.out.println("Please enter a number: ");
        n = scanner.nextInt();

        isEven = isEven(n);

        if (isEven) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }

    }
    public static boolean isEven(int n) {
        // Ένας αριθμός είναι άρτιος αν το υπόλοιπο της διαίρεσης με το 2 είναι 0.
        return n % 2 == 0;
    }
    public static boolean isOdd(int n) {
        // Ένας αριθμός είναι περιττός αν το υπόλοιπο της διαίρεσης με το 2 δεν είναι 0.
        return n % 2 != 0;
    }

}
