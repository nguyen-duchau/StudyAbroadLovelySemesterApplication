package fr.insa.soa.model.exception;

public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(String code) {
        super("Student not found "+code);
    }
}
