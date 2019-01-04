package fr.insa.soa.model.exception;

public class SpecialityNotFoundException extends RuntimeException {

    public SpecialityNotFoundException(String code) {
        super("Speciality not found "+code);
    }
}
