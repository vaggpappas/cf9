package gr.aueb.cf.cf9.ch6;

public class SwapWithArrayApp {
    public static void main(String[] args) {
        int [] arr = {1, 2};

        System.out.println("arr[0] " + arr[0]);
        System.out.println("arr[1] " + arr[1]);
        swap(arr);
        System.out.println("arr[0] " + arr[0]);
        System.out.println("arr[1] " + arr[1]);
    }

    /**
     * Swaps the values of the first 2 elements of the array
     * @param arr the input array
     */
    public static void swap(int[] arr) {
        if (arr.length != 2) return;

        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] =tmp;
    }
}
