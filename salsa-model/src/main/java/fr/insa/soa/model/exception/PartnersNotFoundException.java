package fr.insa.soa.model.exception;

public class PartnersNotFoundException extends RuntimeException {

    public PartnersNotFoundException(String name) {
        super("Partner not found "+ name);
    }

}
