package fr.insa.soa.model.exception;

public class ReportCardNotFoundException extends RuntimeException {

    public ReportCardNotFoundException(Long code) {
        super("Report Card not found "+code);
    }
}