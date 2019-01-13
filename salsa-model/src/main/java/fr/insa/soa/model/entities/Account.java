package fr.insa.soa.model.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Account implements Serializable {

	private @Id String username;
	private String password;

	Account(String username) {this.username=username;}

	Account(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
