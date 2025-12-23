package gr.aueb.cf.cf9.ch18.bankapp.dto;

public record AccountInsertDTO(String iban, double balance) {
}

//import java.math.BigDecimal;

//public class AccountInsertDTO {
//
//    private String iban;
//    private BigDecimal balance;
//
//    public AccountInsertDTO() {
//
//    }
//
//    public AccountInsertDTO(String iban, BigDecimal balance) {
//        this.iban = iban;
//        this.balance = balance;
//    }
//
//    public String getIban() {
//        return iban;
//    }
//
//    public void setIban(String iban) {
//        this.iban = iban;
//    }
//
//    public BigDecimal getBalance() {
//        return balance;
//    }
//
//    public void setBalance(BigDecimal balance) {
//        this.balance = balance;
//    }
//
//    @Override
//    public String  toString() {
//        return "AccountInsertDTO{" +
//                "iban='" + iban + '\'' +
//                ", balance=" + balance +
//                '}';
//    }
//}
