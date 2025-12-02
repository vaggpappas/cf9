package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

/**
 *
 */
public class StrTrim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = "";

        System.out.println("Please enter your first name: ");

        firstName = scanner.nextLine().trim();

        System.out.println(firstName);
    }
}