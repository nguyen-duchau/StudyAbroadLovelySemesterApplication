package fr.insa.soa.model.exception;

public class EnrolmentNotFoundException extends RuntimeException {

    public EnrolmentNotFoundException(Long id) {
        super("Enrolment not found "+id);
    }

}
