package gr.aueb.cf.cf9.ch11;

public class UserMain {

    public static void main(String[] args) {

        User user = new User ();

        user.setPassword("newPassword");

        System.out.printf("id: %d, username: %s, password: %s}\n", user.getId(), user.getUsername(), user.getPassword());
    }
}
