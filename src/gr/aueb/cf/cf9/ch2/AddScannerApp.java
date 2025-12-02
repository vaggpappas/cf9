package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Διαβάζει 2 ακεραίους απο το stdin (keyboard)
 * και υπολογίζει το αποτέλεσμα.
 */
public class AddScannerApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποιήση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        //Εντολές
        System.out.println("Παρακαλω εισάγετε 2 ακεραίους");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum = num1 + num2;

        //Εκτπύπωση αποτελεσμάτων
        System.out.printf("Το άθροισμα των %d και %d είναι ίσο με %d%n", num1, num2, sum);

    }
}
