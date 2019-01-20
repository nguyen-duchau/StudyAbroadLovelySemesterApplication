package fr.insa.soa.model.exception;

public class ScoreNotFoundException extends RuntimeException {

    public ScoreNotFoundException(Long id) {
        super("Score of id: "+id+" not found ");
    }
}