package gr.aueb.cf.cf9.ch6;

/**
 * Defensive Array Copy. Deep Copy
 * Fresh copy of the array.
 */
public class DeepArrayCopyApp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrCopy;

        arrCopy = getArrayDeepCopy(arr);
    }

    public static int[] getArrayDeepCopy(int[] arr) {
        int [] destinationArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            destinationArr[i] = arr[i];
        }
        return destinationArr;
    }

}
