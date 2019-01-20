package fr.insa.soa.model.exception;

public class ReportCardNotFoundException extends RuntimeException {

    public ReportCardNotFoundException(Long code) {
        super("Report Card of code: "+code+" not found ");
    }
}