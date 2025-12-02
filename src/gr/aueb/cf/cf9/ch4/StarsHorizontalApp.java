package gr.aueb.cf.cf9.ch4;

/**
 * Εκτυπώνει 10 οριζόντια αστεράκια με for
 */
public class StarsHorizontalApp {
    public static void main(String[] args) {

        // Horizontal stars

        for (int i = 1; i <= 9; i++){
            System.out.print("*");
        }

        // Vertical stars
        for (int i = 0; i <= 10; i++){
            System.out.println("*");
        }

        // Grid 10 x 10
        for (int i = 1; i <= 10; i++){
            for (int j = 0; j <= 9; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //1, 2, 3, ... stars
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
