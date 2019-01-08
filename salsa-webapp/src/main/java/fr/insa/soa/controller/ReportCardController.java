package fr.insa.soa.controller;

import fr.insa.soa.model.entities.ReportCard;
import fr.insa.soa.model.exception.ReportCardNotFoundException;
import fr.insa.soa.model.repository.ReportCardRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reportCard")
public class ReportCardController {

    private final ReportCardRepository reportCardRepository;

    ReportCardController(ReportCardRepository reportCardRepository){
        this.reportCardRepository = reportCardRepository;
    }


    @PutMapping("/add")
    public ReportCard add(@RequestBody ReportCard reportCard) {
        return reportCardRepository.saveAndFlush(reportCard);
    }

    @GetMapping
    public List<ReportCard> all() {
        return reportCardRepository.findAll();
    }

    @GetMapping("/{id}")
    public ReportCard reportCard(@PathVariable("id") Long id) {
        return reportCardRepository.findById(id).orElseThrow(() ->
                new ReportCardNotFoundException(id)
        );
    }

}