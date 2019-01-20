package fr.insa.soa.controller;

import fr.insa.soa.model.entities.YearEnrollment;
import fr.insa.soa.model.repository.YearEnrollmentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/year_enrollment")
public class YearEnrollmentController {

    private final YearEnrollmentRepository yearEnrollmentRepository;

    public YearEnrollmentController(YearEnrollmentRepository yearEnrollmentRepository){
        this.yearEnrollmentRepository=yearEnrollmentRepository;
    }

    @GetMapping
    public List<YearEnrollment> allYearEnrollment() {
        return yearEnrollmentRepository.findAll();
    }

    @PutMapping
    public YearEnrollment add(@RequestBody YearEnrollment yearEnrollment) {
        return yearEnrollmentRepository.saveAndFlush(yearEnrollment);
    }
}
