package fr.insa.soa.controller;


import fr.insa.soa.model.entities.SimpleEnrolment;
import fr.insa.soa.model.repository.SimpleEnrolmentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/simpleEnrolment")
public class SimpleEnrolmentController {

    private final SimpleEnrolmentRepository simpleEnrolmentRepository;

    public SimpleEnrolmentController(SimpleEnrolmentRepository simpleEnrolmentRepository){
        this.simpleEnrolmentRepository=simpleEnrolmentRepository;
    }

    @GetMapping
    public List<SimpleEnrolment> all() {
        return simpleEnrolmentRepository.findAll();
    }
}
