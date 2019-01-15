package fr.insa.soa.controller;

import fr.insa.soa.model.entities.Enrollment;
import fr.insa.soa.model.exception.EnrollmentNotFoundException;
import fr.insa.soa.model.repository.EnrollmentRepository;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/enrolment")
public class EnrolmentController {

    private final EnrollmentRepository enrolmentRepository;

    EnrolmentController(EnrollmentRepository enrolmentRepository){
        this.enrolmentRepository= enrolmentRepository;
    }

    @PutMapping("/add")
    public Enrollment add(@RequestBody Enrollment enrolment) {
        return enrolmentRepository.saveAndFlush(enrolment);
    }


    @GetMapping("/{id}")
    public Enrollment findId(@PathVariable("id") Long id) {
        return enrolmentRepository.findById(id).orElseThrow(() ->
                new EnrollmentNotFoundException(id)
        );
    }

    @GetMapping
    public List<Enrollment> all() {return enrolmentRepository.findAll();
    }
}
