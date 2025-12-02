package gr.aueb.cf.cf9.ch2;


/**
 * Προσθέτει δύο ακέραιους και το αποτέλεσμα δημιουργεί overflow
 *
 */

public class OverflowApp {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποιήση μεταβλητών

        int num1 = Integer.MAX_VALUE;
        int num2 = 1;
        int result = 0;

        //Εντολές

        result = num1 + num2;

        //Εκτύπωση αποτελέσματος
        System.out.printf("Το αποτελέσμα είναι: %,d%n", result);




    }
}
