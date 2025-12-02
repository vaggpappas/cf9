package gr.aueb.cf.cf9.ch7;

/**
 * Δήλωση και αρχικοποιήση (populate)
 * ενός {@link String}.
 */
public class StrInt {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = new String("Athens");       //not popular
        String s3 = "";
        boolean isEmpty;

        isEmpty = s3.length() == 0;

        System.out.println(s1);
        System.out.println("Lenght: " + s1.length());
        System.out.printf("City: %s\n", s1);
    }
}
