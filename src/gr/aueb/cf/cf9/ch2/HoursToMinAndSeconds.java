package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Calculates hours to mins and seconds for a given number of hours
 */
public class HoursToMinAndSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = 0;
        int secs = 0;
        int mins = 0;
        final int finalSecs = 3_600;
        final int finalMins = 60;

        System.out.println("Παρακαλώ εισάγετε την ώρα: ");

        hours = scanner.nextInt();
        secs = hours * finalSecs;
        mins = hours * finalMins;

        System.out.printf("Οι ώρες είναι: %d, το οποίο μεταφράζεται σε %d λεπτά και %,d δευτερόλεπτα\n", hours, mins, secs);

    }
}
