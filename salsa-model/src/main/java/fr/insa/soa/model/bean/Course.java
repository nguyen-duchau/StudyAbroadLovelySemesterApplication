package fr.insa.soa.model.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Course {

	private @Id String code;
	private String name;

	@ManyToMany(mappedBy = "courses")
	private List<Speciality> speciality;

	@ManyToMany(mappedBy = "courses")
	private List<University> universities;
	// Date begin, end, description, ...

	public Course() {}

	public Course(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public List<Speciality> getSpeciality(){
		if (this.speciality == null) {
			this.speciality = new ArrayList<Speciality>();
		}
		return this.speciality;
	}

	public void addSpeciality(Speciality speciality){
		if (this.speciality == null) {
			this.speciality = new ArrayList<Speciality>();
		}
		this.speciality.add(speciality);
	}

	public List<University> getUniversities(){
		if (this.universities == null) {
			this.universities = new ArrayList<University>();
		}
		return this.universities;
	}

	public void addUniversity(University university){
		if (this.universities == null) {
			this.universities = new ArrayList<University>();
		}
		this.universities.add(university);
	}
}
