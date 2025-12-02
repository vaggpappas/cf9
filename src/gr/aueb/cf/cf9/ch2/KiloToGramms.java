package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Calculates the weight in grams of a given weight in kilograms
 * The user inserts the weight in kilograms and the program calculates the weight in grams
 */
public class KiloToGramms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int weightInKilograms = 0;
        int weightInGrams = 0;
        final int kiloGrams = 1000;

        System.out.println("Εισάγετε τα κιλά σας: ");

        weightInKilograms = scanner.nextInt();
        weightInGrams = weightInKilograms * kiloGrams;

        System.out.printf("Το βάρος σας σε κιλά είναι: %d ,σε γραμμάρια είναι %d\n", weightInKilograms, weightInGrams);

    }
}
