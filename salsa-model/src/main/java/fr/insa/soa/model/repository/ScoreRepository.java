package fr.insa.soa.model.repository;

import fr.insa.soa.model.bean.Score;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ScoreRepository extends JpaRepository<Score, Long> {

    Optional<Score> findById(Long id);
}
