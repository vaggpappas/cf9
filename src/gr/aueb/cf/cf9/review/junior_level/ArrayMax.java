package gr.aueb.cf.cf9.review.junior_level;

public class ArrayMax {

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 15};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[0] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
