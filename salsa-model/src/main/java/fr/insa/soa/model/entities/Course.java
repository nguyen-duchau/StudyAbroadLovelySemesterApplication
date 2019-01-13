package fr.insa.soa.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Course implements Serializable {

	private @Id String code;
	private String name;

	@ManyToMany(mappedBy = "courses")
	private List<Speciality> speciality;

	@ManyToMany(mappedBy = "courses")
	@JsonIgnore
	private List<University> universities;
	// Date begin, end, description, ...

	public Course() {}

	public Course(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public List<Speciality> getSpeciality(){
		if (this.speciality == null) {
			this.speciality = new ArrayList<>();
		}
		return this.speciality;
	}

	public void addSpeciality(Speciality speciality){
		if (this.speciality == null) {
			this.speciality = new ArrayList<>();
		}
		this.speciality.add(speciality);
	}

	public List<University> getUniversities(){
		if (this.universities == null) {
			this.universities = new ArrayList<>();
		}
		return this.universities;
	}

	public void addUniversity(University university){
		if (this.universities == null) {
			this.universities = new ArrayList<>();
		}
		this.universities.add(university);
	}
}
