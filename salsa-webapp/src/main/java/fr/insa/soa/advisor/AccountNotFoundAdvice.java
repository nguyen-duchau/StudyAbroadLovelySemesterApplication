package fr.insa.soa.advisor;

import fr.insa.soa.model.exception.AccountNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class AccountNotFoundAdvice {


	@ResponseBody
	@ExceptionHandler(AccountNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String accountNotFoundHandler(AccountNotFoundException ex) {
		return ex.getMessage();
	}

}
