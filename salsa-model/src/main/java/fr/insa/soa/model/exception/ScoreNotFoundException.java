package fr.insa.soa.model.exception;

public class ScoreNotFoundException extends RuntimeException {

    public ScoreNotFoundException(Long id) {
        super("Score not found "+id);
    }
}