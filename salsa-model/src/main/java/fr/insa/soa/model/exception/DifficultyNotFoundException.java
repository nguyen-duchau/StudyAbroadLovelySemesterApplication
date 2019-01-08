package fr.insa.soa.model.exception;

public class DifficultyNotFoundException extends RuntimeException {

    public DifficultyNotFoundException(Long id) {
        super("Course not found "+id);
    }

}
