package fr.insa.soa.model.exception;

public class UniversityNotFoundException extends RuntimeException {

    public UniversityNotFoundException(String country) {
        super("No university found in " + country);
    }
}
