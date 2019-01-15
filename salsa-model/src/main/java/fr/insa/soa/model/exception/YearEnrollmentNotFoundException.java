package fr.insa.soa.model.exception;

public class YearEnrollmentNotFoundException extends RuntimeException {

    public YearEnrollmentNotFoundException(String id) {
        super("No year enrolment found in " + id);
    }
}
