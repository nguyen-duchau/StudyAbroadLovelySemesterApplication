package fr.insa.soa.model.exception;

public class SimpleEnrollmentNotFoundException extends RuntimeException {

    public SimpleEnrollmentNotFoundException(Long id) {
        super("Simple Enrolment not found "+id);
    }

}
