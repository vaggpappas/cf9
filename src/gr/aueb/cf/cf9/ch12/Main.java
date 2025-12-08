package gr.aueb.cf.cf9.ch12;

public class Main {

    public static void main(String[] args) {
        Account aliseAccount = new Account(1, "GR12345", "Alice", "W.", "A12345", 100);

        try {
            aliseAccount.deposit(500);
            System.out.println(aliseAccount.accountToString());

            aliseAccount.withdraw(50, "A12345");
            System.out.println(aliseAccount.accountToString());

            aliseAccount.withdraw(100, "AB123");    // Δίνει exception

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
