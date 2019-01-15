package fr.insa.soa.controller;

import fr.insa.soa.model.entities.Speciality;
import fr.insa.soa.model.entities.Student;
import fr.insa.soa.model.exception.SpecialityNotFoundException;
import fr.insa.soa.model.repository.SpecialityRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/speciality")
public class SpecialityController {

    private SpecialityRepository specialityRepository;

    SpecialityController(SpecialityRepository specialityRepository){
        this.specialityRepository = specialityRepository;
    }

    @PutMapping("/add")
    public Speciality add(@RequestBody Speciality speciality) {
        return specialityRepository.saveAndFlush(speciality);
    }

    @PutMapping("/add/{code}/{department}")
    public Speciality add_with_parameters(@PathVariable("code") String code, @PathVariable("department") String department){
        Speciality speciality= new Speciality(code,department);
        return specialityRepository.saveAndFlush(speciality);
    }

    @GetMapping
    public List<Speciality> all() {
        return specialityRepository.findAll();
    }

    @GetMapping("/{code}")
    public Speciality reportCard(@PathVariable("code") String code) {
        return specialityRepository.findByCode(code).orElseThrow(() ->
                new SpecialityNotFoundException(code)
        );
    }

}
