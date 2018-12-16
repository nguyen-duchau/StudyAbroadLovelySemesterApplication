package fr.insa.soa.controller;

import fr.insa.soa.model.bean.Account;
import fr.insa.soa.model.exception.AccountNotFoundException;
import fr.insa.soa.model.repository.AccountRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final AccountRepository accountRepository;

    public StudentController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @PutMapping
    public Account add(@RequestBody Account student) {
        return accountRepository.saveAndFlush(student);
    }

    @PostMapping("/login")
    public Account login(@RequestBody String username, @RequestBody String password) {
        return accountRepository.findAccountByUsernameAndPassword(username, password).orElseThrow(() ->
                new AccountNotFoundException(username)
        );
    }

    @GetMapping("/success")
    public String success() {
        return "Yo, this one is gooood";
    }

}
