package fr.insa.soa.controller;


import fr.insa.soa.model.entities.SimpleEnrollment;
import fr.insa.soa.model.repository.SimpleEnrollmentRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/simpleEnrolment")
public class SimpleEnrollmentController {

    private final SimpleEnrollmentRepository simpleEnrollmentRepository;

    public SimpleEnrollmentController(SimpleEnrollmentRepository simpleEnrollmentRepository){
        this.simpleEnrollmentRepository=simpleEnrollmentRepository;
    }

    @GetMapping
    public List<SimpleEnrollment> all() {
        return simpleEnrollmentRepository.findAll();
    }
}
