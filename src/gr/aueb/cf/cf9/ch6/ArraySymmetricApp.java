package gr.aueb.cf.cf9.ch6;

/**
 * Ελέγχει εάν ένας πίνακας ακεραίων είναι συμμετρικός ή όχι. Συμμετρικός είναι ένας πίνκας αν διαβάζεται το ίδιο απο
 * την αρχή και το τέλος
 * Για παράδειγμα [1, 2, 3, 3, 2, 1]
 * και [1, 2, 3, 2, 1]
 */

public class ArraySymmetricApp {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 3, 2, 1}; // Συμμετρικός
        int[] arr2 = {1, 2, 3, 2, 1};    // Συμμετρικός
        int[] arr3 = {1, 2, 4, 5, 2, 1};    // Όχι συμμετρικός

        System.out.println("Ο arr1 είναι συμμετρικός: " + isSymmetric(arr1));
        System.out.println("Ο arr2 είναι συμμετρικός: " + isSymmetric(arr2));
        System.out.println("Ο arr3 είναι συμμετρικός: " + isSymmetric(arr3));

    }
    /**
     * Ελέγχει αν ένας πίνακας είναι συμμετρικός.
     * @param arr Ο πίνακας προς έλεγχο.
     * @return true αν ο πίνακας είναι συμμετρικός, false διαφορετικά.
     */
    public static boolean isSymmetric(int[] arr) {
        if (arr == null) {
            return false; // Ένας null πίνακας δεν θεωρείται συμμετρικός
        }

        int n = arr.length;
        // Ελέγχουμε μόνο μέχρι το μέσο του πίνακα, καθώς οι ελέγχοι είναι "ζευγαρωτοί"
        for (int i = 0; i < n / 2; i++) {
            // Συγκρίνουμε το στοιχείο στη θέση i με το στοιχείο στη θέση n - 1 - i
            if (arr[i] != arr[n - 1 - i]) {
                return false; // Βρέθηκε διαφορά, ο πίνακας δεν είναι συμμετρικός
            }
        }

        return true; // Όλα τα ζεύγη ταιριάζουν, ο πίνακας είναι συμμετρικός
    }

//    public static boolean isSymmetric2(int [] arr) {
//
//    }


}
