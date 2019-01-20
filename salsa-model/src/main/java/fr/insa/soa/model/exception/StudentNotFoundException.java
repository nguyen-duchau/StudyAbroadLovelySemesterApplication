package fr.insa.soa.model.exception;

public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(String username) {
        super("Student of username "+username+" not found ");
    }
}
