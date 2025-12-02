package gr.aueb.cf.cf9.ch2;

/**
 * Παράγει ενα τυχαίο ακέραιο μεταξύ 1 και 6 (ζάρι)
 */
public class RandomApp {
    public static void main(String[] args) {
        int die = 0;
        die = (int) (Math.random() * 6) + 1;
        System.out.println("Το ζάρι έφερε: " + die);

    }
}
