package fr.insa.soa.model.exception;

public class YearEnrolmentNotFoundException extends RuntimeException {

    public YearEnrolmentNotFoundException(String id) {
        super("No year enrolment found in " + id);
    }
}
