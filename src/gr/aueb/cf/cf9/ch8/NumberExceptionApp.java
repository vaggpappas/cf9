package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

/**
 * Το {@link NumberFormatException} συμβαίνει όταν αποτυγχάνει η {@link Integer#parseInt(String)}
 */
public class NumberExceptionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int num = 0;

        System.out.println("Please enter a number: ");
        //input = scanner.nextLine();
        while (!isInteger(input = scanner.nextLine())) {
            System.out.println("Οι χαρακτήρες είναι μη αποδεκτοί");

        }
        num = Integer.parseInt(input);
        System.out.println("The number is: " + num);
    }
    /**
     * Checks if the given string is an integer.
     * @param s     the string to check.
     * @return      true if the string is an integer, false otherwise.
     */
    public static boolean isInteger(String s) {
        return s.matches("-?[0-9]+");
    }
}
