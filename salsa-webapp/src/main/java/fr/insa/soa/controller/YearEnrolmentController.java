package fr.insa.soa.controller;

import fr.insa.soa.model.entities.YearEnrolment;
import fr.insa.soa.model.repository.YearEnrolmentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/yearEnrolment")
public class YearEnrolmentController {

    private final YearEnrolmentRepository yearEnrolmentRepository;

    public YearEnrolmentController(YearEnrolmentRepository yearEnrolmentRepository){
        this.yearEnrolmentRepository=yearEnrolmentRepository;
    }

    @GetMapping()
    public List<YearEnrolment> allYearEnrolment() {
        return yearEnrolmentRepository.findAll();
    }

    @PutMapping("/add")
    public YearEnrolment add(@RequestBody YearEnrolment yearEnrolment) {
        return yearEnrolmentRepository.saveAndFlush(yearEnrolment);
    }

}
