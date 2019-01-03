package fr.insa.soa.authentication.controller;

import fr.insa.soa.model.entities.Account;
import fr.insa.soa.model.exception.AccountNotFoundException;
import fr.insa.soa.model.repository.AccountRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthenticationServiceController {

    private AccountRepository accountRepository;

    public AuthenticationServiceController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @PostMapping("/verify")
    public Account verify(@RequestBody Account account) {

        return accountRepository.findAccountByUsernameAndPassword(
                account.getUsername(),
                account.getPassword()
        ).orElseThrow(() ->
                new AccountNotFoundException(account.getUsername()));
    }

    @GetMapping("/account")
    public List<Account> getAll() {
        return accountRepository.findAll();
    }

}
