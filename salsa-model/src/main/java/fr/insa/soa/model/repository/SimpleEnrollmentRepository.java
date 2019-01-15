package fr.insa.soa.model.repository;

import fr.insa.soa.model.entities.SimpleEnrolment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SimpleEnrolmentRepository extends JpaRepository<SimpleEnrolment, Long> {
    Optional<SimpleEnrolment> findById(Long id);
}


