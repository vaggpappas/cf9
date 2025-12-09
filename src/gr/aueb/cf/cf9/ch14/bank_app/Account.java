package gr.aueb.cf.cf9.ch14.bank_app;

import java.time.LocalDateTime;

public class Account {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public Account() {

    }

    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    // Public API

    /**
     * Deposits a certain amount of money.
     *
     * @param amount        the amount of money to be deposited.
     * @throws {@link NegativeAmountException    if the amount is negative.
     */
    public void deposit(double amount) throws NegativeAmountException {
        try {
            if ( amount < 0) {
                throw new NegativeAmountException("The amount " + amount + " must not be negative.");
            }
            balance += amount;
            //log
        } catch (NegativeAmountException e) {
            System.err.println("Negative amount= " + amount + " is not valid." + e);
            throw e;
        }
    }

    /**
     * Withdraws an amount of money from the {@link Account}.
     * First, checks if ssn is valid by calling {@link Account#isSsnValid(String)}.
     *
     * @param amount        the amount to withdraw from the {@link  Account}
     * @param ssn           the given ssn.
     * @throws {@link  NegativeAmountException    if amount is negative, or balance is not sufficient
     *                      or ssn is not valid.
     * @throws {@link InsufficientBalanceException if the balance is insufficient.
     *
     * @throws {@link SsmNotValidException if SSN is not valid
     */
    public void withdraw(double amount, String ssn) throws NegativeAmountException, InsufficientBalanceException, SsmNotValidException {
        try {
            if (amount < 0) {
                throw new NegativeAmountException("The amount " + amount + " must not be negative.");
            }
            if (amount > balance) {
                throw new InsufficientBalanceException("The balance= " + this.balance + " is insufficient.");
            }
            if (!ssn.equals(this.ssn)) {
                throw new SsmNotValidException("Ssn: " + ssn + " is not valid.");
            }
            balance -= amount;
        } catch (NegativeAmountException | InsufficientBalanceException | SsmNotValidException e) {
            System.err.println(LocalDateTime.now() + "\n" + e.getMessage());
            throw e;
        }
    }

    /**
     * Returns the balance of the {@link Account}.
     *
     * @return  the {@link Account} balance.
     */
    public double getAccountBalance() {
        return getBalance();
    }

    /**
     * Returns the {@link Account} state in String format.
     *
     * @return  the string-representation of the {@link Account}.
     */
    public String accountToString() {
        return "(" + id + ", " + iban + ", " + firstname + ", " + lastname + ", " + ssn + ", " + balance + ")";
    }

    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }



}
