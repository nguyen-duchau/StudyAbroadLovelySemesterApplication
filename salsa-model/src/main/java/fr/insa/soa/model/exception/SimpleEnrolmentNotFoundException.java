package fr.insa.soa.model.exception;

public class SimpleEnrolmentNotFoundException extends RuntimeException {

    public SimpleEnrolmentNotFoundException(Long id) {
        super("Simple Enrolment not found "+id);
    }

}
