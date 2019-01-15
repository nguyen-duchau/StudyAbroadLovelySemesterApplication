package fr.insa.soa.model.repository;

import fr.insa.soa.model.entities.SimpleEnrollment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SimpleEnrollmentRepository extends JpaRepository<SimpleEnrollment, Long> {
    Optional<SimpleEnrollment> findById(Long id);
}


