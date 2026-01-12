package gr.aueb.cf.cf9.ch18.bankapp.controller;

import gr.aueb.cf.cf9.ch18.bankapp.core.exceptions.ValidationException;
import gr.aueb.cf.cf9.ch18.bankapp.dao.AccountDAOImpl;
import gr.aueb.cf.cf9.ch18.bankapp.dao.IAccountDao;
import gr.aueb.cf.cf9.ch18.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.cf9.ch18.bankapp.service.AccountServiceImpl;
import gr.aueb.cf.cf9.ch18.bankapp.service.IAccountService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class AccountController {
    private final IAccountService accountService;

    public AccountController(IAccountService accountService) {
        this.accountService = accountService;
    }

    public AccountController createNewAccount(String iban, BigDecimal balance) throws ValidationException {
        AccountInsertDTO insertDTO = new AccountInsertDTO(iban, balance);

        //Validation
    }
}
