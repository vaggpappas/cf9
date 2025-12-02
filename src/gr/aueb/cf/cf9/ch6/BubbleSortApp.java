package gr.aueb.cf.cf9.ch6;

public class BubbleSortApp {
    public static void main(String[] args) {
        int [] arr = {12, 11, 13, 5, 6};
        int [] sorted = new int[5];

        System.out.println("Before sorting: ");
        printArray(arr);

        System.out.println();

        System.out.println("After sorting: ");
        sorted = bubbleSort(arr);
        printArray(sorted);
    }

    public static int [] bubbleSort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j,j + 1);
                }
            }
        }
        return arr;
    }

    public static void swap(int [] arr, int minPosition, int i) {
        int temp = arr[minPosition];
        arr[minPosition] = arr[i];
        arr[i] = temp;
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
