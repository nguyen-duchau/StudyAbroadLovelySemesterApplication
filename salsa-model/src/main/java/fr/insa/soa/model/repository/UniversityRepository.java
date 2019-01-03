package fr.insa.soa.model.repository;

import fr.insa.soa.model.entities.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UniversityRepository extends JpaRepository<University, String> {
    Optional<University> findByName (String name);
}


