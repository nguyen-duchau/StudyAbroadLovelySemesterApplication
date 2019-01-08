package fr.insa.soa.controller;

import fr.insa.soa.model.entities.Difficulty;
import fr.insa.soa.model.exception.DifficultyNotFoundException;
import fr.insa.soa.model.repository.DifficultyRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/difficulty")
public class DifficultyController {

    private final DifficultyRepository difficultyRepository;

    DifficultyController(DifficultyRepository difficultyRepository){
        this.difficultyRepository= difficultyRepository;
    }

    @GetMapping
    public List<Difficulty> getAll() {
        return difficultyRepository.findAll();
    }

    @GetMapping("/{id}")
    public Difficulty get(@PathVariable("id") Long id) {
        return difficultyRepository.findById(id).orElseThrow(() ->
                new DifficultyNotFoundException(id)
        );
    }

    @PutMapping("/add")
    public Difficulty add(@RequestBody Difficulty difficulty) {
        return difficultyRepository.save(difficulty);
    }

}
