package gr.aueb.cf.cf9.ch6;

/**
 * Οταν κάνουμε copy references, τότε το copy ονομάζεται shallow και side effects
 */
public class ArrayShallowCopyApp {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4, 5};
        int [] arr2 = arr1;     // Shallow copy

        arr2[0] = 1000;
        System.out.println(arr1[0]);        // 1000
    }


}
