package fr.insa.soa.model.exception;

public class CourseNotFoundException extends RuntimeException {

	public CourseNotFoundException(String code) {
		super("Course not found "+code);
	}

}
