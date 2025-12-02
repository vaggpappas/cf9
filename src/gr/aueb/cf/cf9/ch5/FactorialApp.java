package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του n, με μέθοδο. Το n! = 1 * 2 * 3 * 4 * ... * n
 * και θ! = 1
 */
public class FactorialApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποιήση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int factorial = 0;

        //Input data form the user and data binding
        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        factorial = facto(num); //Inject the num real parameter

        //Εκτύπωση αποτελέσματος
        System.out.println("The factorial of " + num + " is " + factorial);

    }

    /**
     * Calculates factorial of n
     *
     * @param n the number to calculate factorial of
     * @return the factorial of n.
     */

    public static int facto(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i; //factorial = factorial * i;

        }
        return factorial;

    }
}
