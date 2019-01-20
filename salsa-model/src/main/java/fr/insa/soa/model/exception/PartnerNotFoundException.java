package fr.insa.soa.model.exception;

public class PartnerNotFoundException extends RuntimeException {

    public PartnerNotFoundException(String partnerName) {
        super("No partner of name "+ partnerName+" found");
    }
}