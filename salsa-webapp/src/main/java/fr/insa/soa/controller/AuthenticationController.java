package fr.insa.soa.controller;

import fr.insa.soa.model.bean.Account;
import fr.insa.soa.model.repository.AccountRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthenticationController {

	private final AccountRepository repository;

	public AuthenticationController(AccountRepository repository) {
		this.repository = repository;
	}

	@RequestMapping("/")
	public String hello() {
		return "hello world";
	}

	@GetMapping("/account")
	public List<Account> all() {
		return repository.findAll();
	}

	@PutMapping("/account")
	public Account add(@RequestBody Account account) {
		return repository.save(account);
	}
}
