package fr.insa.soa.controller;

import fr.insa.soa.model.entities.University;
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

    @PutMapping("/add")
    public University add(@RequestBody University university) {
        return universityRepository.saveAndFlush(university);
    }

    @GetMapping("/{name}")
    public University findName(@PathVariable("name") String name) {
        return universityRepository.findByName(name).orElseThrow(() ->
                new UniversityNotFoundException(name)
        );
    }

    @GetMapping
    public List<University> all() {return universityRepository.findAll();
    }

    @GetMapping("/success")
    public String success() {
        return "Yo, this one is gooood";
    }
}
