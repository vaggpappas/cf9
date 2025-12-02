package gr.aueb.cf.cf9.ch5;

/**
 * Ορίζει μια μέθοδο void swap (int a, int b) η οποία θα ανταλλάζει αμοιβαία τις τιμές a, b
 */
public class SwapApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("a = %d, b = %d\n", a, b);

        swap(a, b);

        System.out.printf("a = %d, b = %d\n", a, b);
    }

    /**
     * Swap 2 numbers
     * @param a the first number
     * @param b the second number
     */
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b= temp;
    }
}
