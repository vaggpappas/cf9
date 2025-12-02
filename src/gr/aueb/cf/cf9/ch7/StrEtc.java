package gr.aueb.cf.cf9.ch7;

public class StrEtc {
    public static void main(String[] args) {

        //traverse as array
        String s = "Coding Factory";

        for (char ch: s.toCharArray()) {
            System.out.print(ch + " ");
        }
        System.out.println("\u2764");

        //Replace
        String firstName = "Maria-Helen";
        String simpleName = firstName.replace("-", " ");

        //Concat
        String lastName = "Smith";
        String fullName1 = firstName + " " + lastName;
        String fullName2 = firstName.concat(" ").concat(lastName);
    }


}
