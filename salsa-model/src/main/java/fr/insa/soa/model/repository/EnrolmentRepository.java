package fr.insa.soa.model.repository;

import fr.insa.soa.model.bean.Enrolment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface EnrolmentRepository extends JpaRepository<Enrolment, Long> {
    Optional<Enrolment> findById(Long id);
}
