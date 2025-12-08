package gr.aueb.cf.cf9.ch13;

import java.util.Random;

public class Point {

    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Static factory method
     * @return
     */
    public static Point getInstance() {
        return new Point();
    }

    public static Point getRandomPoint() {
        final int BOUND = 101;
        Random random = new Random(System.nanoTime());
        return new Point(random.nextInt(BOUND), random.nextInt(BOUND));
    }


    public static Point getRandomInstance() {
        Random random = new Random(System.nanoTime());
        return new Point(random.nextInt(10) + 1, random.nextInt(10) + 1);   // (10, 10)
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
