package fr.insa.soa.controller;

import fr.insa.soa.model.entities.Account;
import fr.insa.soa.model.exception.AccountNotFoundException;
import fr.insa.soa.model.repository.AccountRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthenticationController {

	private final AccountRepository repository;

	public AuthenticationController(AccountRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/")
	public String hello() {
		return "Salsa hello!";
	}

	@GetMapping("/account")
	public List<Account> all() {
		return repository.findAll();
	}

	@GetMapping("/account/{username}")
	public Account get(@PathVariable String username) {
		return repository.findAccountByUsername(username).orElseThrow(() ->
			new AccountNotFoundException(username)
		);
	}

	@PutMapping("/account")
	public Account add(@RequestBody Account account) {
		return repository.save(account);
	}

	@DeleteMapping("/account")
	public void delete(@RequestBody Account account) {
		repository.delete(account);
	}
}
