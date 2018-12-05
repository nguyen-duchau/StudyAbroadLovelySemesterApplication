package fr.insa.soa.model.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Account {

	private @Id @GeneratedValue Long id;
	private String usename;
	private String password;

	public Account() {}

	public Account(String username, String password) {
		this.usename = username;
		this.password = password;
	}
}
