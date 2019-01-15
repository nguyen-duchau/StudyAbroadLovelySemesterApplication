package fr.insa.soa.controller;

import fr.insa.soa.model.entities.YearEnrollment;
import fr.insa.soa.model.repository.YearEnrollmentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/yearEnrolment")
public class YearEnrolmentController {

    private final YearEnrollmentRepository yearEnrolmentRepository;

    public YearEnrolmentController(YearEnrollmentRepository yearEnrolmentRepository){
        this.yearEnrolmentRepository=yearEnrolmentRepository;
    }

    @GetMapping()
    public List<YearEnrollment> allYearEnrolment() {
        return yearEnrolmentRepository.findAll();
    }

    @PutMapping("/add")
    public YearEnrollment add(@RequestBody YearEnrollment yearEnrolment) {
        return yearEnrolmentRepository.saveAndFlush(yearEnrolment);
    }

}
