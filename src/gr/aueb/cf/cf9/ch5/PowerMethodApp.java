package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει τη δύναμη a ^ b με μέθοδο
 */
public class PowerMethodApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int exp = 0;
        int result = 0;

        System.out.println("Please insert a number for base and one for power: ");

        base = scanner.nextInt();
        exp = scanner.nextInt();

        result = power(base, exp);

        System.out.println("The result is " + result);

    }

    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;


    }
}
