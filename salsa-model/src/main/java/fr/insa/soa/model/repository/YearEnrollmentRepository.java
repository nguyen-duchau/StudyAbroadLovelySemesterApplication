package fr.insa.soa.model.repository;

import fr.insa.soa.model.entities.YearEnrolment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface YearEnrollmentRepository extends JpaRepository<YearEnrolment, String> {
    Optional<YearEnrolment> findYearEnrolmentById(String id);

}
