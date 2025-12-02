package gr.aueb.cf.cf9.review.challenges;

/**
 * Έστω πίνακας με n στοιχεία από 1 έως n + 1
 * Για παράδειγμα [1, 2, 3, 5]
 */
public class MissingElement {
    public static void main(String[] args) {
        // Παράδειγμα: Πίνακας με n=4 στοιχεία (άρα εύρος 1 έως 5)
        // Λείπει το 4
        int[] arr = {1, 2, 3, 5};

        int missing = findMissingElement(arr);
        System.out.println("The missing element is: " + missing);
    }

    public static int findMissingElement(int[] arr) {
        // Το μέγεθος του πίνακα είναι n
        // Οι αριθμοί είναι από 1 έως n+1
        // Άρα το πλήθος των αριθμών στο πλήρες εύρος είναι arr.length + 1
        int n = arr.length + 1;

        // Υπολογισμός του αναμενόμενου αθροίσματος: n * (n + 1) / 2
        int expectedSum = (n * (n + 1)) / 2;

        // Υπολογισμός του πραγματικού αθροίσματος των στοιχείων του πίνακα
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // Η διαφορά είναι το στοιχείο που λείπει
        return expectedSum - actualSum;
    }
}
