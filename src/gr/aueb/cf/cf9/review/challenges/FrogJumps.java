package gr.aueb.cf.cf9.review.challenges;

/**
 * Από ένα σημείο χ, να πάει σε ενα σημείο y όπου κάθε απόσταση jump, είναι jump.
 *
 * Έστω ότι χ= 10
 * y = 55
 * jump = 25
 */
public class FrogJumps {

    public static void main(String[] args) {

    }

    public static int frogJumps(int start, int end, int jump) {
        int jumpCount = 0;
        while (start < end) {
            start += jump;
            jumpCount++;
        }
        return jumpCount;
    }

    public static int frogJumps2(int start, int end, int jump) {
        if ( end <= start ) {
            return 0;
        }
        int distance = end - start;
        return (distance + jump - 1) / jump;
    }

    public static int frogJumps3(int start, int end, int jump) {
        return (int) Math.ceil((end - start) / (double) jump);
    }
}
