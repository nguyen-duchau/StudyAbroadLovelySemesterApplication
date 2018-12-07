package fr.insa.soa.model.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Course {

	private @Id String code;
	private String name;
	// Date begin, end, description, ...

	public Course() {}

	public Course(String code, String name) {
		this.code = code;
		this.name = name;
	}
}
