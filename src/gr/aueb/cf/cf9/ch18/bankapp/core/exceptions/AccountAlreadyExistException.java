package gr.aueb.cf.cf9.ch18.bankapp.core.exceptions;

public class AccountAlreadyExistException extends Exception {

    public AccountAlreadyExistException(String message) {
        super(message);
    }
}
