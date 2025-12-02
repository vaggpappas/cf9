package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

/**
 * Το {@link java.util.InputMismatchException} συμβαίνει όταν ο {@link java.util.Scanner} αποτυχγχάνει να διαβάσει
 * το σωστό τύπο δεδομένων
 */
public class InputException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;

        System.out.println("Please enter one int: ");
        //num1 = scanner.nextInt();


        while (!scanner.hasNextInt()) {
            System.out.println("Μη αποδεκτοί χαρακτήρες");
            scanner.next();
        }

        num1 = scanner.nextInt();

        System.out.println("Num1 is: " + num1);
    }
}
