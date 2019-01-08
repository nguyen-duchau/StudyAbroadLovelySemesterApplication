package fr.insa.soa.controller;

import fr.insa.soa.model.entities.Enrolment;
import fr.insa.soa.model.exception.EnrolmentNotFoundException;
import fr.insa.soa.model.repository.EnrolmentRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/enrolment")
public class EnrolmentController {

    private final EnrolmentRepository enrolmentRepository;

    EnrolmentController(EnrolmentRepository enrolmentRepository){
        this.enrolmentRepository= enrolmentRepository;
    }

    @PutMapping("/add")
    public Enrolment add(@RequestBody Enrolment enrolment) {
        return enrolmentRepository.saveAndFlush(enrolment);
    }

    @GetMapping("/{id}")
    public Enrolment findId(@PathVariable("id") Long id) {
        return enrolmentRepository.findById(id).orElseThrow(() ->
                new EnrolmentNotFoundException(id)
        );
    }

    @GetMapping
    public List<Enrolment> all() {return enrolmentRepository.findAll();
    }
}
