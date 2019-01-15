package fr.insa.soa.model.repository;

import fr.insa.soa.model.entities.YearEnrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface YearEnrollmentRepository extends JpaRepository<YearEnrollment, String> {
    Optional<YearEnrollment> findYearEnrollmentById(String id);

}
