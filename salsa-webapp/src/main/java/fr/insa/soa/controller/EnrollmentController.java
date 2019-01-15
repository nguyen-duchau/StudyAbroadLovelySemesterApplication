package fr.insa.soa.controller;

import fr.insa.soa.model.entities.Enrollment;
import fr.insa.soa.model.exception.EnrollmentNotFoundException;
import fr.insa.soa.model.repository.EnrollmentRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/enrollment")
public class EnrollmentController {

    private final EnrollmentRepository enrollmentRepository;

    EnrollmentController(EnrollmentRepository enrollmentRepository){
        this.enrollmentRepository = enrollmentRepository;
    }

    @PutMapping("/add")
    public Enrollment add(@RequestBody Enrollment enrollment) {
        return enrollmentRepository.saveAndFlush(enrollment);
    }

    @GetMapping("/{id}")
    public Enrollment findId(@PathVariable("id") Long id) {
        return enrollmentRepository.findById(id).orElseThrow(() ->
                new EnrollmentNotFoundException(id)
        );
    }

    @GetMapping
    public List<Enrollment> all() {return enrollmentRepository.findAll();
    }
}
