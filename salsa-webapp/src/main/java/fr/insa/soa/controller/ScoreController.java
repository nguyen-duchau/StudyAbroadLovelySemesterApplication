package fr.insa.soa.controller;

import fr.insa.soa.model.entities.Score;
import fr.insa.soa.model.exception.ScoreNotFoundException;
import fr.insa.soa.model.repository.ScoreRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/score")
public class ScoreController {

    private final ScoreRepository scoreRepository;

    ScoreController(ScoreRepository scoreRepository){
        this.scoreRepository = scoreRepository;
    }

    @GetMapping
    public List<Score> getAll() {
        return scoreRepository.findAll();
    }

    @GetMapping("/{id}")
    public Score get(@PathVariable("id") Long id) {
        return scoreRepository.findById(id).orElseThrow(() ->
                new ScoreNotFoundException(id)
        );
    }

    @PutMapping
    public Score add(@RequestBody Score score) {
        return scoreRepository.saveAndFlush(score);
    }
}
