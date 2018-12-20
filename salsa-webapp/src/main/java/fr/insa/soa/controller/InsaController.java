package fr.insa.soa.controller;

import fr.insa.soa.model.bean.University;
import fr.insa.soa.model.repository.UniversityRepository;
import fr.insa.soa.model.exception.UniversityNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/insa")
public class InsaController {

    private final UniversityRepository universityRepository;

    public InsaController(UniversityRepository universityRepository){
        this.universityRepository = universityRepository;
    }

    @PutMapping
    public University add(@RequestBody University university) {
        return universityRepository.saveAndFlush(university);
    }

    @PostMapping("/name")
    public University findName(@RequestBody String name) {
        return universityRepository.findByName(name).orElseThrow(() ->
                new UniversityNotFoundException(name)
        );
    }

    @GetMapping("/all")
    public List<University> all() {return universityRepository.findAll();
    }

    @GetMapping("/success")
    public String success() {
        return "Yo, this one is gooood";
    }
}
