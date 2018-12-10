package fr.insa.soa.model.exception;

public class AccountNotFoundException extends RuntimeException {

	public AccountNotFoundException(Long id) {
		super("Account not found "+id);
	}
}
