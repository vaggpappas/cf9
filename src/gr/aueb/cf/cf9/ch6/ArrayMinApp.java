package gr.aueb.cf.cf9.ch6;

/**
 * Βρίσκει το ελάχιστο ενός πίνακα
 */
public class ArrayMinApp {
    public static void main(String[] args) {
        // 1. Δημιουργία πίνακα δοκιμής
        int[] myArray = {15, 8, 20, 5, 12, 3, 5, 5};

        // 2. Κλήση της μεθόδου για εύρεση της θέσης του ελαχίστου
        int minPos = getMinPosition(myArray);

        // 3. Εκτύπωση των αποτελεσμάτων

        if (minPos != -1) {
            System.out.println("Ο πίνακας είναι: " + java.util.Arrays.toString(myArray));
            System.out.println("---");
            System.out.println("Η θέση (δείκτης) του ελάχιστου στοιχείου είναι: " + minPos);
            System.out.println("Η ελάχιστη τιμή είναι: " + myArray[minPos]);
        } else {
            System.out.println("Ο πίνακας είναι κενός ή null.");
        }

    }

    public static int getMinPosition(int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }


    public static int getMinPosition2(int [] arr) {
        if (arr == null || arr.length <1) return -1;
        int minPosition = 0;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }

    public static int getMaxPosition(int [] arr) {
        if (arr == null || arr.length ==0) return -1;

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }

}
