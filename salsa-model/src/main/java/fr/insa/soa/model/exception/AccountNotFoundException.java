package fr.insa.soa.model.exception;

public class AccountNotFoundException extends RuntimeException {

	public AccountNotFoundException(Long id) {
		super("Account not found "+id);
	}

	public AccountNotFoundException(String username) {
		super("No account found for " + username + ", username or password is incorrect");
	}
}
