package fr.insa.soa.model.repository;

import fr.insa.soa.model.entities.Difficulty;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface DifficultyRepository extends JpaRepository<Difficulty, Long> {
    Optional<Difficulty> findById(Long id);
}
